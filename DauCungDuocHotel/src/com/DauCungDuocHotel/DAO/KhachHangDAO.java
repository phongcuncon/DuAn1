/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.KhachHang;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhachHangDAO extends HotelDAO<KhachHang, String>{
    String INSERT_SQL = "INSERT INTO KhachHang(MaKH, TenKH, Tuoi, CCCD, DoThanThiet, DiaChi, Sdt, GioiTinh, GhiChu)VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KhachHang SET TenKH = ?, Tuoi = ?, CCCD = ?, DoThanThiet = ?, DiaChi = ?, Sdt = ?, GioiTinh = ?, GhiChu = ? WHERE MaKH = ?";
    String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH = ?";
    String SELECTALL_SQL = "SELECT * FROM KhachHang";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE MaKH = ?";

    @Override
    public void insert(KhachHang enity) {

        JdbcHelper.update(INSERT_SQL, enity.getMaKH(), enity.getTenKH(), enity.getTuoi(),enity.getCCCD(), enity.getDoThanThiet()
        , enity.getDiaChi(), enity.getSdt(), enity.isGioiTinh(), enity.getGhiChu());
    }

    @Override
    public void Update(KhachHang enity) {

        JdbcHelper.update(UPDATE_SQL, enity.getTenKH(), enity.getTuoi(), enity.getCCCD(), enity.getDoThanThiet()
        , enity.getDiaChi(), enity.getSdt(), enity.isGioiTinh(), enity.getGhiChu(), enity.getMaKH());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public KhachHang selectByID(String key) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, key);
	if (list.isEmpty()) {
	    return null;
	}
	return list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setTuoi(rs.getInt("Tuoi"));
                kh.setCCCD(rs.getString("CCCD"));
                kh.setDoThanThiet(rs.getString("DoThanThiet"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setSdt(rs.getString("Sdt"));
                kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                kh.setGhiChu(rs.getString("GhiChu"));
                
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
	    return list;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
//        return list;
    }

    
    public List<KhachHang> selectByKeyWord(String key){
	String sql = "SELECT * FROM KhachHang WHERE MaKH LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
    
    public List<KhachHang> selectByKeyWord2(String key){
	String sql = "SELECT * FROM KhachHang WHERE TenKH LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
    
    public List<KhachHang> selectByKeyWord1(String key){
	String sql = "SELECT * FROM KhachHang WHERE DoThanThiet LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
}
