/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.DatPhong;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DatPhongDAO extends HotelDAO<DatPhong, String> {
    String INSERT_SQL = "INSERT INTO DatPhong(MaPhong, NgayDatPhong, NgayTraPhong, DatCoc, GhiChu, MaKH)VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE DatPhong SET NgayDatPhong = ?, NgayTraPhong = ?, DatCoc = ?, GhiChu = ?,MaHD = ?, MaKH = ?  WHERE MaPhong = ? ";
    String DELETE_SQL = "DELETE FROM DatPhong WHERE MaPhong = ?";
    String SELECTALL_SQL = "SELECT * FROM DatPhong";
    String SELECT_BY_ID_SQL = "SELECT * FROM DatPhong WHERE MaPhong = ?";
    @Override
    public void insert(DatPhong enity) {
	JdbcHelper.update(INSERT_SQL,enity.getMaPhong(), enity.getNgayDatPhong(), enity.getNgayTraPhong(), enity.getDatCoc(), enity.getGhiChu(), enity.getMaKH());
    }

    @Override
    public void Update(DatPhong enity) {
	JdbcHelper.update(INSERT_SQL, enity.getNgayDatPhong(), enity.getNgayTraPhong(), enity.getDatCoc(), enity.getGhiChu(), enity.getMaKH(), enity.getMaPhong());
    }

    @Override
    public void delete(String key) {
	JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<DatPhong> selectAll() {
	return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public DatPhong selectByID(String key) {
	List<DatPhong> list= this.selectBySql(SELECT_BY_ID_SQL, key);
	if(list.isEmpty()){
	    return null;
	}
	return list.get(0);
    }

    @Override
    protected List<DatPhong> selectBySql(String sql, Object... args) {
	List<DatPhong> list = new ArrayList<>();
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		DatPhong entity = new DatPhong();
		entity.setMaPhong(rs.getString("MaPhong"));
		entity.setNgayDatPhong(rs.getDate("NgayDatPhong"));
		entity.setNgayTraPhong(rs.getDate("NgayTraPhong"));
		entity.setDatCoc(rs.getDouble("DatCoc"));
		entity.setGhiChu(rs.getString("GhiChu"));
		entity.setMaKH(rs.getString("MaKH"));
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
    public List<DatPhong> selectByMaDP(String key){
	String sql = "SELECT * FROM DatPhong WHERE MaPhong LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
    
    public List<DatPhong> selectByMaDP1(String key){
	String sql = "SELECT MaLoaiPhong FROM DatPhong WHERE MaPhong LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
}
