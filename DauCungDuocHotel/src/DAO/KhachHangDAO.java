/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.KhachHang;
import Untils.JdbcHelper;
<<<<<<< Updated upstream
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        JdbcHelper.update(INSERT_SQL, enity.getMaKH(), enity.getTenKH(), enity.getTuoi(), enity.getCCCD(),
                enity.getDoThanThiet(), enity.getDiaChi(), enity.getSdt(), enity.isGioiTinh(), enity.getGhiChu());
=======
        JdbcHelper.update(INSERT_SQL, enity.getMaKH(), enity.getTenKH(), enity.getCCCD(), enity.getDoThanThiet()
        , enity.getDiaChi(), enity.getSdt(), enity.isGioiTinh(), enity.getGhiChu());
>>>>>>> Stashed changes
    }

    @Override
    public void Update(KhachHang enity) {
<<<<<<< Updated upstream
        JdbcHelper.update(UPDATE_SQL, enity.getTenKH(), enity.getTuoi(), enity.getCCCD(), enity.getDoThanThiet(),
                enity.getDiaChi(), enity.getSdt(), enity.isGioiTinh(), enity.getGhiChu(), enity.getMaKH());
=======
        JdbcHelper.update(UPDATE_SQL, enity.getTenKH(), enity.getTuoi(), enity.getCCCD(), enity.getDoThanThiet()
        , enity.getDiaChi(), enity.getSdt(), enity.isGioiTinh(), enity.getGhiChu(), enity.getMaKH());
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
=======
	if (list.isEmpty()) {
	    return null;
	}
	return list.get(0);
>>>>>>> Stashed changes
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
<<<<<<< Updated upstream
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
=======
	try {
	    ResultSet rs = JdbcHelper.query(sql, args);
	    while (rs.next()) {
		KhachHang entity = new KhachHang();
		entity.setMaKH(rs.getString("MaKH"));
		entity.setTenKH(rs.getString("TenKH"));
		entity.setTuoi(rs.getInt("Tuoi"));
		entity.setCCCD(rs.getInt("CCCD"));
		entity.setDoThanThiet(rs.getString("DoThanThiet"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setSdt(rs.getString("Sdt"));
                entity.setGioiTinh(true);
                entity.setGhiChu(rs.getString("GhiChu"));
		list.add(entity);
	    }
	    rs.getStatement().getConnection().close();
	    return list;
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }   
>>>>>>> Stashed changes
    
    public List<KhachHang> selectByKeyWord(String key){
	String sql = "SELECT * FROM KhachHang WHERE MaKH LIKE ?";
	return selectBySql(sql, "%" + key + "%");
    }
}
