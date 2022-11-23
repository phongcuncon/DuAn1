/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Untils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
     private List<Object[]> getListOfArray(String sql,String[] cols, Object...args){
	try {
	    List<Object[]> list = new ArrayList<>();
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while(rs.next()){
		Object[] vals= new Object[cols.length];
		for(int i =0;i<cols.length;i++){
		    vals[i] = rs.getObject(cols[i]);
		}
		list.add(vals);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
    }
    public List<Object[]> getDichVu(){
	String sql = "{CALL sp_DichVu}";
	String[] cols = {"TenDV","MaDV","SoLuong","TongTien"};
	return this.getListOfArray(sql, cols);
    }
    public List<Object[]> getDoanhThu(String nam){
	String sql = "{CALL sp_ThongKeDoanhThu(?)}";
	String[] cols = {"NgayXuat","Phong","TenKH","MaHD","DoanhThu","MaNV"};
	return this.getListOfArray(sql, cols,nam);
    }
}
