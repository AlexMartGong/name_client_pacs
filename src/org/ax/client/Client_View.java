package org.ax.client;

import java.rmi.RemoteException;
import org.ax.jdbc.middleware.Person;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.ax.jdbc.middleware.IMethodsShred;

public class Client_View extends javax.swing.JFrame {

    private Person p = new Person();
    private static IMethodsShred objServer;

    public Client_View() throws RemoteException {
        initComponents();
        List<Person> listPeron;
        try {
            listPeron = objServer.consultPerson("");
            updateTable(listPeron);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPerson.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 250));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel1.setText("Buscar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtFilter.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 360, -1));

        btnBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
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

        txtId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 140, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        txtName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        txtAddress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 200, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("Phone number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 200, -1));

        btnSave.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        btnModify.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        btnDelete.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, -1));

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
        List<Person> listPeron;
        try {
            listPeron = objServer.consultPerson("");
            updateTable(listPeron);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        List<Person> listPeron;
        try {
            listPeron = objServer.consultPerson(txtFilter.getText());
            updateTable(listPeron);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonMouseClicked
        int fila = tblPerson.getSelectedRow();

        if (fila != -1) {

            int id = (int) tblPerson.getValueAt(fila, 0);
            String name = (String) tblPerson.getValueAt(fila, 1);
            String address = (String) tblPerson.getValueAt(fila, 2);
            String phoneNumber = (String) tblPerson.getValueAt(fila, 3);

            txtId.setText(String.valueOf(id));
            txtName.setText(name);
            txtAddress.setText(address);
            txtPhoneNumber.setText(phoneNumber);

        }

    }//GEN-LAST:event_tblPersonMouseClicked

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed

        p.setId(Integer.parseInt(txtId.getText()));
        p.setName(txtName.getText());
        p.setAddress(txtAddress.getText());
        p.setPhoneNumber(txtPhoneNumber.getText());

        try {
            objServer.updatePerson(p);
            objServer.consultPerson("");
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Person> listPeron;
        try {
            listPeron = objServer.consultPerson("");
            updateTable(listPeron);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }

        clear();

    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        p.setId(Integer.parseInt(txtId.getText()));

        try {
            objServer.deletePerson(p);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Person> listPeron;
        try {
            listPeron = objServer.consultPerson("");
            updateTable(listPeron);
        } catch (RemoteException ex) {
            Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
                try {
                    new Client_View().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(Client_View.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JButton btnDelete;
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
        DefaultTableModel modelTable = (DefaultTableModel) tblPerson.getModel();
        modelTable.setRowCount(0);

        for (Person p : list) {
            Object[] fila = new Object[4];
            fila[0] = p.getId();
            fila[1] = p.getName();
            fila[2] = p.getAddress();
            fila[3] = p.getPhoneNumber();
            modelTable.addRow(fila);
        }
    }

    private void clear() {
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
    }

}
