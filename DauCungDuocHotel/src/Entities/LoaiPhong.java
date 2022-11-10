/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Admin
 */
public class LoaiPhong {
    String maLoaiPhong, tenLoaiPhong;
    Double donGia;

    public LoaiPhong() {
    }

    public LoaiPhong(String maLoaiPhong, String tenLoaiPhong, Double donGia) {
	this.maLoaiPhong = maLoaiPhong;
	this.tenLoaiPhong = tenLoaiPhong;
	this.donGia = donGia;
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

    public Double getDonGia() {
	return donGia;
    }

    public void setDonGia(Double donGia) {
	this.donGia = donGia;
    }
    
}
