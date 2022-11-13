/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.NhanVien;
import Untils.JdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ps22004_taquocphong
 */
public class NhanVienDAO extends DauCungDuocDAO<NhanVien, String> {
    
    String INSERT_SQL = "INSERT INTO NhanVien (MaNV, TenNV, TenDN, Anh, MatKhau) VALUES (?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NhanVien SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?,MaNV=? WHERE MaNH=?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaNV(),
                entity.getTenNV(),
                entity.getTenDN(),
                entity.getMatKhau(),
                entity.getAnh(),
                entity.getChucDanh());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaNV(),
                entity.getTenNV(),
                entity.getTenDN(),
                entity.getMatKhau(),
                entity.getAnh(),
                entity.getChucDanh());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list= this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> list= new ArrayList<>();
        try{
            ResultSet rs= JdbcHelper.query(sql, args);
            while(rs.next()){
                NhanVien entity= new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setTenDN(rs.getString("TenDN"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setChucDanh(rs.getString("ChucDanh"));
                entity.setAnh(rs.getString("MaNV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
