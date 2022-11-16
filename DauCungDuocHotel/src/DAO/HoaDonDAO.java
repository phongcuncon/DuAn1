/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.HoaDon;
import Entity.Phong;
import Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonDAO extends HotelDAO<HoaDon, String> {

    String INSERT_SQL = "INSERT INTO HoaDon(MaHD,DiaChi,Gia,MaKH, MaDV)VALUES(?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HoaDon SET DiaChi = ?, Gia = ?, MaKH = ?, MaDV = ? WHERE MaHD = ?";
    String DELETE_SQL = "DELETE FROM HoaDon WHERE MaHD = ?";
    String SELECTALL_SQL = "SELECT * FROM HoaDon";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDon WHERE MaHD = ?";

    @Override
    public void insert(HoaDon enity) {
	JdbcHelper.update(INSERT_SQL, enity.getMaHD(), enity.getDiaChi(), enity.getGia(), enity.getMaKH(), enity.getMaDV());
    }

    @Override
    public void Update(HoaDon enity) {
	JdbcHelper.update(UPDATE_SQL, enity.getDiaChi(), enity.getGia(), enity.getMaKH(), enity.getMaDV(), enity.getMaHD());
    }

    @Override
    public void delete(String key) {
	JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<HoaDon> selectAll() {
	return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public HoaDon selectByID(String key) {
	List<HoaDon> list = this.selectBySql(SELECT_BY_ID_SQL, key);
	if (list.isEmpty()) {
	    return null;
	}
	return list.get(0);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
	List<HoaDon> list = new ArrayList<>();
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while (rs.next()) {
		HoaDon entity = new HoaDon();
		entity.setMaHD(rs.getString("MaHD"));
		entity.setDiaChi(rs.getString("DiaChi"));
		entity.setGia(rs.getDouble("Gia"));
		entity.setMaKH(rs.getString("MaKH"));
		entity.setMaDV(rs.getString("MaDV"));
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
}
