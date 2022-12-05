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
public class Kho {
    String maLoaiHang,tenHang;
    Date ngayNhap;
    int soLuong;
    String ghiChu;

    public Kho(String maLoaiHang, String tenHang, Date ngayNhap, int soLuong, String ghiChu) {
	this.maLoaiHang = maLoaiHang;
	this.tenHang = tenHang;
	this.ngayNhap = ngayNhap;
	this.soLuong = soLuong;
	this.ghiChu = ghiChu;
    }

    public Kho() {
    }

    public String getMaLoaiHang() {
	return maLoaiHang;
    }

    public void setMaLoaiHang(String maLoaiHang) {
	this.maLoaiHang = maLoaiHang;
    }

    public String getTenHang() {
	return tenHang;
    }

    public void setTenHang(String tenHang) {
	this.tenHang = tenHang;
    }

    public Date getNgayNhap() {
	return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
	this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
	return soLuong;
    }

    public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
    }

    public String getGhiChu() {
	return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
	this.ghiChu = ghiChu;
    }
    
}
