/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duralene;

import static duralene.MainFrame.DB_PASS;
import static duralene.MainFrame.DB_URL;
import static duralene.MainFrame.DB_USER;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author kcroke
 */
public class AddCustomerForm extends javax.swing.JFrame {

    Connection connect;
    /**
     * Creates new form AddCustomerForm
     */
    public AddCustomerForm() throws SQLException {
        initComponents();
        
        // Load Oracle JDBC Driver
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        // Connect to Oracle Database
        this.connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CompNameTextField = new javax.swing.JTextField();
        ProspectCheckBox = new javax.swing.JCheckBox();
        CustTypeCombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddCustTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel1.setText("*Company Name:");

        CompNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ProspectCheckBox.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        ProspectCheckBox.setText("Prospect?");

        CustTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CustTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Automotive", "Construction", "Manufacturing", "Trucking" }));

        jLabel7.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel7.setText("*Type:");

        SubmitButton.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        CancelButton.setText("Cancel");

        AddCustTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AddCustTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddCustTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Contact", "Position", "Phone", "Email"
            }
        ));
        AddCustTable.setRowHeight(36);
        AddCustTable.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(AddCustTable);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("New Customer:");

        jLabel3.setText("_________________________________________________________________________________________________");

        AddressTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel4.setText("*Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CustTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ProspectCheckBox))
                            .addComponent(CompNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CompNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CustTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProspectCheckBox)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>                        

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String customerName = CompNameTextField.getText(), isProspect = "N";
        String customerAddress = AddressTextField.getText(), currColumn, insertStr;
        Object currentObj;
        int rowCount = AddCustTable.getRowCount(), columnCount = AddCustTable.getColumnCount();
        PreparedStatement insertInfo;
        
        if(ProspectCheckBox.isSelected())
            isProspect = "Y";
        
        if(customerName.equals("") || customerAddress.equals("")) {
            System.out.println("ERR");
        }
        else
        {
            try {
                PreparedStatement insertStatement = connect.prepareStatement("INSERT INTO CUSTOMER "
                        + "(NAME, ADDRESS, TYPE, PROSPECT) VALUES (?, ?, ?, ?)");
                insertStatement.setString(1, customerName);
                insertStatement.setString(2, customerAddress);
                insertStatement.setString(3, CustTypeCombo.getSelectedItem().toString());
                insertStatement.setString(4, isProspect);
                insertStatement.execute();           
            } catch(SQLException ex) { System.out.println("SQL CONNECT Error");}
        }
        
        //REMEBER: Editing during submit error! 
        for(int i = 0; i < rowCount; i++)
        {
            for(int j = 0; j < columnCount; j++)
            {
                if (AddCustTable.getValueAt(i, j) != null) {
                    try { 
                        //if we encounter a non-null value in a row, insert the whole row
                        //in INFO and skip to the next row:
                        
                        insertStr = "INSERT INTO INFO (" + 
                                AddCustTable.getColumnName(0).toUpperCase() + ", " +
                                AddCustTable.getColumnName(1).toUpperCase() + ", " +
                                AddCustTable.getColumnName(2).toUpperCase() + ", " +
                                AddCustTable.getColumnName(3).toUpperCase() + ", " +
                                "CUST_NAME, CUST_ADDRESS, IN_ROW" +
                                ") VALUES (?, ?, ?, ?, '" + customerName + "', '"  +
                                 customerAddress + "', '" + i + "')";
                        System.out.println(insertStr);
                        insertInfo = connect.prepareStatement(insertStr);
                       
                        for(int k = 0; k < columnCount; k++)
                        {
                            currentObj = AddCustTable.getValueAt(i, k);
                            
                            if(currentObj == null)
                                insertInfo.setString(k+1, "");
                            else
                                insertInfo.setString(k+1, currentObj.toString());
                        }
                        
                        //insertInfo.
                        insertInfo.execute();
                        j = columnCount;
                    
                    } catch(SQLException ex) { }  
                }
            } 
        }
        this.dispose();    
    }                                            

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                new AddCustomerForm().setVisible(true);
                } catch (SQLException ex) { }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTable AddCustTable;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField CompNameTextField;
    private javax.swing.JComboBox CustTypeCombo;
    private javax.swing.JCheckBox ProspectCheckBox;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
