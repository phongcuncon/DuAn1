/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import DAO.PhongDAO;
import Entity.Phong;
import Untils.Auth;
import Untils.MsgBox;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLphongJDialog extends javax.swing.JDialog {
    PhongDAO dao = new PhongDAO();
    int row = -1;
    List<Phong> list = dao.selectAll();
    /**
     * Creates new form QLphongJDialog
     */
    public QLphongJDialog(java.awt.Frame parent, boolean modal) {
	super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTang = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        cboTang = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhong = new javax.swing.JTable();
        cboKiHieu = new javax.swing.JComboBox<>();
        chkThem = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtLoaiPhong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGiaTheoNgay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGiaTheoGio = new javax.swing.JTextField();
        txtPhong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quan Li Phong");
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Loại phòng:");

        cboTang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tang 1" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Kí Hiệu:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Phòng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Trạng thái:");

        tblPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Phong", "Loai Phong", "Gia Theo Gio", "Gia Theo Ngay", "Trang Thai", "Tang"
            }
        ));
        jScrollPane1.setViewportView(tblPhong);

        cboKiHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H" }));

        chkThem.setText("Thêm nhiều");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tầng:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giá theo ngày:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Giá theo giờ:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 2, 2));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem);

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnMoi);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSua);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkThem)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cboKiHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTang)
                            .addComponent(txtLoaiPhong)
                            .addComponent(txtTrangThai, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGiaTheoNgay)
                            .addComponent(txtGiaTheoGio)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboKiHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhong)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaTheoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(chkThem)
                        .addGap(75, 75, 75)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPhong, txtTang});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();       
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(checkNull()){
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

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
	    java.util.logging.Logger.getLogger(QLphongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(QLphongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(QLphongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(QLphongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>

	/* Create and display the dialog */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		QLphongJDialog dialog = new QLphongJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboKiHieu;
    private javax.swing.JComboBox<String> cboTang;
    private javax.swing.JCheckBox chkThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhong;
    private javax.swing.JTextField txtGiaTheoGio;
    private javax.swing.JTextField txtGiaTheoNgay;
    private javax.swing.JTextField txtLoaiPhong;
    private javax.swing.JTextField txtPhong;
    private javax.swing.JTextField txtTang;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables

    void init() {
        setLocationRelativeTo(null);
        this.fillToTable();
        this.row = -1;
        
    }

    void insert() {
        Phong model = getForm();
        try {
            dao.insert(model);
            this.fillToTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }        
    }
    
    void update() {
        Phong model = getForm();
        try {
            dao.Update(model);
            this.fillToTable();
            this.clearForm();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }
    
    void delete() {
        if(!Auth.isManager()){
            MsgBox.alert(this, "Bạn đéo có quyền xoá!");
        }
        else{
            if(MsgBox.confirm(this, "Bạn có muốn xóa hay không?")){
                String maPhong = txtPhong.getText();
                try {
                    dao.delete(maPhong);
                    this.fillToTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");
                } 
                catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }
    
    void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblPhong.getModel();
        model.setRowCount(0);
        try {
            List<Phong> list = dao.selectAll();
            for (Phong p : list) {
                Object[] row = {
                    p.getMaPhong(), p.getMaLoaiPhong(), p.getGiaTheoGio(),
                    p.getGiaTheoNgay(), p.getTrangThai(), p.getTang()
                };
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    void clearForm() {
        cboKiHieu.setSelectedIndex(0);
        cboTang.setSelectedIndex(0);
        txtPhong.setText("");
        txtTang.setText("");
        txtLoaiPhong.setText("");
        txtTrangThai.setText("");
        txtGiaTheoGio.setText("");
        txtGiaTheoNgay.setText("");
        chkThem.setSelected(false);
//        this.setForm(new Phong());
        this.row = -1;
//        this.updateStatus();
    }
    
    void setForm(Phong p1) {
        txtPhong.setText(p1.getMaPhong());
        txtLoaiPhong.setText(p1.getMaLoaiPhong());
        txtTrangThai.setText(p1.getTrangThai());
        txtGiaTheoGio.setText(String.valueOf(p1.getGiaTheoGio()));
        txtGiaTheoNgay.setText(String.valueOf(p1.getGiaTheoNgay()));
        txtTang.setText(String.valueOf(p1.getTang()));
    }
    
    Phong getForm() {
        Phong p2 = new Phong();
        p2.setMaPhong(txtPhong.getText());
        p2.setTrangThai(txtTrangThai.getText());
        p2.setMaLoaiPhong(txtLoaiPhong.getText());
        p2.setTang(Integer.valueOf(txtTang.getText()));
        p2.setGiaTheoNgay(Double.valueOf(txtGiaTheoNgay.getText()));
        p2.setGiaTheoGio(Double.valueOf(txtGiaTheoGio.getText()));
        
        return p2;
    }
    
    void updateStatus() {
        boolean edit = (this.row >= 1);
        txtPhong.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(!edit);
        btnXoa.setEnabled(!edit);
    }
    
    void edit() {
        String maphong = (String) tblPhong.getValueAt(this.row, 0);
         Phong p3 = dao.selectByID(maphong);
         this.setForm(p3);
         this.updateStatus();
         
    }
    
    boolean checkNull() {
        
        if(txtGiaTheoGio.getText().equals("")){
            MsgBox.alert(this, "Vui lòng nhập giá theo giờ!");
            return false;
        }else 
        if(txtGiaTheoNgay.getText().equals("")){
            MsgBox.alert(this, "Vui lòng nhập giá theo ngày!");
            return false;
        }else
        if(txtLoaiPhong.getText().equals("")){
            MsgBox.alert(this, "Vui lòng nhập loại phòng!");
            return false;
        }else
        if(txtTang.getText().equals("")){
            MsgBox.alert(this, "Vui lòng nhập số tầng!");
            return false;
        }else
        if(txtTrangThai.getText().equals("")){
            MsgBox.alert(this, "Vui lòng nhập trạng thái!");
            return false;
        }else
        if(txtPhong.getText().equals("")){
            MsgBox.alert(this, "Vui lòng nhập mã phòng!");
        }
        return true;
    }
}
