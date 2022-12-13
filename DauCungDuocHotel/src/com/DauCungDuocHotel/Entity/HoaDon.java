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
public class HoaDon {
    int maHD;
    String maPhong;
    Date NgayXuat;

    public HoaDon() {
    }

    public HoaDon(int maHD, String maPhong, Date NgayXuat) {
        this.maHD = maHD;
        this.maPhong = maPhong;
        this.NgayXuat = NgayXuat;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public Date getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(Date NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    
    
}
