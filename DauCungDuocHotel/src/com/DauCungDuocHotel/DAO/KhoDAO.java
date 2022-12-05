/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.Kho;
import com.DauCungDuocHotel.Entity.LoaiPhong;
import com.DauCungDuocHotel.Entity.NhanVien;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhoDAO extends HotelDAO<Kho, String> {
    String INSERT_SQL = "INSERT INTO Kho(MaLoaiHang,TenHang,ThoiGianNhap,SoLuong, GhiChu)VALUES(?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE Kho SET TenHang = ?, ThoiGianNhap = ?, SoLuong = ?, GhiChu = ? WHERE MaLoaiHang = ?";
    String DELETE_SQL = "DELETE FROM Kho WHERE MaLoaiHang = ?";
    String SELECTALL_SQL = "SELECT * FROM Kho";
    String SELECT_BY_ID_SQL = "SELECT * FROM Kho WHERE MaLoaiHang = ?";

    @Override
    public void insert(Kho enity) {
	JdbcHelper.update(INSERT_SQL, enity.getMaLoaiHang(),enity.getTenHang(),enity.getNgayNhap(),enity.getSoLuong(),enity.getGhiChu());
    }

    @Override
    public void Update(Kho enity) {
	JdbcHelper.update(UPDATE_SQL, enity.getTenHang(),enity.getNgayNhap(),enity.getSoLuong(),enity.getGhiChu(), enity.getMaLoaiHang());
    }

    @Override
    public void delete(String key) {
	JdbcHelper.update(DELETE_SQL,key);
    }

    @Override
    public List<Kho> selectAll() {
	return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public Kho selectByID(String key) {
	List<Kho> list = this.selectBySql(SELECT_BY_ID_SQL, key);
	if(list.isEmpty()){
	    return null;
	}
	return list.get(0);
    }

    @Override
    protected List<Kho> selectBySql(String sql, Object... args) {
	List<Kho> list = new ArrayList<>();
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		Kho entity = new Kho();
		entity.setMaLoaiHang(rs.getString("MaLoaiHang"));
		entity.setTenHang(rs.getString("TenHang"));
		entity.setNgayNhap(rs.getDate("ThoiGianNhap"));
		entity.setSoLuong(rs.getInt("SoLuong"));
		entity.setGhiChu(rs.getString("GhiChu"));
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    public List<Kho> selectByKeyWord(String key){
	String sql = "SELECT * FROM Kho WHERE MaLoaiHang LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
}
