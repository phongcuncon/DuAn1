/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DatPhong {
    String maDP, ghiChu, maKH, maLoaiPhong, maPhong;
    Date ngayDatPhong, ngayTraPhong;
    Double datCoc;

    public DatPhong() {
    }

    public DatPhong(String maDP, String ghiChu, String maKH, String maLoaiPhong, String maPhong, Date ngayDatPhong, Date ngayTraPhong, Double datCoc) {
	this.maDP = maDP;
	this.ghiChu = ghiChu;
	this.maKH = maKH;
	this.maLoaiPhong = maLoaiPhong;
	this.maPhong = maPhong;
	this.ngayDatPhong = ngayDatPhong;
	this.ngayTraPhong = ngayTraPhong;
	this.datCoc = datCoc;
    }

    public String getMaDP() {
	return maDP;
    }

    public void setMaDP(String maDP) {
	this.maDP = maDP;
    }

    public String getGhiChu() {
	return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
	this.ghiChu = ghiChu;
    }

    public String getMaKH() {
	return maKH;
    }

    public void setMaKH(String maKH) {
	this.maKH = maKH;
    }

    public String getMaLoaiPhong() {
	return maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
	this.maLoaiPhong = maLoaiPhong;
    }

    public String getMaPhong() {
	return maPhong;
    }

    public void setMaPhong(String maPhong) {
	this.maPhong = maPhong;
    }

    public Date getNgayDatPhong() {
	return ngayDatPhong;
    }

    public void setNgayDatPhong(Date ngayDatPhong) {
	this.ngayDatPhong = ngayDatPhong;
    }

    public Date getNgayTraPhong() {
	return ngayTraPhong;
    }

    public void setNgayTraPhong(Date ngayTraPhong) {
	this.ngayTraPhong = ngayTraPhong;
    }

    public Double getDatCoc() {
	return datCoc;
    }

    public void setDatCoc(Double datCoc) {
	this.datCoc = datCoc;
    }
    
    
}
