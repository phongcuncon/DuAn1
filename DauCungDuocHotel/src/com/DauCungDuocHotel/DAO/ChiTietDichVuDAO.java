/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.ChiTietDichVu;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.util.List;

/**
 *
 * @author ps22004_taquocphong
 */
public class ChiTietDichVuDAO extends HotelDAO<ChiTietDichVu, String> {

    @Override
    public void insert(ChiTietDichVu enity) {
        String sql = "INSERT INTO ChiTietDichVu (MaHD,MaDV, SoLuong) VALUES (?, ?, ?)";
        JdbcHelper.update(sql,
                enity.getMaHD(),
                enity.getMaDV(),
                enity.getSoLuong());
    }

    @Override
    public void Update(ChiTietDichVu enity) {
        
    }
    

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ChiTietDichVu> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ChiTietDichVu selectByID(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<ChiTietDichVu> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
