/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.KhachHang;
import java.util.List;

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
	throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Update(KhachHang enity) {
	throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String key) {
	throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHang> selectAll() {
	throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public KhachHang selectByID(String key) {
	throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
	throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
