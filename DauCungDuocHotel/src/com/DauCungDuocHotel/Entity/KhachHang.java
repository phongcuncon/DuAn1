/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

/**
 *
 * @author Admin
 */
public class KhachHang {
    String maKH, tenKH, doThanThiet, diaChi, sdt, ghiChu, CCCD;
    int tuoi;
    boolean gioiTinh;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String doThanThiet, String diaChi, String sdt, String ghiChu, int tuoi, String CCCD, boolean gioiTinh) {
	this.maKH = maKH;
	this.tenKH = tenKH;
	this.doThanThiet = doThanThiet;
	this.diaChi = diaChi;
	this.sdt = sdt;
	this.ghiChu = ghiChu;
	this.tuoi = tuoi;
	this.CCCD = CCCD;
	this.gioiTinh = gioiTinh;
    }

    public String getMaKH() {
	return maKH;
    }

    public void setMaKH(String maKH) {
	this.maKH = maKH;
    }

    public String getTenKH() {
	return tenKH;
    }

    public void setTenKH(String tenKH) {
	this.tenKH = tenKH;
    }

    public String getDoThanThiet() {
	return doThanThiet;
    }

    public void setDoThanThiet(String doThanThiet) {
	this.doThanThiet = doThanThiet;
    }

    public String getDiaChi() {
	return diaChi;
    }

    public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
    }

    public String getSdt() {
	return sdt;
    }

    public void setSdt(String sdt) {
	this.sdt = sdt;
    }

    public String getGhiChu() {
	return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
	this.ghiChu = ghiChu;
    }

    public int getTuoi() {
	return tuoi;
    }

    public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
    }

    public String getCCCD() {
	return CCCD;
    }

    public void setCCCD(String CCCD) {
	this.CCCD = CCCD;
    }

    public boolean isGioiTinh() {
	return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
	this.gioiTinh = gioiTinh;
    }
    
    
}
