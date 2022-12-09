/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.DauCungDuocHotel.UI;

import com.DauCungDuocHotel.DAO.DichVuDAO;
import com.DauCungDuocHotel.DAO.HoaDonDAO;
import com.DauCungDuocHotel.Entity.ChiTietHoaDon;
import com.DauCungDuocHotel.Entity.DatPhong;
import com.DauCungDuocHotel.Entity.DichVu;
import com.DauCungDuocHotel.Entity.HoaDon;
import com.DauCungDuocHotel.Entity.Phong;
import com.DauCungDuocHotel.Untils.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ChiTietPhongJDialog extends javax.swing.JDialog implements ActionListener {

    /**
     * Creates new form PhongJDialog
     */
    public ChiTietPhongJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        fillButtonDichVu();
//        timKiemDichVu("");
//        fillInfoCus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmenu = new javax.swing.JPopupMenu();
        SuaSoLuong = new javax.swing.JMenuItem();
        XoaDichVu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblChOut = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDongiaPhong = new javax.swing.JLabel();
        lblSoDemO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCCCD = new javax.swing.JLabel();
        lblKH = new javax.swing.JLabel();
        lblChIn = new javax.swing.JLabel();
        lblTienPhong = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDV = new javax.swing.JTable();
        panelDV = new javax.swing.JPanel();
        txtDVCT = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        panelBtnDV = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        SuaSoLuong.setText("jMenuItem1");
        SuaSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaSoLuongActionPerformed(evt);
            }
        });
        pmenu.add(SuaSoLuong);

        XoaDichVu.setText("jMenuItem2");
        XoaDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaDichVuActionPerformed(evt);
            }
        });
        pmenu.add(XoaDichVu);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 251, 235));

        jLabel2.setText("Check Out Date: ");

        lblChOut.setText("A");

        jLabel5.setText("Đơn giá (tính theo đêm) :");

        jLabel7.setText("Số đêm khách ở:");

        lblDongiaPhong.setText("jLabel9");

        lblSoDemO.setText("jLabel10");

        jLabel1.setText("Căn cước công dân:");

        lblCCCD.setText("A");

        lblKH.setText("A");

        lblChIn.setText("A");

        lblTienPhong.setFont(new java.awt.Font("Hiragino Sans GB", 1, 17)); // NOI18N
        lblTienPhong.setText("1000");

        lblTitle.setBackground(new java.awt.Color(214, 228, 229));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(235, 100, 64));
        lblTitle.setText("Chi Tiết Thuê Phòng 102");
        lblTitle.setOpaque(true);

        jLabel3.setText("Check In Date: ");

        jLabel6.setText("Khách Hàng:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(235, 100, 64));
        jLabel8.setText("Tổng Tiền Phòng:");

        tblDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dịch vụ", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ));
        tblDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDVMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblDV);

        panelDV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thêm dịch vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtDVCT.setText("Dịch Vụ Cần Tìm");

        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });
        txtTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKeyReleased(evt);
            }
        });

        panelBtnDV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dịch vụ", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.TOP));
        panelBtnDV.setLayout(new java.awt.GridLayout(4, 4, 10, 7));

        javax.swing.GroupLayout panelDVLayout = new javax.swing.GroupLayout(panelDV);
        panelDV.setLayout(panelDVLayout);
        panelDVLayout.setHorizontalGroup(
            panelDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBtnDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDVLayout.createSequentialGroup()
                        .addComponent(txtDVCT, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDVLayout.setVerticalGroup(
            panelDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTim)
                    .addComponent(txtDVCT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBtnDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DauCungDuocHotel/Hinh/bx-x.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblKH, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(lblCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblChIn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblChOut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDongiaPhong)
                                    .addComponent(lblSoDemO))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblChIn, lblChOut});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblChIn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(lblDongiaPhong))
                    .addComponent(lblKH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCCCD)
                    .addComponent(jLabel2)
                    .addComponent(lblChOut)
                    .addComponent(jLabel7)
                    .addComponent(lblSoDemO))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTienPhong))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCCCD, lblKH});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblChIn, lblChOut});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuaSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaSoLuongActionPerformed

    }//GEN-LAST:event_SuaSoLuongActionPerformed

    private void XoaDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaDichVuActionPerformed
        index = tblDV.getSelectedRow();
        DichVu dv = list.get(index);
        String id = dv.getMaDV();
        if (MsgBox.confirm(this, "Bạn có muốn xóa dịch vụ này không?")) {
            try {
                dao.delete(id);
                list.removeAll(list);
                list.addAll(dao.selectAll());
                MsgBox.alert(this, "Xóa thành công!");

            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }//GEN-LAST:event_XoaDichVuActionPerformed

    private void txtTimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKeyReleased
        //        timKiemDichVu();
    }//GEN-LAST:event_txtTimKeyReleased

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
//        timKiemDichVu(tenDichVu);
    }//GEN-LAST:event_txtTimActionPerformed

    private void tblDVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDVMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (evt.isPopupTrigger() && tblDV.getSelectedRowCount() != 0) {
                pmenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tblDVMouseReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietPhongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChiTietPhongJDialog dialog = new ChiTietPhongJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JMenuItem SuaSoLuong;
    private javax.swing.JMenuItem XoaDichVu;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblChIn;
    private javax.swing.JLabel lblChOut;
    private javax.swing.JLabel lblDongiaPhong;
    private javax.swing.JLabel lblKH;
    private javax.swing.JLabel lblSoDemO;
    private javax.swing.JLabel lblTienPhong;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelBtnDV;
    private javax.swing.JPanel panelDV;
    private javax.swing.JPopupMenu pmenu;
    private javax.swing.JTable tblDV;
    private javax.swing.JLabel txtDVCT;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables

    DichVuDAO dao = new DichVuDAO();
    List<DichVu> list = dao.selectAll();

    HoaDonDAO HDdao = new HoaDonDAO();
    List<HoaDon> list1 = HDdao.selectAll();
    
    private static HoaDon hoadon;
    
    private static ChiTietHoaDon CThoadon;
    
    private static DatPhong dp;
    
    private static Phong p;
    
    private DefaultTableModel modelHoaDon = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(int row, int column) {
			return column==2;
		}
	};
    
    private HashMap<Object[],Integer> listHD = new HashMap<Object[],Integer>();
    int index = -1;
    JButton btn;

    boolean check(Object ob, JComboBox cbo) {
        for (int i = 0; i < list.size(); i++) {
            if (ob.equals(cbo.getItemAt(i))) {
                return true;
            }
        }
        return false;
    }

    public void fillButtonDichVu() {
        panelBtnDV.removeAll();
        int len = list.size();
        for (int i = 0; i < len; i++) {
            DichVu dichvu = list.get(i);
            String tendv = dichvu.getTenDV();
            JButton btns = new JButton();
            btns.setText(tendv);
            btns.addActionListener(actionButtonAdd(Object[] product));
            panelBtnDV.add(btns);
        }
        if (len == 0) {
            JPanel panel = new JPanel(new BorderLayout());
            JLabel lbl = new JLabel("Không có dịch vụ nào");
            lbl.setForeground(new Color(31, 174, 255));
            lbl.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(lbl, BorderLayout.CENTER);
            panelBtnDV.add(panel);
        }
        panelBtnDV.revalidate();
        panelBtnDV.repaint();
    }

//    private void fillInfoCus() {
//        
//        lblTitle.setText("Chi Tiết Phòng"+ dp.getMaPhong());
//        lblKH.setText(dp.getMaKH());
//        lblCCCD.setText(text);
//        lblChIn.setText(dp.getNgayDatPhong());
//        lblChOut.setText(dp.getNgayTraPhong());
//        lblDongiaPhong.setText(String.valueOf(p.getGiaTheoNgay()));
//        lblSoDemO.setText(text);
//        lblTienPhong.setText(Integer.parseInt());
//    }
    
     private ActionListener actionButtonAdd(Object[] product) {
			ActionListener action = (e) -> {
				if(listHD.containsKey(product)) {
					listHD.put(product,listHD.get(product)+1);
				}else {
					listHD.put(product,1);
				}
				fillHD();
//				sumCurrency();
//				displayTotal();
			};
			return action;
	};

	private void fillHD() {
		modelHoaDon.setRowCount(0);
		listHD.forEach((product,amount) -> {
			modelHoaDon.addRow(new Object[] {
					product[2],
					CurrencyUtil.format(Integer.parseInt(product[7]+"")),
					amount,
					CurrencyUtil.format(amount*Integer.parseInt(product[7]+""))
			});
		});
	}

    private void timKiemDichVu(String tenDichVu) {
        List<DichVu> list = dao.selectNotInCourse(tenDichVu);
        String tk = txtDVCT.getText();
        ganButtons(list);
    }

    private void ganButtons(List<DichVu> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            DichVu dichvu = list.get(i);
            String tendv = dichvu.getTenDV();
            JButton btns = new JButton();
            panelBtnDV.add(btns);
            btns.setText(tendv);
        }
    }

    @Override
    public Point getMousePosition() throws HeadlessException {
        return super.getMousePosition(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
