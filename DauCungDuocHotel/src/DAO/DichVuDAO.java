/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.DichVu;
import Entity.HoaDon;
import Untils.JdbcHelper;
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
	JdbcHelper.update(INSERT_SQL, enity.getTenDV(), enity.getGia(), enity.getGhiChu(), enity.getMaDV());
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
	List<DichVu> list = this.selectBySql(SELECTALL_SQL, key);
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

}
