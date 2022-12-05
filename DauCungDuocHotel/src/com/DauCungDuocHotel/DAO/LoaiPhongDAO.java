/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.LoaiPhong;
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
public class LoaiPhongDAO extends HotelDAO<LoaiPhong, String>{
    String INSERT_SQL = "INSERT INTO LoaiPhong(MaLoaiPhong,TenLoaiPhong)VALUES(?,?,?)";
    String UPDATE_SQL = "UPDATE LoaiPhong SET TenLoaiPhong = ? WHERE MaLoaiPhong = ?";
    String DELETE_SQL = "DELETE FROM LoaiPhong WHERE MaLoaiPhong = ?";
    String SELECTALL_SQL = "SELECT * FROM LoaiPhong";
    String SELECT_BY_ID_SQL = "SELECT * FROM LoaiPhong WHERE MaLoaiPhong = ?";

    @Override
    public void insert(LoaiPhong enity) {
	JdbcHelper.update(INSERT_SQL, enity.getMaLoaiPhong(),enity.getTenLoaiPhong());
    }

    @Override
    public void Update(LoaiPhong enity) {
	JdbcHelper.update(UPDATE_SQL, enity.getTenLoaiPhong(),enity.getMaLoaiPhong());
    }

    @Override
    public void delete(String key) {
	JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<LoaiPhong> selectAll() {
	return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public LoaiPhong selectByID(String key) {
	List<LoaiPhong> list = this.selectBySql(SELECT_BY_ID_SQL,key);
	if(list.isEmpty()){
	    return null;
	}
	return list.get(0);
    }

    @Override
    protected List<LoaiPhong> selectBySql(String sql, Object... args) {
	List<LoaiPhong> list = new ArrayList<>();
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		LoaiPhong entity = new LoaiPhong();
		entity.setMaLoaiPhong(rs.getString("MaLoaiPhong"));
		entity.setTenLoaiPhong(rs.getString("TenLoaiPhong"));
		
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
}
