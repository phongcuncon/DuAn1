/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

/**
 *
 * @author Admin
 */
public class Phong {
    String maPhong, trangThai,maLoaiPhong;
    int Tang;
    Double giaTheoNgay, giaTheoGio;

    public Phong() {
    }

    public Phong(String maPhong, String trangThai, String maLoaiPhong, int Tang, Double giaTheoNgay, Double giaTheoGio) {
	this.maPhong = maPhong;
	this.trangThai = trangThai;
	this.maLoaiPhong = maLoaiPhong;
	this.Tang = Tang;
	this.giaTheoNgay = giaTheoNgay;
	this.giaTheoGio = giaTheoGio;
    }

    public String getMaPhong() {
	return maPhong;
    }

    public void setMaPhong(String maPhong) {
	this.maPhong = maPhong;
    }

    public String getTrangThai() {
	return trangThai;
    }

    public void setTrangThai(String trangThai) {
	this.trangThai = trangThai;
    }

    public String getMaLoaiPhong() {
	return maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
	this.maLoaiPhong = maLoaiPhong;
    }

    public int getTang() {
	return Tang;
    }

    public void setTang(int Tang) {
	this.Tang = Tang;
    }

    public Double getGiaTheoNgay() {
	return giaTheoNgay;
    }

    public void setGiaTheoNgay(Double giaTheoNgay) {
	this.giaTheoNgay = giaTheoNgay;
    }

    public Double getGiaTheoGio() {
	return giaTheoGio;
    }

    public void setGiaTheoGio(Double giaTheoGio) {
	this.giaTheoGio = giaTheoGio;
    }
    
	    
}
