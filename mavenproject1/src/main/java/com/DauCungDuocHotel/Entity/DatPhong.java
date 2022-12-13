/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DatPhong {
    String maDP, ghiChu, maKH, maPhong,maHD;
    Date ngayDatPhong, ngayTraPhong;
    Double datCoc;

    public DatPhong() {
    }

    public DatPhong(String maDP, String ghiChu, String maKH, String maPhong, String maHD, Date ngayDatPhong, Date ngayTraPhong, Double datCoc) {
	this.maDP = maDP;
	this.ghiChu = ghiChu;
	this.maKH = maKH;
	this.maPhong = maPhong;
	this.maHD = maHD;
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

    public String getMaPhong() {
	return maPhong;
    }

    public void setMaPhong(String maPhong) {
	this.maPhong = maPhong;
    }

    public String getMaHD() {
	return maHD;
    }

    public void setMaHD(String maHD) {
	this.maHD = maHD;
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
