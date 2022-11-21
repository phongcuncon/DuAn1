/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;
//đaaaaaa

import DAO.KhachHangDAO;
import java.util.List;
import Entity.KhachHang;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ps22004_taquocphong
 */
public class QLKhachHangJDialog extends javax.swing.JDialog {

    /**
     * Creates new form QLKhachHangJDialog
     */
    public QLKhachHangJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("QL Khách hàng");
        fillCombo();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGioiTinhKH = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        cboDoTT = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ tên khách hàng", "Tuổi", "Giới tính", "CCCD", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tblKhachHang);

        cboDoTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDoTTActionPerformed(evt);
            }
        });

        jLabel10.setText("Độ thân thiết:");

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboDoTT, 0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDoTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        timkiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void cboDoTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDoTTActionPerformed
        cbo();
    }//GEN-LAST:event_cboDoTTActionPerformed

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
            java.util.logging.Logger.getLogger(QLKhachHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhachHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhachHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhachHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLKhachHangJDialog dialog = new QLKhachHangJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupGioiTinhKH;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cboDoTT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    KhachHangDAO dao = new KhachHangDAO();
    List<KhachHang> list = dao.selectAll();

    void init() {
        setLocationRelativeTo(null);
        this.fillToTable();
        this.fillCombo();
    }

    void fillToTable() {
        DefaultTableModel tblmodel = (DefaultTableModel) tblKhachHang.getModel();
        tblmodel.setRowCount(0);
        for (KhachHang kh : list) {
            tblmodel.addRow(new Object[]{
                kh.getTenKH(), kh.getTuoi(), kh.isGioiTinh(),
                kh.getCCCD(), kh.getGhiChu()
            });
        }
    }

    void timkiem() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        String tk = txtTimKiem.getText();
        List<KhachHang> lst = dao.selectByKeyWord(tk);
        for (KhachHang kh : lst) {
            model.addRow(new Object[]{
                kh.getTenKH(), kh.getTuoi(), kh.isGioiTinh(), kh.getCCCD(), kh.getGhiChu()
            });
        }

    }

    void cbo() {
        String ad = (String) cboDoTT.getSelectedItem();
        DefaultTableModel model1 = (DefaultTableModel) tblKhachHang.getModel();
        model1.setRowCount(0);
        dao.selectByKeyWord(ad);
        for (KhachHang kh2 : list) {
            model1.addRow(new Object[]{
                kh2.getTenKH(), kh2.getTuoi(), kh2.isGioiTinh(), kh2.getCCCD(), kh2.getGhiChu()
            });
        }
    }

    void fillCombo() {
//        DefaultComboBoxModel tblmodel = (DefaultComboBoxModel) cboDoTT.getModel();
//        tblmodel.removeAllElements();
//        KhachHang kh = (KhachHang) cboDoTT.getSelectedItem();
//        if (kh != null) {
//            dao.selectByKeyWord(kh.getMaKH());
//            for (KhachHang kh1 : list) {
//                tblmodel.addElement(kh1);
//            }
//
//        }
//        this.fillToTable();
//    }
        DefaultComboBoxModel tblmodel = (DefaultComboBoxModel) cboDoTT.getModel();
        tblmodel.removeAllElements();

        for (KhachHang nhanVien : list) {
            System.out.println(nhanVien.getDoThanThiet());
            if(check(nhanVien.getDoThanThiet(), cboDoTT) == false){
                tblmodel.addElement(nhanVien.getDoThanThiet());
                
        }else{
                return;
            }
        }
    }
    boolean check(Object ob, JComboBox cbo){
        for(int i = 0; i< list.size();i++){
            if(ob.equals(cbo.getItemAt(i))){
                return true;
            }
        }
        return false;
    }
}
