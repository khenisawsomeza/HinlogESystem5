/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hinlogesystem;

import static com.mycompany.hinlogesystem.HinlogESystem.st;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TeachersForm extends javax.swing.JFrame {

    public TeachersForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        teachAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        teachId = new javax.swing.JTextField();
        teachName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        teachEmail = new javax.swing.JTextField();
        teachDepartment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        teachContact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teachersTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        teachersSubjectsTable = new javax.swing.JTable();
        assignSubjectButton = new javax.swing.JButton();
        deleteSubjectButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("TEACHER REGISTRATION");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Teacher ID");

        teachAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Address");

        teachId.setEditable(false);
        teachId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        teachName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        teachEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        teachDepartment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Department");

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.setToolTipText("");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        teachContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Contact");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teachDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teachEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teachAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teachId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teachName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teachContact, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(teachId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teachName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teachAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teachContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teachEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teachDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        teachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Teacher ID", "Name", "Address", "Contact", "Email", "Department"
            }
        ));
        teachersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(teachersTable);

        teachersSubjectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Subject ID", "Units", "Code", "Decription", "Schedule"
            }
        ));
        jScrollPane2.setViewportView(teachersSubjectsTable);

        assignSubjectButton.setLabel("Assign Subject");
        assignSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignSubjectButtonActionPerformed(evt);
            }
        });

        deleteSubjectButton.setLabel("Delete Subject");
        deleteSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSubjectButtonActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(102, 204, 255));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(assignSubjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel7)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(assignSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Teachers teacher = new Teachers();
        
        int row = teachersTable.getSelectedRow();          
        int id = Integer.parseInt(teachersTable.getValueAt(row, 0).toString());
        String name = teachersTable.getValueAt(row, 1).toString();
        
        teacher.deleteRecord(id, name);
        showRecords();
        ShowAssignRec();
        resetFields();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
         Teachers teacher = new Teachers();
         teacher.saveRecord(teachName.getText(), teachAddress.getText(), teachContact.getText(), teachEmail.getText(), teachDepartment.getText());
         showRecords();
         resetFields();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Teachers teacher = new Teachers();
        teacher.updateRecord(Integer.valueOf(teachId.getText()), teachName.getText(), teachAddress.getText(), teachContact.getText(), teachEmail.getText(), teachDepartment.getText());
        showRecords();       
        resetFields();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void teachersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersTableMouseClicked
        int row = teachersTable.getSelectedRow(); 

        teachId.setText(teachersTable.getValueAt(row, 0).toString());
        teachName.setText(teachersTable.getValueAt(row, 1).toString());
        teachAddress.setText(teachersTable.getValueAt(row, 2).toString());
        teachContact.setText(teachersTable.getValueAt(row, 3).toString());
        teachEmail.setText(teachersTable.getValueAt(row, 4).toString());
        teachDepartment.setText(teachersTable.getValueAt(row, 5).toString());
        
        ShowAssignRec();
    }//GEN-LAST:event_teachersTableMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Teachers teacher = new Teachers();
        showRecords();
    }//GEN-LAST:event_formWindowOpened

    private void assignSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignSubjectButtonActionPerformed
        HinlogESystem system = new HinlogESystem();
        Assign assign = new Assign();
        int row = teachersTable.getSelectedRow();
        int subId = assign.getsubjid();           
        int teachId = Integer.parseInt(teachersTable.getValueAt(row, 0).toString());
        
        int response = JOptionPane.showConfirmDialog(null,"Assign Teacher ID:" + teachId + " to subject ID:" + subId,"Alert", JOptionPane.OK_CANCEL_OPTION);
        
        if (response == JOptionPane.YES_OPTION) {            
            try {
                String checkQuery = "SELECT * FROM Assign WHERE subid = " + subId;
                ResultSet rs = system.st.executeQuery(checkQuery);
                
                if (rs.next()){
                    JOptionPane.showMessageDialog(null,"This subject already has an assigned teacher","assign", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {
                        String query = assign.AssignSubj(teachId);
                        system.st.executeUpdate(query);
                        System.out.println("Insert Success");
                    } catch (Exception ex){
                        System.out.println("Failed to Assign: " + ex);
                    }
                    
                    JOptionPane.showMessageDialog(null, "Teacher " + teachId + " Assigned to " + subId, "assign", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex){
                System.out.println("Failed to Assign: " + ex);
            }
                
            
        } else if (response == JOptionPane.NO_OPTION) {
            System.out.println("User clicked NO");
        }
        
        ShowAssignRec();        
    }//GEN-LAST:event_assignSubjectButtonActionPerformed

    private void deleteSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSubjectButtonActionPerformed
        HinlogESystem system = new HinlogESystem();
        Assign assign = new Assign();
        
        int studentsRow = teachersTable.getSelectedRow();
        int subjectsRow = teachersSubjectsTable.getSelectedRow();
        int tId = Integer.parseInt(teachersTable.getValueAt(studentsRow, 0).toString());
        int subId = Integer.parseInt(teachersSubjectsTable.getValueAt(subjectsRow, 0).toString());
        
        int response = JOptionPane.showConfirmDialog(null,"Delete the Subject:" + subId + " assigned to teacher ID: " + tId, "Delete Subject?", JOptionPane.OK_CANCEL_OPTION);
        
        if(response == JOptionPane.OK_OPTION){
            String query = assign.DeleteSubj(tId) + subId;
        
            try {
                st.executeUpdate(query);
                System.out.println("Delete Success");
                ShowAssignRec();
                JOptionPane.showMessageDialog(null, "Teacher: " + tId + " deleted subject: " + subId, "delete", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex){
                System.out.println("Failed to Delete: " + ex);
            }
        }
         
        ShowAssignRec();
    }//GEN-LAST:event_deleteSubjectButtonActionPerformed
    
    public void resetFields(){
        teachId.setText(null);
        teachName.setText(null);
        teachAddress.setText(null);
        teachContact.setText(null);
        teachEmail.setText(null);
        teachDepartment.setText(null);
    }
    
    public void showRecords(){
        HinlogESystem system = new HinlogESystem();
        DefaultTableModel tblmodel = (DefaultTableModel) teachersTable.getModel();
        tblmodel.setRowCount(0);
        
        try{
            String query = "select * from teachers;";
            system.rs = system.st.executeQuery(query);
            while (system.rs.next())
            {
                String id = system.rs.getString("teachId");
                String name = system.rs.getString("teachName");
                String add = system.rs.getString("teachAddress");
                String cont = system.rs.getString("teachContact");
                String email = system.rs.getString("teachEmail");
                String dept = system.rs.getString("teachDepartment");
                
                String[] item = {id, name, add, cont, email, dept};
                tblmodel.addRow(item);
            }
        }catch(Exception ex){
            System.out.println("Failed to show teachers table" + ex);
            tblmodel.setRowCount(0);
        }
    }
    
    private void ShowAssignRec(){
               
        DefaultTableModel tblmodel = (DefaultTableModel) teachersSubjectsTable.getModel();
        tblmodel.setRowCount(0);
        HinlogESystem system = new HinlogESystem();
        
        try{
            int row = teachersTable.getSelectedRow();
            int teachId = Integer.parseInt(teachersTable.getValueAt(row, 0).toString());
            
            String query = "SELECT * FROM subjects WHERE subId IN (SELECT subid FROM Assign WHERE tid =" + teachId + ");";
            system.rs = system.st.executeQuery(query);
            while (system.rs.next())
            {
                String id = system.rs.getString("subId");
                String units = system.rs.getString("subUnits");
                String code = system.rs.getString("subCode");
                String desc = system.rs.getString("subDescription");
                String sched = system.rs.getString("subSchedule");

                String[] item = {id, units, code, desc, sched};
                tblmodel.addRow(item);
            }
        }catch(Exception ex){
            System.out.println("Failed to show assign record" + ex);
            tblmodel.setRowCount(0);
        }
        
    }
    
    public void updateTables(){
        showRecords();
        ShowAssignRec();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignSubjectButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteSubjectButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField teachAddress;
    private javax.swing.JTextField teachContact;
    private javax.swing.JTextField teachDepartment;
    private javax.swing.JTextField teachEmail;
    private javax.swing.JTextField teachId;
    private javax.swing.JTextField teachName;
    private javax.swing.JTable teachersSubjectsTable;
    private javax.swing.JTable teachersTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
