import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {



        JLabel label = new JLabel();
        ImageIcon image;
        image = new ImageIcon("brettholz.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);



        label.setText("Bro do you even code?");//sets text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.orange);
        label.setFont(new Font("CASTELLAR",Font.PLAIN,20));
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,500,250);


        //Frame implementation from last unit
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close
        //frame.setSize(500,500);//sets x and y dimension
        //frame.setLayout(null);
        frame.setVisible(true);//visibility
        frame.add(label);
        frame.pack();




    }


}
