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
public class DatPhong {
    String maPhong, ghiChu, maKH;
    Date ngayDatPhong, ngayTraPhong;
    Double datCoc;

    public DatPhong() {
    }

    public DatPhong(String maPhong, String ghiChu, String maKH, Date ngayDatPhong, Date ngayTraPhong, Double datCoc) {
        this.maPhong = maPhong;
        this.ghiChu = ghiChu;
        this.maKH = maKH;
        this.ngayDatPhong = ngayDatPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.datCoc = datCoc;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Date getNgayDatPhong() {
        return ngayDatPhong;
    }

    public void setNgayDatPhong(Date ngayDatPhong) {
        this.ngayDatPhong = ngayDatPhong;
    }

    public Date getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(Date ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public Double getDatCoc() {
        return datCoc;
    }

    public void setDatCoc(Double datCoc) {
        this.datCoc = datCoc;
    }

 
}
