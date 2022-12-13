/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

/**
 *
 * @author Admin
 */
public class TKDichVu {
    String tenDV,MaDV;
    double tongTien;
    int soLuong;

    public TKDichVu() {
    }

    public TKDichVu(String tenDV, String MaDV, int soLuong, double tongTien) {
	this.tenDV = tenDV;
	this.MaDV = MaDV;
	this.soLuong = soLuong;
	this.tongTien = tongTien;
    }

    public String getTenDV() {
	return tenDV;
    }

    public void setTenDV(String tenDV) {
	this.tenDV = tenDV;
    }

    public String getMaDV() {
	return MaDV;
    }

    public void setMaDV(String MaDV) {
	this.MaDV = MaDV;
    }

    public int getSoLuong() {
	return soLuong;
    }

    public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
    }

    public double getTongTien() {
	return tongTien;
    }

    public void setTongTien(double tongTien) {
	this.tongTien = tongTien;
    }
	    
}
