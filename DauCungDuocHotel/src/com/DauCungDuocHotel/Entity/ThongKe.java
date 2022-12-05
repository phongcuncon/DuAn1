/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

import java.util.Date;
import lombok.Data;
/**
 *
 * @author Admin
 */
@Data
public class ThongKe {
    Date NgayXuat;
    String MaHD,TenKH,MaNV,Phong;
    double DoanhThu;

    public ThongKe(Date NgayXuat, String MaHD, String TenKH, String MaNV, String Phong, double DoanhThu) {
	this.NgayXuat = NgayXuat;
	this.MaHD = MaHD;
	this.TenKH = TenKH;
	this.MaNV = MaNV;
	this.Phong = Phong;
	this.DoanhThu = DoanhThu;
    }

    public ThongKe() {
    }

    public Date getNgayXuat() {
	return NgayXuat;
    }

    public void setNgayXuat(Date NgayXuat) {
	this.NgayXuat = NgayXuat;
    }

    public String getMaHD() {
	return MaHD;
    }

    public void setMaHD(String MaHD) {
	this.MaHD = MaHD;
    }

    public String getTenKH() {
	return TenKH;
    }

    public void setTenKH(String TenKH) {
	this.TenKH = TenKH;
    }

    public String getMaNV() {
	return MaNV;
    }

    public void setMaNV(String MaNV) {
	this.MaNV = MaNV;
    }

    public String getPhong() {
	return Phong;
    }

    public void setPhong(String Phong) {
	this.Phong = Phong;
    }

    public double getDoanhThu() {
	return DoanhThu;
    }

    public void setDoanhThu(double DoanhThu) {
	this.DoanhThu = DoanhThu;
    }
	    
}
