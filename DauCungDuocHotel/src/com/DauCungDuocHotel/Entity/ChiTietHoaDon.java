/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon {
    String maCTHD, maHD, maNV, maPhong;
    Double donGia, thanhTien;

    public ChiTietHoaDon(String maCTHD, String maHD, String maNV, String maPhong, Double donGia, Double thanhTien) {
	this.maCTHD = maCTHD;
	this.maHD = maHD;
	this.maNV = maNV;
	this.maPhong = maPhong;
	this.donGia = donGia;
	this.thanhTien = thanhTien;
    }

    public ChiTietHoaDon() {
    }

    public String getMaCTHD() {
	return maCTHD;
    }

    public void setMaCTHD(String maCTHD) {
	this.maCTHD = maCTHD;
    }

    public String getMaHD() {
	return maHD;
    }

    public void setMaHD(String maHD) {
	this.maHD = maHD;
    }

    public String getMaNV() {
	return maNV;
    }

    public void setMaNV(String maNV) {
	this.maNV = maNV;
    }

    public String getMaPhong() {
	return maPhong;
    }

    public void setMaPhong(String maPhong) {
	this.maPhong = maPhong;
    }

    public Double getDonGia() {
	return donGia;
    }

    public void setDonGia(Double donGia) {
	this.donGia = donGia;
    }

    public Double getThanhTien() {
	return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
	this.thanhTien = thanhTien;
    }
    
}
