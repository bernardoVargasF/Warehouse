package Inventory;

import Entity.Product;
import java.awt.Component;
import java.awt.Container;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Bernardo
 */
public class EditProductForm extends javax.swing.JFrame {

    Product product;
    /**
     * Creates new form EditWrhForm
     */
    public EditProductForm() {
        initComponents();
    }

    public EditProductForm(Product product) {
        initComponents();
        this.product = product;
        productNameTxt.setText(product.getProductName());
        String totalString = Integer.toString(product.getTotal());
        productTotalTxt.setText(totalString);       
        String remainingString = Integer.toString(product.getRemaining());
        remainingTxt.setText(remainingString);
        String warehouseString = Integer.toString(product.getWarehouse_id());
        editWrhProductTxt.setText(warehouseString);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productNameTxt = new javax.swing.JTextField();
        productTotalTxt = new javax.swing.JTextField();
        remainingTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateProductBtn = new javax.swing.JButton();
        cancelProductEditBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        editWrhProductTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Total:");

        jLabel3.setText("Remaining: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Edit Product");

        updateProductBtn.setText("Update");
        updateProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductBtnActionPerformed(evt);
            }
        });

        cancelProductEditBtn.setText("Cancel");
        cancelProductEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelProductEditBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Warehouse ID:");

        editWrhProductTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editWrhProductTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(remainingTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(editWrhProductTxt)))
                                .addGap(0, 17, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(updateProductBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelProductEditBtn)
                            .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(remainingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(editWrhProductTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProductBtn)
                    .addComponent(cancelProductEditBtn))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelProductEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelProductEditBtnActionPerformed
        closeUpdateProduct();
    }//GEN-LAST:event_cancelProductEditBtnActionPerformed

    private void editWrhProductTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editWrhProductTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editWrhProductTxtActionPerformed

    private void updateProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductBtnActionPerformed
        try {
            if (allTextFilled(this.getContentPane())) {
                Product productUpdated = new Product();

                productUpdated.setProductName(productNameTxt.getText());
                int total = Integer.parseInt(productTotalTxt.getText());
                productUpdated.setTotal(total);
                int remaining = Integer.parseInt(remainingTxt.getText());
                productUpdated.setRemaining(remaining);
                int warehouse = Integer.parseInt(editWrhProductTxt.getText());
                productUpdated.setWarehouse_id(warehouse);
                updateProduct(productUpdated, product.getProductId());
            } else {
                JOptionPane.showMessageDialog(null, "All inputs must be filled");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Inputs ID, Total, Remaining and "
                    + "Warehouse ID should be numbers");
        }
    }//GEN-LAST:event_updateProductBtnActionPerformed

    void closeUpdateProduct() {
        Inventory inventory = new Inventory();
        inventory.setVisible(true);
        this.dispose();
    }
    
    public boolean allTextFilled(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                //assert (((JTextField) component).getText().equals(""));
                if(((JTextField) component).getText().trim().isEmpty()) return false;
            }
        }
        return true;
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
            java.util.logging.Logger.getLogger(EditProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelProductEditBtn;
    private javax.swing.JTextField editWrhProductTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField productNameTxt;
    private javax.swing.JTextField productTotalTxt;
    private javax.swing.JTextField remainingTxt;
    private javax.swing.JButton updateProductBtn;
    // End of variables declaration//GEN-END:variables

    private void updateProduct(Product productUpdated, int productId) {
        try {
            ConDB conn = new ConDB();
            String query = "UPDATE products SET productName = ?,"
                    + "total = ?, remaining = ?, warehouse_id = ? WHERE id = " + productId;
            
            
            PreparedStatement pst = conn.getConnection().prepareStatement(query);
            pst.setString(1, productUpdated.getProductName());
            pst.setInt(2, productUpdated.getTotal());
            pst.setInt(3, productUpdated.getRemaining());
            pst.setInt(4, productUpdated.getWarehouse_id());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product updated");
            closeUpdateProduct();
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
