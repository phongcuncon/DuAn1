/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.NhanVien;
import com.DauCungDuocHotel.Entity.Phong;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhongDAO extends HotelDAO<Phong, String> {
    String INSERT_SQL = "INSERT INTO Phong(MaPhong,Tang,GiaTheoGio,GiatheoNgay, TrangThai,MaLoaiPhong)VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE Phong SET Tang = ?, GiaTheoGio = ?, GiatheoNgay = ?, TrangThai = ?, MaLoaiPhong = ? WHERE MaPhong = ?";
    String DELETE_SQL = "DELETE FROM Phong WHERE MaPhong = ?";
    String SELECTALL_SQL = "SELECT * FROM Phong";
    String SELECT_BY_ID_SQL = "SELECT * FROM Phong WHERE MaPhong = ?";

    @Override
    public void insert(Phong enity) {
	JdbcHelper.update(INSERT_SQL, enity.getMaPhong(),enity.getTang(),enity.getGiaTheoGio(),enity.getGiaTheoNgay(),enity.getTrangThai(),enity.getMaLoaiPhong());
    }

    @Override
    public void Update(Phong enity) {
	JdbcHelper.update(UPDATE_SQL, enity.getTang(),enity.getGiaTheoGio(),enity.getGiaTheoNgay(),enity.getTrangThai(),enity.getMaLoaiPhong(),enity.getMaPhong());
    }

    @Override
    public void delete(String key) {
	JdbcHelper.update(DELETE_SQL, key);
    }
    

    @Override
    public List<Phong> selectAll() {
	return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public Phong selectByID(String key) {
	List<Phong> list = this.selectBySql(SELECT_BY_ID_SQL, key );
	if(list.isEmpty()){
	    return null;
	}
	 return list.get(0);
    }

    @Override
    protected List<Phong> selectBySql(String sql, Object... args) {
	List<Phong> list = new ArrayList<>();
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		Phong entity = new Phong();
		entity.setMaPhong(rs.getString("MaPhong"));
		entity.setTang(rs.getInt("Tang"));
		entity.setGiaTheoGio(rs.getDouble("GiaTheoGio"));
		entity.setGiaTheoNgay(rs.getDouble("GiaTheoNgay"));
		entity.setTrangThai(rs.getString("TrangThai"));
		entity.setMaLoaiPhong(rs.getString("MaLoaiPhong"));
		
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
//        return list;
    }
    
    public List<Phong> selectByKeyword(String keyword) {
        String SQL = "SELECT * FROM Phong WHERE MaPhong LIKE ?";
        return this.selectBySql(SQL, "%" + keyword + "%");
    }
    
    
    public List<Phong> selectByKeyword1() {
        String SQL = "SELECT * FROM Phong WHERE TrangThai LIKE N'%Trống' ";
        return this.selectBySql(SQL);
    }
    
    public List<Phong> setTrangThaiDatPhong(String keyword) {
        String SQL = "Update Phong set TrangThai = N'Đã đặt' where MaPhong = ?";
        return this.selectBySql(SQL, "%" + keyword + "%");
    }
    
    public List<Phong> setTrangThaiThanhToan(String keyword) {
        String SQL = "Update Phong set TrangThai = N'Trống' where MaPhong = ?";
        return this.selectBySql(SQL, "%" + keyword + "%");
    }
}
