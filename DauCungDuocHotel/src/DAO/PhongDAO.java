/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.Phong;
import Untils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dieucap
 */
public class PhongDAO extends DauCungDuocDAO<Phong, String> {
    final String INSERT_SQL = "INSERT INTO Phong (MaPhong, TrangThai, MaLoaiPhong, Tang, GiaTheoNgay, GiaTheoGio) VALUES (?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE Phong SET TrangThai=?, MaLoaiPhong=?, Tang=?, GiaTheoNgay=?, GiaTheoGio=? WHERE MaPhong=?";
    final String DELETE_SQL = "DELETE FROM Phong WHERE MaPhong=?";
    final String SELECT_ALL_SQL = "SELECT * FROM Phong";
    final String SELECT_BY_ID_SQL = "SELECT * FROM Phong WHERE MaPhong=?";

    @Override
    public void insert(Phong entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaPhong(),
                entity.getTrangThai(),
                entity.getMaLoaiPhong(),
                entity.getTang(),
                entity.getGiaTheoNgay(),
                entity.getGiaTheoGio());
    }

    @Override
    public void update(Phong entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getTrangThai(),               
                entity.getMaLoaiPhong(),
                entity.getTang(),
                entity.getGiaTheoNgay(),
                entity.getGiaTheoGio(),
                entity.getMaPhong());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public Phong selectById(String id) {
        List<Phong> list = selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<Phong> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<Phong> selectBySQL(String sql, Object... args) {
        List<Phong> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Phong e = new Phong();
                e.setMaPhong(rs.getString("MaPhong"));
                e.setMaPhong(rs.getString("MaPhong"));
                e.setGiaTheoGio(rs.getDouble("GiaTheoNgay"));
                e.setGiaTheoNgay(rs.getDouble("GiaTheoGio"));
                e.setTrangThai(rs.getString("TrangThai"));
                e.setTang(rs.getInt("Tang"));
                list.add(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;   
    }
    
}
