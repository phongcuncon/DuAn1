/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.LichLam;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Nguyen Thanh Dat
 */
public class LichLamDAO extends HotelDAO<LichLam, String>{
    String INSERT_SQL = "INSERT INTO LichLam(Ma, HoTen, ChucDanh, NgayLam, Ca, MaNV)VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE LichLam SET ChucDanh = ?, NgayLam = ?, Ca = ? WHERE Ma = ?";
    String DELETE_SQL = "DELETE FROM LichLam WHERE Ma = ?";
    String SELECTALL_SQL = "SELECT * FROM LichLam";
    String SELECT_BY_ID_SQL = "SELECT * FROM LichLam WHERE Ma = ?";

    @Override
    public void insert(LichLam enity) {
        JdbcHelper.update(INSERT_SQL, enity.getMa(), enity.getHoTen(),enity.getChucDanh(),enity.getNgayLam(),enity.getCa(),enity.getManv());
    }

    @Override
    public void Update(LichLam enity) {
        JdbcHelper.update(UPDATE_SQL, enity.getHoTen(),enity.getChucDanh(),enity.getNgayLam(),enity.getCa(),enity.getManv(),enity.getMa());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<LichLam> selectAll() {
        return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public LichLam selectByID(String key) {
        List<LichLam> list= this.selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<LichLam> selectBySql(String sql, Object... args) {
        List<LichLam> list= new ArrayList<>();
        try{
            ResultSet rs= JdbcHelper.query(sql, args);
            while(rs.next()){
                LichLam lm= new LichLam();
                lm.setMa(rs.getString("Ma"));
                lm.setHoTen(rs.getString("HoTen"));
                lm.setChucDanh(rs.getString("ChucDanh"));
                lm.setNgayLam(rs.getDate("NgayLam"));
                lm.setCa(Integer.valueOf(rs.getString("Ca")));
                lm.setManv(rs.getString("MaNV"));
                
                list.add(lm);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
//        return null;
    }

    
}
