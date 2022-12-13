/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.ChiTietDichVu;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ps22004_taquocphong
 */
public class ChiTietDichVuDAO extends HotelDAO<ChiTietDichVu, String> {
    String INSERT_SQL = "INSERT INTO ChiTietDichVu (MaPhong,MaDV, SoLuong,ThanhTien) VALUES (?, ?, ?,?)";
    String UPDATE_SQL = "UPDATE<ChiTietDichVu SET MaDV = ?, SoLuong = ?, ThanhTien = ? WHERE MaPhong = ?";
    String DELETE_SQL = "DELETE FROM<ChiTietDichVu WHERE MaPhong = ?";
    String SELECTALL_SQL = "SELECT * FROM<ChiTietDichVu";
    String SELECT_BY_ID_SQL = "SELECT * FROM<ChiTietDichVu WHERE MaPhong = ?";

    @Override
    public void insert(ChiTietDichVu enity) {
        JdbcHelper.update(INSERT_SQL,
                enity.getMaPhong(),
                enity.getMaDV(),
                enity.getSoLuong(),
                enity.getThanhTien());
    }
    @Override
    public void Update(ChiTietDichVu enity) {
	JdbcHelper.update(UPDATE_SQL,enity.getMaDV(),enity.getSoLuong(),enity.getThanhTien(),enity.getMaPhong());
    }
    @Override
    public void delete(String key) {
	JdbcHelper.update(DELETE_SQL, key);
		
    }

    @Override
    public List<ChiTietDichVu> selectAll() {
	return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public ChiTietDichVu selectByID(String key) {
	List<ChiTietDichVu> list= this.selectBySql(SELECT_BY_ID_SQL, key);
	if(list.isEmpty()){
	    return null;
	}
	return list.get(0);
    }

    @Override
    protected List<ChiTietDichVu> selectBySql(String sql, Object... args) {
	List<ChiTietDichVu> list = new ArrayList<>();
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		ChiTietDichVu entity = new ChiTietDichVu();
		entity.setMaPhong(rs.getString("MaPhong"));
		entity.setMaDV(rs.getString("MaDV"));
		entity.setSoLuong(rs.getInt("soLuong"));
		entity.setThanhTien(rs.getDouble("thanhTien"));
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
   
    
}
