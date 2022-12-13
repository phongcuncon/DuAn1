/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.DichVu;
import com.DauCungDuocHotel.Entity.HoaDon;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DichVuDAO extends HotelDAO<DichVu, String> {

    String INSERT_SQL = "INSERT INTO DichVu(MaDV,TenDV,Gia,GhiChu)VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE DichVu SET TenDV = ?, Gia = ?, GhiChu = ? WHERE MaDV = ?";
    String DELETE_SQL = "DELETE FROM DichVu WHERE MaDV = ?";
    String SELECTALL_SQL = "SELECT * FROM DichVu";
    String SELECT_BY_ID_SQL = "SELECT * FROM DichVu WHERE MaDV = ?";

    @Override
    public void insert(DichVu enity) {
	JdbcHelper.update(INSERT_SQL, enity.getMaDV(), enity.getTenDV(), enity.getGia(), enity.getGhiChu());
    }

    @Override
    public void Update(DichVu enity) {
	JdbcHelper.update(UPDATE_SQL, enity.getTenDV(), enity.getGia(), enity.getGhiChu(), enity.getMaDV());
    }

    @Override
    public void delete(String key) {
	JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<DichVu> selectAll() {
	return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public DichVu selectByID(String key) {
	List<DichVu> list = this.selectBySql(SELECT_BY_ID_SQL, key);
	if(list.isEmpty()){
	    return null;
	}
	return list.get(0);
    }

    @Override
    protected List<DichVu> selectBySql(String sql, Object... args) {
	List<DichVu> list = new ArrayList<>();
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while (rs.next()) {
		DichVu entity = new DichVu();
		entity.setMaDV(rs.getString("MaDV"));
		entity.setTenDV(rs.getString("TenDV"));
		entity.setGia(rs.getDouble("Gia"));
		entity.setGhiChu(rs.getString("GhiChu"));
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    public List<DichVu> selectByKeyword(String keyword) {
        String SQL = "SELECT * FROM DichVu WHERE MaDV LIKE ?";
        return this.selectBySql(SQL, "%" + keyword + "%");
    }
    
    public List<DichVu> selectNotInCourse(String kw) {
        String sql = "SELECT * FROM DichVu WHERE TenDV LIKE ?";
        return this.selectBySql(sql, "%" + kw + "%");
    }
    public String selectByName(String key) {
        String sql = "Select * from DichVu where TenDV like ?";
	List<DichVu> list= this.selectBySql(sql, key);
	if(list.isEmpty()){
	    return null;
	}
	return list.get(0).getMaDV();
    }
}
