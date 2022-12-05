/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

/**
 *
 * @author Admin
 */
public class HoaDon {
    String maHD, diaChi, maKH, maDV;
    Double gia;

    public HoaDon(String maHD, String diaChi, String maKH, String maDV, Double gia) {
	this.maHD = maHD;
	this.diaChi = diaChi;
	this.maKH = maKH;
	this.maDV = maDV;
	this.gia = gia;
    }

    public HoaDon() {
    }

    public String getMaHD() {
	return maHD;
    }

    public void setMaHD(String maHD) {
	this.maHD = maHD;
    }

    public String getDiaChi() {
	return diaChi;
    }

    public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
    }

    public String getMaKH() {
	return maKH;
    }

    public void setMaKH(String maKH) {
	this.maKH = maKH;
    }

    public String getMaDV() {
	return maDV;
    }

    public void setMaDV(String maDV) {
	this.maDV = maDV;
    }

    public Double getGia() {
	return gia;
    }

    public void setGia(Double gia) {
	this.gia = gia;
    }
    
}
