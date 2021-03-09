import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setTitle("Jframe title goes here");//Title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close
        this.setResizable(false);//prevent from being resized
        this.setSize(420,420);//sets x and y dimension
        this.setVisible(true);//visibility

        this.getContentPane().setBackground(new Color(123,50,250));


    }
}
