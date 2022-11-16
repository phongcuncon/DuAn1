/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.DatPhong;
import Entity.KhachHang;
import Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DatPhongDAO extends HotelDAO<DatPhong, String> {
    String INSERT_SQL = "INSERT INTO DatPhong(MaDP, NgayDatPhong, NgayTraPhong, DatCoc, GhiChu, MaKH, MaLoaiPhong, MaPhong)VALUES(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE DatPhong SET NgayDatPhong = ?, NgayTraPhong = ?, DatCoc = ?, GhiChu = ?, MaKH = ?, MaLoaiPhong = ?, MaPhong = ? WHERE MaDP = ?";
    String DELETE_SQL = "DELETE FROM DatPhong WHERE MaDP = ?";
    String SELECTALL_SQL = "SELECT * FROM DatPhong";
    String SELECT_BY_ID_SQL = "SELECT * FROM DatPhong WHERE MaDP = ?";
    @Override
    public void insert(DatPhong enity) {
	JdbcHelper.update(INSERT_SQL, enity.getMaDP(), enity.getNgayDatPhong(), enity.getNgayTraPhong(), enity.getDatCoc(), enity.getGhiChu(), enity.getMaKH(), enity.getMaLoaiPhong(), enity.getMaPhong());
    }

    @Override
    public void Update(DatPhong enity) {
	JdbcHelper.update(INSERT_SQL, enity.getNgayDatPhong(), enity.getNgayTraPhong(), enity.getDatCoc(), enity.getGhiChu(), enity.getMaKH(), enity.getMaLoaiPhong(), enity.getMaPhong(), enity.getMaDP());
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
		entity.setMaDP(rs.getString("MaDP"));
		entity.setNgayDatPhong(rs.getDate("NgayDatPhong"));
		entity.setNgayTraPhong(rs.getDate("NgayTraPhong"));
		entity.setDatCoc(rs.getDouble("DatCoc"));
		entity.setGhiChu(rs.getString("GhiChu"));
		entity.setMaKH(rs.getString("MaKH"));
		entity.setMaLoaiPhong(rs.getString("MaLoaiPhong"));
		entity.setMaPhong(rs.getString("MaPhong"));
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
}
