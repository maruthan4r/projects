import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    //init
    JPanel tasksPanel;
    Task example;
    JPanel addButtonPanel;
    JButton addButton;
    AddDialog dialog;
    JPanel addPanel;

    public GUI(){

        dialog = new AddDialog();
        tasksPanel = new JPanel();
        addPanel = dialog.getTopMainPanel();
        addButtonPanel = new JPanel();
        addButton = new JButton("ADD");
        example = new Task("Aufgabe",10);
        dialog.setVisible(false);


        this.getContentPane().add(tasksPanel,BorderLayout.NORTH);
        this.getContentPane().add(addButtonPanel,BorderLayout.SOUTH);
        this.getContentPane().add(addPanel,BorderLayout.CENTER);
        this.addTask(example);
        this.setTitle("Shrate Planner");
        addButtonPanel.add(addButton,BorderLayout.CENTER);
        tasksPanel.setBackground(new Color(194, 231, 214));
        addPanel.setBackground(new Color(194, 231, 214));
        addButtonPanel.setBackground(new Color(194, 231, 214));
        this.pack();
        this.setVisible(true);
        addListener();
    }

    public void addListener(){
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask(new Task("SAHBEEE",1000));

            }
        });
    }
    public void addTask(Task task){
        tasksPanel.add(task,BorderLayout.SOUTH);
    }
}
