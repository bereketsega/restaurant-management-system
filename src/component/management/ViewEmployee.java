package component.management;

import service.EmployeeService;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Arrays;

public class ViewEmployee extends javax.swing.JFrame{

    // create tables for each employee type


    JTable waiterTable;
    JTable chefTable;

    private final EmployeeService employeeService;

    public ViewEmployee(){
        this.employeeService = new EmployeeService();
        initComponents();
    }

    public void initComponents() {
        waiterTable = new JTable();
        chefTable = new JTable();
        JTableHeader header = waiterTable.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));
        header = chefTable.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 12));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        System.out.println(Arrays.deepToString(employeeService.getWaiters()));
        waiterTable.setModel(new javax.swing.table.DefaultTableModel(
                employeeService.getWaiters(),
                new String [] {
                        "Waiter ID", "First Name", "Last Name", "SSN", "Phone Number"
                }
        ));
        chefTable.setModel(new javax.swing.table.DefaultTableModel(
                employeeService.getChefs(),
                new String [] {
                        "Chef ID", "First Name", "Last Name", "Phone Number"
                }
        ));

        // set table properties
        waiterTable.setRowHeight(30);
        waiterTable.setRowMargin(10);
        waiterTable.setRowSelectionAllowed(false);
        waiterTable.setShowGrid(true);
        waiterTable.setGridColor(Color.BLACK);
        waiterTable.setShowVerticalLines(true);
        waiterTable.setShowHorizontalLines(true);

        chefTable.setRowHeight(30);
        chefTable.setRowMargin(10);
        chefTable.setRowSelectionAllowed(false);
        chefTable.setShowGrid(true);
        chefTable.setGridColor(Color.BLACK);
        chefTable.setShowVerticalLines(true);
        chefTable.setShowHorizontalLines(true);

        // set table scroll panes
        JScrollPane waiterScrollPane = new JScrollPane(waiterTable);
        JScrollPane chefScrollPane = new JScrollPane(chefTable);

        // set table scroll pane properties
        waiterScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        waiterScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        chefScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        chefScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // set table scroll pane bounds
        waiterScrollPane.setBounds(50, 50, 700, 200);
        chefScrollPane.setBounds(50, 300, 700, 200);

        // create text fields and labels
        JLabel waiterLabel = new JLabel("Waiters");
        JLabel chefLabel = new JLabel("Chefs");

        // set text field and label properties
        waiterLabel.setBounds(50, 20, 100, 30);
        chefLabel.setBounds(50, 270, 100, 30);

        // set text field and label font
        waiterLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        chefLabel.setFont(new Font("Tahoma", Font.BOLD, 16));

        // add components to frame
        add(waiterLabel);
        add(chefLabel);

        add(waiterScrollPane);
        add(chefScrollPane);

        // set frame properties
        setTitle("View Employees");
        setSize(800, 600);
        setLayout(null);
        setVisible(true);

        // set frame background color
        getContentPane().setBackground(new java.awt.Color(255, 251, 248));

        // set frame close operation
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

    }
}
