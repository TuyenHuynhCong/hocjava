
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GDQLBanDoc extends javax.swing.JFrame implements ActionListener{

   
    public GDQLBanDoc() {
        initComponents();
        setLocationRelativeTo(null);
        btnChinhSuaTTBanDoc.addActionListener(this);
        btnGiaHanTheBanDoc.addActionListener(this);
        btnHuyTheBanDoc.addActionListener(this);
        btnThemBanDoc.addActionListener(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnThemBanDoc = new javax.swing.JButton();
        btnChinhSuaTTBanDoc = new javax.swing.JButton();
        btnGiaHanTheBanDoc = new javax.swing.JButton();
        btnHuyTheBanDoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ BẠN ĐỌC");

        btnThemBanDoc.setText("Thêm Bạn Đọc Mới");

        btnChinhSuaTTBanDoc.setText("Chỉnh Sửa TT Bạn Đọc");

        btnGiaHanTheBanDoc.setText("Gia Hạn Thẻ Bạn Đọc");

        btnHuyTheBanDoc.setText("Hủy Thẻ Bạn Đọc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChinhSuaTTBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGiaHanTheBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuyTheBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnThemBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(btnThemBanDoc)
                .addGap(38, 38, 38)
                .addComponent(btnChinhSuaTTBanDoc)
                .addGap(36, 36, 36)
                .addComponent(btnGiaHanTheBanDoc)
                .addGap(36, 36, 36)
                .addComponent(btnHuyTheBanDoc)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(GDQLBanDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDQLBanDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDQLBanDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDQLBanDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDQLBanDoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSuaTTBanDoc;
    private javax.swing.JButton btnGiaHanTheBanDoc;
    private javax.swing.JButton btnHuyTheBanDoc;
    private javax.swing.JButton btnThemBanDoc;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnChinhSuaTTBanDoc)){
            btnChinhSuaTTBanDocCLick();
        }
        else if(e.getSource().equals(btnGiaHanTheBanDoc)){
            btnGiaHanTheBanDocClick();
        }
        else if(e.getSource().equals(btnHuyTheBanDoc)){
            btnHuyTheBanDocClick();
        }
        else btnThemBanDocClick();
    }
    
    public void btnThemBanDocClick()
    {
        new GDThemBanDoc().setVisible(true);
        this.dispose();
    }
    
    public void btnHuyTheBanDocClick(){
        
    }
    
    public void btnChinhSuaTTBanDocCLick(){
        
    }
    
    public void btnGiaHanTheBanDocClick(){
        
    }
}
