import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel yellowPanel = new JPanel();
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("angry.png");
        JLabel label = new JLabel();

        label.setIcon(image);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setText("Hello What are doing?");
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0,250,500,250);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redPanel.setLayout(new BorderLayout()); //BorderLayout == Jframe default layout, JPanel default layout = flowlayout : every element ist top and centered

        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(yellowPanel);

    }
}
