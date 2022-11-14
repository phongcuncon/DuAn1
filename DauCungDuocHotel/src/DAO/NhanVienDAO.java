/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.NhanVien;
import Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ps22004_taquocphong
 */
public class NhanVienDAO extends HotelDAO<NhanVien, String>{
     String INSERT_SQL = "INSERT INTO NhanVien(MaNV,TenNV,TenDN,Anh, MatKhau,ChucDanh, Sdt, DiaChi, NgaySinh, GioiTinh,Email, CCCD)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET TenNV = ?, TenDN = ?, Anh = ?, MatKhau = ?, ChucDanh = ?, Sdt = ? , DiaChi = ?, NgaySinh = ?, GioiTinh = ?, Email = ?, CCCD = ?WHERE MaNV = ?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECTALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";

    @Override
    public void insert(NhanVien enity) {
	JdbcHelper.update(INSERT_SQL, enity.getMaNV(),enity.getTenNV(),enity.getTenDN(),enity.getAnh(),enity.getMatKhau(),enity.getChucDanh(),enity.getSdt(),enity.getDiaChi(),enity.getNgaySinh(),enity.isGioiTinh(),enity.getEmail(),enity.getCCCD());
	
    }

    @Override
    public void Update(NhanVien enity) {
	JdbcHelper.update(UPDATE_SQL, enity.getTenNV(),enity.getTenDN(),enity.getAnh(),enity.getMatKhau(),enity.getChucDanh(),enity.getSdt(),enity.getDiaChi(),enity.getNgaySinh(),enity.isGioiTinh(),enity.getEmail(),enity.getCCCD(),enity.getMaNV());
    }

    @Override
    public void delete(String key) {
	JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<NhanVien> selectAll() {
	return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public NhanVien selectByID(String key) {
	List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
	if(list.isEmpty()){
	    return null;
	}
	return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
	List<NhanVien> list = new ArrayList<>();
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		NhanVien entity = new NhanVien();
		entity.setMaNV(rs.getString("MaNV"));
		entity.setTenNV(rs.getString("TenNV"));
		entity.setTenDN(rs.getString("TenDN"));
		entity.setAnh(rs.getString("Anh"));
		entity.setMatKhau(rs.getString("MatKhau"));
		entity.setChucDanh(rs.getString("ChucDanh"));
		entity.setSdt(rs.getString("Sdt"));
		entity.setDiaChi(rs.getString("DiaChi"));
		entity.setNgaySinh(rs.getDate("NgaySinh"));
		entity.setGioiTinh(rs.getBoolean("GioiTinh"));
		entity.setEmail(rs.getString("Email"));
		entity.setCCCD(rs.getString("CCCD"));
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    public List<NhanVien> selectByKeyWord(String key){
	String sql = "SELECT * FROM NhanVien WHERE MaNV LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
    public List<NhanVien> selectByKey(String key){
	String sql = "SELECT * FROM NhanVien WHERE ChucDanh LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
   
}
