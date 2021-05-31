import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;
import java.util.Random;
import java.util.Vector;
import java.util.function.BiPredicate;

/**
 * A simple planner app, built by community.
 */
public class Main {
    public static void main(String[] args) {
        PlannerGUI mainframe = new PlannerGUI();
    }
}

class PlannerGUI extends JFrame {
    JPanel topPanel;
    JPanel bottomPanel;
    JTable table;
    JButton addButton;
    JTextField entry;
    PlannerModel model;

    public PlannerGUI() {
        init();
        addListener();
    }

    public void init() {
        //START OF: CREATE SAMPLE BORDERS
        Border blackline, raisedetched, loweredetched, raisedbevel, loweredbevel, empty;
        blackline = BorderFactory.createLineBorder(new Color(255, 175, 12));
        raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
        loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        raisedbevel = BorderFactory.createRaisedBevelBorder();
        loweredbevel = BorderFactory.createLoweredBevelBorder();
        empty = BorderFactory.createEmptyBorder();
        //END OF: CREATE SAMPLE BORDERS


        model = new PlannerModel();
        topPanel = new JPanel();
        bottomPanel = new JPanel();
        table = new JTable(model);
        addButton = new JButton("Add");
        entry = new JTextField("", 30);
        table.getColumnModel().getColumn(0).setPreferredWidth(300);


        //Design (Colors,Borders)
        table.setBackground(new Color(255, 175, 12));
        entry.setBackground(new Color(255, 175, 12));
        addButton.setBackground(new Color(255, 175, 12));
        topPanel.setBackground(new Color(3, 130, 130));
        bottomPanel.setBackground(new Color(3, 130, 130));
        table.setBorder(blackline);
        entry.setBorder(blackline);


        this.getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        topPanel.add(table);
        bottomPanel.add(entry, BorderLayout.NORTH);
        bottomPanel.add(addButton, BorderLayout.SOUTH);
        setResizable(false);
        setTitle("Shrate Planner");
        setVisible(true);
        pack();


    }

    public void addListener() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Add Button pressed");
                System.out.println(entry.getText());
                if (entry.getText().length() != 0) {
                    model.addRow(new Task(entry.getText(), 100));
                    model.fireTableDataChanged();
                    pack();
                }
            }
        });
        table.getModel().addTableModelListener(new TableModelListener() {

            public void tableChanged(TableModelEvent e) {
                // your code goes here, whatever you want to do when something changes in the table
                System.out.println("Table changed");
                addButton.setBackground(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
            }
        });

    }

}

class Task {
    String name;
    int current_status;
    int goal;

    public Task() {
        name = "null";
        current_status = 0;
        goal = 100;
    }

    public Task(String name, int goal) {
        this.name = name;
        this.goal = goal;
        current_status = 0;

    }


    public String getName() {
        return name;
    }

    public int getCurrent_status() {
        return current_status;
    }

    public int getGoal() {
        return goal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrent_status(int current_status) {
        this.current_status = current_status;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public String getAt(int index) {
        if (index == 0) {
            return name;
        }
        if (index == 1) {
            return Integer.toString(goal);
        } else return Integer.toString(current_status);
    }
}

class PlannerModel extends AbstractTableModel {
    Vector<Task> data;
    final String[] COLUMN_NAMES = {"Aufgabe", "Ziel", "Standpunkt"};

    public PlannerModel() {
        data = new Vector<Task>();
        data.add(new Task("Aufgabe", 100));

    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex).getAt(columnIndex);
    }

    public void addRow(Task t) {
        data.add(t);
        this.fireTableDataChanged();

    }

    @Override
    public String getColumnName(int column) {

        return COLUMN_NAMES[column];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }
}

