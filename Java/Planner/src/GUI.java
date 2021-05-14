import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * Eine simple planner-app. Die App enthält ein Hauptfenster
 * wo die Aufgaben in einer Tabelle angezeigt werden.
 * <p>
 * Wenn man auf den Knopf Standpunkt drückt erweitert sich der Fortschritt um 1%.
 * Skizze:
 * +---------------------------------------------+
 * |    Aufgabe         |       Standpunkt       |
 * +---------------------------------------------+
 * |    Aufgabe         |       Standpunkt       |
 * +---------------------------------------------+
 * |    Aufgabe         |       Standpunkt       |
 * +---------------------------------------------+
 * |    Aufgabe         |       Standpunkt       |
 * +---------------------------------------------+
 * |-------------Aufgabe hinzufügen--------------|
 * +---------------------------------------------+
 */

public class GUI extends JFrame {

    //declare variables
    TableModel model;
    JTable table;
    JButton addButton;
    JDialog adderFrame;

    public GUI() {

        init();
        addListener();
    }

    public void init() {
        model = new TableModel();
        table = new JTable(model);
        addButton = new JButton("ADD");
        getContentPane().add(table, BorderLayout.NORTH);
        getContentPane().add(addButton, BorderLayout.SOUTH);
        setIconImage(new ImageIcon("icon.png").getImage());
        setTitle("Shrate Tasks");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);
    }

    public void addListener() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialog d = new Dialog();
                model.addRow(d.getEntry()[0],d.getEntry()[1]);
                

            }
        });
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}

class Dialog extends JDialog{
    JPanel mainPanel;
    JPanel instructionPanel;
    JTextField instruction;
    JTextField name;
    JTextField goal;
    JButton button;
    String[] entry;

    public Dialog(){
        init();
        addListener();
    }

    public void init(){
        mainPanel = new JPanel();
        instructionPanel = new JPanel();
        instruction = new JTextField("Erfassen sie Ihre neue Aufgabe.");
        name = new JTextField();
        goal = new JTextField();
        button = new JButton("SAVE");
        entry = new String[2];

        instructionPanel.setBackground(new Color(76, 121, 144));
        mainPanel.setBackground(new Color(76, 121, 144));
        mainPanel.setSize(300,300);
        instruction.setEditable(false);
        instruction.setBackground(new Color(76, 121, 144));
        name.setColumns(20);
        goal.setColumns(20);
        this.setVisible(true);
        this.setTitle("Neue Aufgabe");

        instructionPanel.add(instruction);
        mainPanel.add(name);
        mainPanel.add(goal);
        mainPanel.add(button);
        this.getContentPane().add(instructionPanel,BorderLayout.NORTH);
        this.getContentPane().add(mainPanel,BorderLayout.SOUTH);
        pack();

    }

    public void  addListener(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry[0]=name.getText();
                entry[1]=goal.getText();
                setVisible(false);
            }
        });
    }

    public String[] getEntry(){
        return entry;
    }
}



class TableModel extends AbstractTableModel {

    protected Vector<Task> dataVector;

    public TableModel() {
        dataVector = new Vector<Task>();
        dataVector.add(new Task("Muster 1", 100));
        dataVector.add(new Task("Muster 2", 400));
        dataVector.add(new Task("Muster 3", 1200));
    }

    @Override
    public int getRowCount() {
        return dataVector.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dataVector.get(rowIndex).getAt(columnIndex);
    }

    public void addRow(String name,String goal){
        dataVector.add(new Task(name,Integer.parseInt(goal)));
    }
}
