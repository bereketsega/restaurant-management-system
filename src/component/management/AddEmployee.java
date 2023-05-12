package component.management;

import javax.swing.*;
import service.EmployeeService;
public class AddEmployee extends javax.swing.JFrame {

    private final EmployeeService employeeService;

    /**
     * Creates new form InsertEmployee
     */
    public AddEmployee() {
        initComponents();
        this.employeeService = new EmployeeService();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlabel6 = new javax.swing.JLabel();
        EmployeeIdField = new javax.swing.JTextField();
        EmployeeFNameField = new javax.swing.JTextField();
        EmployeeLNameField = new javax.swing.JTextField();
        EmployeePhoneNumberField = new javax.swing.JTextField();
        EmployeeSocialSecurityNumberField = new javax.swing.JTextField();
        EmployeeTypeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Employee ID");
        jLabel2.setText("Employee First Name");
        jLabel3.setText("Employee Last Name");
        jLabel4.setText("Employee Phone Number");
        jLabel5.setText("Social Security Number");
        jlabel6.setText("Employee Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10) // left
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jlabel6))
                .addGap(10, 10, 10) // left
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(EmployeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeFNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeLNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeePhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeSocialSecurityNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)) // right
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10) // left
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10) // left
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)) // right
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10) // top
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(EmployeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10) // top
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(EmployeeFNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10) // top
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(EmployeeLNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10) // top
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(EmployeePhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10) // top
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(EmployeeSocialSecurityNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10) // top
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlabel6)
                    .addComponent(EmployeeTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10) // top
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)) // bottom
        );

        pack();
        setLocationRelativeTo(null);

    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String id = EmployeeIdField.getText();
        String fname = EmployeeFNameField.getText();
        String lname = EmployeeLNameField.getText();
        String phone = EmployeePhoneNumberField.getText();
        String ssn = EmployeeSocialSecurityNumberField.getText();
        String type = EmployeeTypeField.getText();

        // check if fields are empty
        if (id.isEmpty() || fname.isEmpty() || lname.isEmpty() || phone.isEmpty() || ssn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field(s) cannot be empty");
            return;
        }

        // check if type is chef or waiter
        if (!type.equals("chef") && !type.equals("waiter")) {
            JOptionPane.showMessageDialog(this, "Type must be chef or waiter");
            return;
        } else {
            boolean success;
            if (type.equals("chef")) {
                success = employeeService.createChef(id, fname, lname, phone);
            } else {
                success = employeeService.createWaiter(id, fname, lname, phone, ssn);
            }
            if (!success) {
                JOptionPane.showMessageDialog(this, "Something went wrong. Please try again.");
                return;
            }
        }


        JOptionPane.showMessageDialog(this, "Employee has been added");

        // Reset input fields
        EmployeeIdField.setText("");
        EmployeeFNameField.setText("");
        EmployeeLNameField.setText("");
        EmployeePhoneNumberField.setText("");
        EmployeeSocialSecurityNumberField.setText("");
        EmployeeTypeField.setText("");

    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        EmployeeManagement lb = new EmployeeManagement();
        lb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AddEmployee().setVisible(true);
        });
    }
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JTextField EmployeeIdField;
    private javax.swing.JTextField EmployeeFNameField;
    private javax.swing.JTextField EmployeeLNameField;
    private javax.swing.JTextField EmployeeSocialSecurityNumberField;
    private javax.swing.JTextField EmployeePhoneNumberField;
    private javax.swing.JTextField EmployeeTypeField;
}