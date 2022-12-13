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
    String  maNV, maPhong;
    int maCTHD, maHD;
    Double datCoc, thanhTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String maNV, String maPhong, int maCTHD, int maHD, Double datCoc, Double thanhTien) {
        this.maNV = maNV;
        this.maPhong = maPhong;
        this.maCTHD = maCTHD;
        this.maHD = maHD;
        this.datCoc = datCoc;
        this.thanhTien = thanhTien;
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

    public int getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(int maCTHD) {
        this.maCTHD = maCTHD;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
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