import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDialog extends JDialog {
    JPanel topMainPanel;
    JPanel bottomMainPanel;
    JPanel leftPanel;
    JPanel centerPanel;
    JPanel rightPanel;
    JTextField nameField;
    JTextField nameDescription;
    JTextField goalField;
    JTextField goalDescription;
    JButton submit;
    Boolean clicked;

    public AddDialog() {
        topMainPanel = new JPanel();
        bottomMainPanel = new JPanel();
        leftPanel = new JPanel();
        centerPanel = new JPanel();
        rightPanel = new JPanel();

        nameDescription = new JTextField("NAME:");
        nameDescription.setEditable(false);
        nameDescription.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        nameField = new JTextField(20);

        goalDescription = new JTextField("GOAL(f.E: 100,2,35,121341)");
        goalDescription.setEditable(false);
        goalDescription.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));






        goalField = new JTextField(20);

        submit = new JButton("ADD");

        leftPanel.add(nameDescription, BorderLayout.EAST);
        leftPanel.add(nameField, BorderLayout.WEST);
        centerPanel.add(goalDescription, BorderLayout.EAST);
        centerPanel.add(goalField, BorderLayout.WEST);


        topMainPanel.add(leftPanel, BorderLayout.WEST);
        topMainPanel.add(centerPanel, BorderLayout.CENTER);
        bottomMainPanel.add(submit, BorderLayout.CENTER);

        nameField.setBackground(new Color(194, 231, 214));
        nameDescription.setBackground(new Color(194, 231, 214));
        goalField.setBackground(new Color(194, 231, 214));
        goalDescription.setBackground(new Color(194, 231, 214));
        leftPanel.setBackground(new Color(194, 231, 214));
        centerPanel.setBackground(new Color(194, 231, 214));
        goalField.setBackground(new Color(194, 231, 214));
        leftPanel.setBackground(new Color(194, 231, 214));
        centerPanel.setBackground(new Color(194, 231, 214));
        this.getContentPane().add(topMainPanel, BorderLayout.NORTH);
        this.getContentPane().add(bottomMainPanel, BorderLayout.SOUTH);
        this.setTitle("Wow, you wanna do something new?");
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        addListener();
    }

    public void addListener() {
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                clicked = true;
            }
        });
    }

    public JPanel getTopMainPanel() {
        return topMainPanel;
    }

    public Boolean isClicked() {
        return clicked;
    }

    public String getNameField() {
        return nameField.getText();
    }

    public String getGoalField() {
        return goalField.getText();
    }

    public static void main(String[] args) {
        AddDialog addDialog = new AddDialog();
    }
}
