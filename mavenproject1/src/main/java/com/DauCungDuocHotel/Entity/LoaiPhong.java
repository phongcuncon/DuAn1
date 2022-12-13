/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

/**
 *
 * @author Admin
 */
public class LoaiPhong {
    String maLoaiPhong, tenLoaiPhong;

    public LoaiPhong() {
    }

    public LoaiPhong(String maLoaiPhong, String tenLoaiPhong) {
	this.maLoaiPhong = maLoaiPhong;
	this.tenLoaiPhong = tenLoaiPhong;
    }

    public String getMaLoaiPhong() {
	return maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
	this.maLoaiPhong = maLoaiPhong;
    }

    public String getTenLoaiPhong() {
	return tenLoaiPhong;
    }

    public void setTenLoaiPhong(String tenLoaiPhong) {
	this.tenLoaiPhong = tenLoaiPhong;
    }

    
}
