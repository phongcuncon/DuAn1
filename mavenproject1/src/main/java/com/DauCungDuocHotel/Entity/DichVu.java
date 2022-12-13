/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

/**
 *
 * @author Admin
 */
public class DichVu {
    String maDV, tenDV, ghiChu;
    Double gia;

    public DichVu(String maDV, String tenDV, String ghiChu, Double gia) {
	this.maDV = maDV;
	this.tenDV = tenDV;
	this.ghiChu = ghiChu;
	this.gia = gia;
    }

    public DichVu() {
    }

    public String getMaDV() {
	return maDV;
    }

    public void setMaDV(String maDV) {
	this.maDV = maDV;
    }

    public String getTenDV() {
	return tenDV;
    }

    public void setTenDV(String tenDV) {
	this.tenDV = tenDV;
    }

    public String getGhiChu() {
	return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
	this.ghiChu = ghiChu;
    }

    public Double getGia() {
	return gia;
    }

    public void setGia(Double gia) {
	this.gia = gia;
    }
    
}
