import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GUI {
    JFrame entry;
    JButton startButton;
    JPanel panel1;
    JPanel panel2;
    JTextArea textArea;

    public GUI() {
        init();
        addListener();
    }

    void init(){
        //Initialize
        entry = new JFrame();
        startButton = new JButton("Start");
        panel1 = new JPanel();
        panel2 = new JPanel();
        textArea = new JTextArea("Welcome to YourAssist");

        //design


        //adds
        entry.getContentPane().add(panel1, BorderLayout.NORTH);
        entry.getContentPane().add(panel2, BorderLayout.SOUTH);
        panel1.add(textArea);
        panel2.add(startButton);

        //settings
        entry.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        entry.setLocationRelativeTo(null);
        entry.setSize(500, 100);
        entry.setResizable(false);
        entry.setVisible(true);
        panel1.setSize(500, 50);
        panel1.setBackground(new Color(72, 122, 130));
        panel2.setSize(500, 50);
        panel2.setBackground(new Color(130, 124, 72));
        textArea.setEditable(false);
        textArea.setBorder(null);
        textArea.setBackground(new Color(72, 122, 130));

        // This font is < 35Kb.



    }

    void addListener() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(669);
            }
        });
    }


    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}