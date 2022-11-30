/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.TKDichVu;
import Entity.ThongKe;
import Untils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
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
		vals.setMaNV(rs.getString("MaNV"));
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
}
