package component.management;

import service.EmployeeService;

import javax.swing.*;

public class DeleteEmployee extends  javax.swing.JFrame{
    JLabel employeeIdLabel;
    JTextField employeeIdField;
    JLabel employeeTypeLabel;
    JTextField employeeTypeField;
    JButton deleteButton;
    JButton backButton;
    private final EmployeeService employeeService;

    public DeleteEmployee(){
        this.employeeService = new EmployeeService();
        initComponents();
    }

    private void initComponents() {
        employeeIdLabel = new JLabel();
        employeeIdField = new JTextField();
        employeeTypeLabel = new JLabel();
        employeeTypeField = new JTextField();
        deleteButton = new JButton();
        backButton = new JButton();

        // set properties for the input fields
        employeeIdLabel.setText("Employee ID");
        employeeIdField.setText("");
        employeeTypeLabel.setText("Employee Type");
        employeeTypeField.setText("");
        deleteButton.setText("Delete");
        backButton.setText("Back");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        // set the layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // set the horizontal layout
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(employeeIdLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeeIdField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(employeeTypeLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeeTypeField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(deleteButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(backButton)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        // set the vertical layout
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(employeeIdLabel)
                                        .addComponent(employeeIdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(employeeTypeLabel)
                                        .addComponent(employeeTypeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(deleteButton)
                                        .addComponent(backButton))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setTitle("Delete Employee");
        setLocationRelativeTo(null);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String employeeId = employeeIdField.getText();
        String employeeType = employeeTypeField.getText();
        if(!employeeType.equals("waiter") && !employeeType.equals("chef")){
            JOptionPane.showMessageDialog(null, "Invalid employee type");
            return;
        } else {
            boolean success;
            if(employeeType.equals("waiter")) {
                success = employeeService.deleteWaiter(employeeId);
            } else {
                success = employeeService.deleteChef(employeeId);
            }
            if(success){
                JOptionPane.showMessageDialog(null, "Employee deleted successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Employee not found");
            }
        }
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new EmployeeManagement().setVisible(true);
    }
}
