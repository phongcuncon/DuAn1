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
    String maCTHD, maHD, maNV, maDatPhong;
    Double datCoc, thanhTien;

    public ChiTietHoaDon(String maCTHD, String maHD, String maNV, String maDatPhong, Double datCoc, Double thanhTien) {
        this.maCTHD = maCTHD;
        this.maHD = maHD;
        this.maNV = maNV;
        this.maDatPhong = maDatPhong;
        this.datCoc = datCoc;
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

    public String getMaDatPhong() {
        return maDatPhong;
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public Double getDatCoc() {
        return datCoc;
    }

    public void setDatCoc(Double datCoc) {
        this.datCoc = datCoc;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }
    

}