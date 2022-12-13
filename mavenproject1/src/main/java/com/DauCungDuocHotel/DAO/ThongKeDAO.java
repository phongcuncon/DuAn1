/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import com.DauCungDuocHotel.Entity.TKDichVu;
import com.DauCungDuocHotel.Entity.ThongKe;
import com.DauCungDuocHotel.Untils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
     private List<ThongKe> getListOfArray(String sql,String[] cols, Object...args){
	try {
	    List<ThongKe> list = new ArrayList<>();
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		ThongKe vals= new ThongKe();
		vals.setNgayXuat(rs.getDate("NgayXuat"));
		vals.setMaHD(rs.getString("MaHD"));
		vals.setDoanhThu(rs.getFloat("DoanhThu"));
		vals.setPhong(rs.getString("Phong"));
		vals.setTenKH(rs.getString("TenKH"));
		list.add(vals);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
    }
     private List<TKDichVu> getListOfArray1(String sql,String[] cols, Object...args){
	try {
	    List<TKDichVu> list = new ArrayList<>();
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		TKDichVu vals= new TKDichVu();
		vals.setMaDV(rs.getString("MaDV"));
		vals.setTenDV(rs.getString("TenDV"));
		vals.setSoLuong(rs.getInt("SoLuong"));
		vals.setTongTien(rs.getDouble("TongTien"));
		
		list.add(vals);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
    }
    public List<TKDichVu> getDichVu(){
	String sql = "{CALL sp_DichVu}";
	String[] cols = {"TenDV","MaDV","SoLuong","TongTien"};
	return this.getListOfArray1(sql, cols);
    }
    public List<ThongKe> getDoanhThu(String nam){
	String sql = "{CALL sp_ThongKeDoanhThu(?)}";
	String[] cols = {"NgayXuat","Phong","TenKH","MaHD","DoanhThu","MaNV"};
	return this.getListOfArray(sql, cols,nam);
    }
    private String SELECT_DOANH_THU = "SELECT SUM(THANHTOAN) FROM DONHANG WHERE YEAR(NGAYTAO)=? GROUP BY MONTH(NGAYTAO)";
    private String THONG_KE_THEO_THOI_GIAN = "SELECT SUM(THANHTOAN) AS TONG, MIN(THANHTOAN) AS THAPNHAT, MAX(THANHTOAN) AS CAONHAT, AVG(THANHTOAN) AS TRUNGBINH FROM DONHANG WHERE NGAYTAO BETWEEN ? AND ?";

    public List<Double> layDoanhThuTheoNam(int year) {
        List<Double> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(SELECT_DOANH_THU, year);
            while (rs.next()) {
                list.add(rs.getDouble(1));
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<Double> thongKeDoanhThuTheoThoiGian(Date start, Date end) {
        List<Double> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(THONG_KE_THEO_THOI_GIAN, start, end);
            while (rs.next()) {
                list.add(rs.getDouble("Tong"));
                list.add(rs.getDouble("CaoNhat"));
                list.add(rs.getDouble("ThapNhat"));
                list.add(rs.getDouble("TrungBinh"));
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
