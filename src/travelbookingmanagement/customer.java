
package travelbookingmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class customer extends javax.swing.JFrame {

    
    public customer() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer_id = new javax.swing.JTextField();
        customer_fname = new javax.swing.JTextField();
        customer_lname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustomers = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customer_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_fnameActionPerformed(evt);
            }
        });

        jLabel1.setText("Customers");

        jLabel2.setText("Id : ");

        jLabel3.setText("First name :");

        jLabel4.setText("Last name : ");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First name", "Last name"
            }
        ));
        jScrollPane1.setViewportView(jTableCustomers);

        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customer_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customer_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_fnameActionPerformed
        
    }//GEN-LAST:event_customer_fnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = customer_id.getText();
        String fname = customer_fname.getText();
        String lname = customer_lname.getText();

        // Database connection details
        String connectionString = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Final;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "$eadSead1";

        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
            // SQL query to insert a new customer
            String sql = "INSERT INTO Customer (customer_ID, customer_firstname, customer_lastname) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, fname);
                preparedStatement.setString(3, lname);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Customer added successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add customer!");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error connecting to the database!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Show button action performed

        // Database connection details
        String connectionString = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Final;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "$eadSead1";

        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
            // SQL query to select all customers
            String sql = "SELECT * FROM Customer";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (var resultSet = preparedStatement.executeQuery()) {
                    // Clear existing table data
                    DefaultTableModel model = (DefaultTableModel) jTableCustomers.getModel();
                    model.setRowCount(0);

                    // Populate the table with the query results
                    while (resultSet.next()) {
                        Object[] rowData = {
                            resultSet.getString("Customer_ID"),
                            resultSet.getString("Customer_firstname"),
                            resultSet.getString("Customer_lastname")
                        };
                        model.addRow(rowData);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error connecting to the database!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String connectionString = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Final;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "$eadSead1";

        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
        // Get the selected row index
        int selectedRowIndex = jTableCustomers.getSelectedRow();

        if (selectedRowIndex == -1) {
            // No row selected, show a message or handle it appropriately
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        } else {
            // Get the value in the first column of the selected row (assuming it's the ID column)
            String customerId = jTableCustomers.getModel().getValueAt(selectedRowIndex, 0).toString();

            // Your SQL DELETE statement
            String deleteSql = "DELETE FROM Customer WHERE Customer_ID = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSql)) {
                // Set the parameter value
                preparedStatement.setString(1, customerId);

                // Execute the delete statement
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    // Row deleted successfully, now update the table
                    DefaultTableModel model = (DefaultTableModel) jTableCustomers.getModel();
                    model.removeRow(selectedRowIndex);

                    JOptionPane.showMessageDialog(this, "Row deleted successfully.");
                } else {
                    // No rows affected, handle it appropriately
                    JOptionPane.showMessageDialog(this, "Failed to delete row.");
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error connecting to the database!");
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField customer_fname;
    private javax.swing.JTextField customer_id;
    private javax.swing.JTextField customer_lname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustomers;
    // End of variables declaration//GEN-END:variables
}
