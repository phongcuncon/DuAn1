/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.DauCungDuocHotel.UI;

import com.DauCungDuocHotel.DAO.KhachHangDAO;
import com.DauCungDuocHotel.Entity.KhachHang;
import com.DauCungDuocHotel.Untils.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ps22004_taquocphong
 */
public class ThanhToanJDialog extends javax.swing.JDialog {

    public static String MaPhong;

    /**
     * Creates new form ThanhToanJDialog
     */
    public ThanhToanJDialog(java.awt.Frame parent, boolean modal, String MaPhong) {
        super(parent, modal);
        this.MaPhong = MaPhong;
        initComponents();
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

        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        txtTienTraLai = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPhuThuCheckOut = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTienDatCoc = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnThanhToan = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnPrintHD = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        lblTienPhong = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTienDV = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(239, 245, 245));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText("PHÒNG");
        lblTitle.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Tổng Cần Thanh Toán");

        jLabel17.setText("Tiền Trả Lại");

        jLabel18.setText("Tiền khách đưa");

        txtTienKhachDua.setFont(new java.awt.Font("Hiragino Sans CNS", 1, 15)); // NOI18N

        txtTienTraLai.setFont(new java.awt.Font("Hiragino Sans CNS", 1, 15)); // NOI18N

        jLabel19.setText("Tiền Đặt Cọc");

        txtPhuThuCheckOut.setFont(new java.awt.Font("Hiragino Sans CNS", 1, 15)); // NOI18N
        txtPhuThuCheckOut.setText("5");
        txtPhuThuCheckOut.setEnabled(false);

        jLabel20.setText("Thuế (%)");

        txtTienDatCoc.setFont(new java.awt.Font("Hiragino Sans CNS", 1, 15)); // NOI18N
        txtTienDatCoc.setText("100000");
        txtTienDatCoc.setEnabled(false);

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane4.setViewportView(txtGhiChu);

        btnThanhToan.setBackground(new java.awt.Color(14, 94, 111));
        btnThanhToan.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(239, 154, 83));
        btnThanhToan.setText("Thanh Toán");

        jLabel21.setText("Ghi Chú");

        btnPrintHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrintHD.setText("in");
        btnPrintHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintHDActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Hiragino Sans GB", 1, 16)); // NOI18N
        lblTotal.setText("1000");

        jLabel22.setText("Giảm giá");

        txtGiamGia.setFont(new java.awt.Font("Hiragino Sans CNS", 1, 15)); // NOI18N
        txtGiamGia.setText("5%");
        txtGiamGia.setEnabled(false);

        lblTienPhong.setFont(new java.awt.Font("Hiragino Sans GB", 1, 14)); // NOI18N
        lblTienPhong.setText("1000");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Tiền phòng");

        lblTienDV.setFont(new java.awt.Font("Hiragino Sans GB", 1, 14)); // NOI18N
        lblTienDV.setText("1000");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Tổng tiền dịch vụ");

        lblTongTien.setFont(new java.awt.Font("Hiragino Sans GB", 1, 14)); // NOI18N
        lblTongTien.setText("1000");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("Tổng tiền");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintHD))
                    .addComponent(jScrollPane4)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTienDV, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGiamGia)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTienKhachDua)
                                            .addComponent(txtTienTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTienDatCoc, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPhuThuCheckOut)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPhuThuCheckOut, txtTienDatCoc});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnPrintHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTienPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTienDV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongTien))
                .addGap(24, 24, 24)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhuThuCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTienDatCoc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTienTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 28, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel13, lblTotal});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtGiamGia, txtPhuThuCheckOut});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel14, jLabel16, lblTienDV, lblTienPhong});

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintHDActionPerformed
        // TODO add your handling code here:
        if (MaPhong == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng thanh toán trước khi in hóa đơn");
        } else {
            try {
                printBill(MaPhong);
            } catch (JRException ex) {
                throw new RuntimeException(ex);
            }
        }
    }//GEN-LAST:event_btnPrintHDActionPerformed

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
            java.util.logging.Logger.getLogger(ThanhToanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToanJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThanhToanJDialog dialog = new ThanhToanJDialog(new javax.swing.JFrame(), true, MaPhong);
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
    private javax.swing.JButton btnPrintHD;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTienDV;
    private javax.swing.JLabel lblTienPhong;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtPhuThuCheckOut;
    private javax.swing.JTextField txtTienDatCoc;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienTraLai;
    // End of variables declaration//GEN-END:variables

    private int discount = 0;
    private int thue = 0;
    private int sum = 0;
    private int datcoc = 0;

    private int total = 0;

    private void init() {
        String searchValue = lblTitle.getText();
        String query = "  select * from CTHDPhong WHERE MaPhong like '"+MaPhong+"'";
        System.out.println(MaPhong);
        try {
            ResultSet rs = JdbcHelper.query(query);
            while (rs.next()) {
                Object[] product = new Object[]{
                    rs.getString(1), // MaPhong
                    rs.getString(2), // TenKH
                    rs.getString(3), // SoDem
                    rs.getString(4), // TienPhong
                    rs.getString(5), // TienDV
                    rs.getString(6), // TongTien
                    rs.getString(7), // DatCoc
                    rs.getString(8), // GiamGia
                };
                txtTienTraLai.setEditable(false);
                lblTitle.setText("Phòng " + rs.getString(1));
                lblTienPhong.setText(rs.getString(4));
                lblTienDV.setText(rs.getString(5));
                lblTongTien.setText(rs.getString(6));
                txtGiamGia.setText(rs.getString(8) + "%");
                txtTienDatCoc.setText(rs.getString(7));
                txtTienKhachDua.addKeyListener(new handleKeyListenerTxtTienKhachDua());
                thue = Integer.parseInt(txtPhuThuCheckOut.getText());
                datcoc = Integer.parseInt(rs.getString(7));
                sum = Integer.parseInt(rs.getString(6));
                if (Double.parseDouble(rs.getString(8)) == 0.2) {
                    discount = 20;
                } else {
                    discount = 0;
                }
                displayTotal();
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }
    // Tinh tien

    public void displayTotal() {
        total = (sum + (sum * (thue)/100)) * (100 - discount) / 100  - datcoc;
        lblTotal.setText(CurrencyUtil.format(total));
    }

    class handleKeyListenerTxtTienKhachDua implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            Util.setTimeout(() -> {
                int tienKhachDua = Integer.parseInt(txtTienKhachDua.getText());
                txtTienTraLai.setText(CurrencyUtil.format(tienKhachDua - total));
            }, 250);
        }
    }

    // In Hoa Don
    public void addHD(String maHD) {

//		HoaDonDAO hdd = new HoaDonDAO();
//		ChiTietHoaDonDAO cthdd = new ChiTietHoaDonDAO();
//		String maNV = Auth.user.getMaNhanVien();
//		String maKH = txtMaKH.getText().trim();
//		try {
//			hdd.insert(new HoaDon(maHD, maNV, maKH,new Date()));
//			listHD.forEach((product,amount) -> {
//				cthdd.insert(new ChiTietHoaDon(
//						maHD,
//						product[0]+"",
//						product[1]+"",
//						amount
//				));
//			});
//			Alert.success("Thêm hóa đơn thành công!!!!");
//		}catch (Exception e) {
//			Alert.error("Thêm thất bại!!!");
//		}
	}
    public void printBill(String maHoaDon) throws JRException {
//		String reportSource = getClass().getResource("/reports/InHoaDon.jrxml").getPath();
//		JasperDesign jdesign = JRXmlLoader.load(reportSource);
//		String query = "SELECT * FROM [QLDA_SieuThi].[dbo].[ChiTietHoaDon] where MaHD like '"+maHoaDon+"'";
//		System.out.println(query);
//
//		JRDesignQuery updateQuery = new JRDesignQuery();
//		updateQuery.setText(query);
//
//		jdesign.setQuery(updateQuery);
//
//		JasperReport jreport = JasperCompileManager.compileReport(jdesign);
//		JasperPrint jprint = JasperFillManager.fillReport(jreport, null,JdbcHelper.getConnect());
//
//		JasperViewer.viewReport(jprint,false);
    }

}
