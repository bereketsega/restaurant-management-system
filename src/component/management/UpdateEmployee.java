package component.management;

import service.EmployeeService;

import javax.swing.*;

public class UpdateEmployee extends javax.swing.JFrame{
    JLabel employeeIdLabel;
    JTextField employeeIdField;
    JLabel employeeFirstNameLabel;
    JTextField employeeFirstNameField;
    JLabel employeeLastNameLabel;
    JTextField employeeLastNameField;
    JLabel employeeSSNLabel;
    JTextField employeeSSNField;
    JLabel employeePhoneNumberLabel;
    JTextField employeePhoneNumberField;
    JLabel employeeTypeLabel;
    JTextField employeeTypeField;
    JButton updateButton;
    JButton backButton;

    private final EmployeeService employeeService;

    public UpdateEmployee(){
        this.employeeService = new EmployeeService();
        initComponents();
    }

    public void initComponents() {
        employeeIdLabel = new JLabel();
        employeeIdField = new JTextField();
        employeeFirstNameLabel = new JLabel();
        employeeFirstNameField = new JTextField();
        employeeLastNameLabel = new JLabel();
        employeeLastNameField = new JTextField();
        employeeSSNLabel = new JLabel();
        employeeSSNField = new JTextField();
        employeePhoneNumberLabel = new JLabel();
        employeePhoneNumberField = new JTextField();
        employeeTypeLabel = new JLabel();
        employeeTypeField = new JTextField();
        updateButton = new JButton();
        backButton = new JButton();

        // set properties for the input fields
        employeeIdLabel.setText("Employee ID");
        employeeIdField.setText("");
        employeeFirstNameLabel.setText("First Name");
        employeeFirstNameField.setText("");
        employeeLastNameLabel.setText("Last Name");
        employeeLastNameField.setText("");
        employeeSSNLabel.setText("SSN");
        employeeSSNField.setText("");
        employeePhoneNumberLabel.setText("Phone Number");
        employeePhoneNumberField.setText("");
        employeeTypeLabel.setText("Employee Type");
        employeeTypeField.setText("");
        updateButton.setText("Update");
        backButton.setText("Back");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
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
                                                .addComponent(employeeFirstNameLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeeFirstNameField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(employeeLastNameLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeeLastNameField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(employeeSSNLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeeSSNField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(employeePhoneNumberLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeePhoneNumberField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(employeeTypeLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeeTypeField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(updateButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(backButton)))));

        // set the vertical layout
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeeIdLabel)
                                        .addComponent(employeeIdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeeFirstNameLabel)
                                        .addComponent(employeeFirstNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeeLastNameLabel)
                                        .addComponent(employeeLastNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeeSSNLabel)
                                        .addComponent(employeeSSNField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeePhoneNumberLabel)
                                        .addComponent(employeePhoneNumberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeeTypeLabel)
                                        .addComponent(employeeTypeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(updateButton)
                                        .addComponent(backButton)))
        );

        // pack the screen
        pack();
        // set the screen in the middle of the screen
        setLocationRelativeTo(null);
    }
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Update button pressed");
        String employeeId = employeeIdField.getText();
        String employeeFirstName = employeeFirstNameField.getText();
        String employeeLastName = employeeLastNameField.getText();
        String employeeSSN = employeeSSNField.getText();
        String employeePhoneNumber = employeePhoneNumberField.getText();
        String employeeType = employeeTypeField.getText();

        if (employeeIdField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee id cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!employeeType.equals("waiter") && !employeeType.equals("chef")) {// show an error message
            JOptionPane.showMessageDialog(null, "Employee type must be either waiter or chef", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            boolean success = false;
            if (employeeType.equals("waiter")) {
                if (!employeeFirstName.equals("")) {
                    success=employeeService.updateWaiterFirstName(String.valueOf(employeeId), employeeFirstName);
                }
                if (!employeeLastName.equals("")) {
                    success=employeeService.updateWaiterLastName(employeeId, employeeLastName);
                }
                if (!employeeSSN.equals("")) {
                    success=employeeService.updateWaiterSSN(employeeId, employeeSSN);
                }
                if (!employeePhoneNumber.equals("")) {
                    success=employeeService.updateWaiterPhoneNumber(employeeId, employeePhoneNumber);
                }
                if (success){
                    JOptionPane.showMessageDialog(null, "Update successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "Update failed", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                if (!employeeFirstName.equals("")) {
                    success=employeeService.updateChefFirstName(employeeId, employeeFirstName);
                }
                if (!employeeLastName.equals("")) {
                    success=employeeService.updateChefLastName(employeeId, employeeLastName);
                }
                if (!employeePhoneNumber.equals("")) {
                    success=employeeService.updateChefPhoneNumber(employeeId, employeePhoneNumber);
                }
                if (success){
                    JOptionPane.showMessageDialog(null, "Update successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "Update failed", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        EmployeeManagement employeeManagementScreen = new EmployeeManagement();
        employeeManagementScreen.setVisible(true);
        this.dispose();
    }
}
