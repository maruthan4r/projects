import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task extends JPanel {
    String name;
    int goal;
    JTextField nameField;
    JTextField goalField;
    JButton shrinkButton;

    public Task(String name, int goal) {
        this.name = name;
        this.goal = goal;
        shrinkButton = new JButton("MOVE ON");
        nameField = new JTextField(this.name);
        goalField = new JTextField(Integer.toString(this.goal));
        nameField.setEditable(false);
        nameField.setColumns(20);
        goalField.setEditable(false);
        goalField.setColumns(5);
        this.add(nameField, BorderLayout.WEST);
        this.add(goalField, BorderLayout.CENTER);
        this.add(shrinkButton, BorderLayout.EAST);
        nameField.setBackground(new Color(95, 154, 123));
        goalField.setBackground(new Color(95, 154, 123));
        shrinkButton.setBackground(new Color(112, 108, 172));
        setBackground(new Color(95, 154, 123));
        nameField.setBorder(BorderFactory.createLineBorder(new Color(95, 154, 123)));
        goalField.setBorder(BorderFactory.createLineBorder(new Color(95, 154, 123)));
        shrinkButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());

        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setVisible(true);
        setSize(300, 100);
        addListener();
    }

    public void addListener() {
        shrinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (goal <= 0) {
                    goalField.setText("DONE");
                    goalField.setBackground(new Color(40, 121, 32));
                    shrinkButton.setEnabled(false);
                }
                if (goal > 0) {
                    goal = goal - 1;
                    goalField.setText(Integer.toString(goal));
                }
            }
        });
    }
}
