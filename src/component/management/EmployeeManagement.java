package component.management;
import screens.home.Home;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeManagement extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeManagement
     */
    public EmployeeManagement() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        jPanel1 = new JPanel();
        addEmployee = new JButton();
        viewEmployee = new JButton();
        deleteEmployee = new JButton();
        updateEmployee = new JButton();
        jButton6 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new Color(255, 255, 255));

        jPanel1.setBackground(new Color(255, 250, 250));
        jPanel1.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel1.setForeground(new Color(253, 250, 241));

        addEmployee.setText("Add Employee");
        addEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        viewEmployee.setText("View Employee");
        viewEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                viewEmployeeActionPerformed(evt);
            }
        });

        deleteEmployee.setText("Remove Employee");
        deleteEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });

        updateEmployee.setText("Update Employee");
        updateEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateEmployeeActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(viewEmployee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addEmployee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteEmployee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updateEmployee, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addEmployee)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewEmployee)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteEmployee)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateEmployee, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton6.setText("Back");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(67, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addGap(71, 71, 71)))
                                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        AddEmployee ae = new AddEmployee();
        ae.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_addEmployeeActionPerformed

    private void viewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeeActionPerformed
        ViewEmployee ve = new ViewEmployee();
        ve.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_viewEmployeeActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        DeleteEmployee de = new DeleteEmployee();
        de.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteEmployeeActionPerformed

    private void updateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeActionPerformed
        UpdateEmployee ue = new UpdateEmployee();
        ue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateEmployeeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Home rm = new Home();
        rm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EmployeeManagement().setVisible(true);
        });
    }
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton updateEmployee;
    private javax.swing.JButton viewEmployee;
}
