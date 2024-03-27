package org.ax.client;

import java.rmi.RemoteException;
import org.ax.jdbc.middleware.Person;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.ax.jdbc.middleware.IMethodsShred;

public class Client_View extends javax.swing.JFrame {

    private Person p = new Person();
    private static IMethodsShred objServer;
    private List<Person> listPeron;

    public Client_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Phone number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 250));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel1.setText("Buscar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel1.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 360, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 140, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 200, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("Phone number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 200, -1));

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        btnModify.setText("Modificar");
        jPanel1.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        p.setName(txtName.getText());
        p.setAddress(txtAddress.getText());
        p.setPhoneNumber(txtPhoneNumber.getText());

        try {
            objServer.addPerson(p);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            listPeron = objServer.consultPerson(txtFilter.getText());
            updateTable(listPeron);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_View().setVisible(true);
            }
        });

        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5002);
            objServer = (IMethodsShred) registry.lookup("objServer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void updateTable(List<Person> list) {

    }
}
