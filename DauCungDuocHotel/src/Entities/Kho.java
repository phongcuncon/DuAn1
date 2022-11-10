/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author GIGABYTE
 */
public class Kho {
    String MaLoaiHang, TenHang, GhiChu;
    Date ThoiGianNhap;
    int SoLuong;

    public Kho() {
    }

    public Kho(String MaLoaiHang, String TenHang, String GhiChu, Date ThoiGianNhap, int SoLuong) {
        this.MaLoaiHang = MaLoaiHang;
        this.TenHang = TenHang;
        this.GhiChu = GhiChu;
        this.ThoiGianNhap = ThoiGianNhap;
        this.SoLuong = SoLuong;
    }

    public String getMaLoaiHang() {
        return MaLoaiHang;
    }

    public void setMaLoaiHang(String MaLoaiHang) {
        this.MaLoaiHang = MaLoaiHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public Date getThoiGianNhap() {
        return ThoiGianNhap;
    }

    public void setThoiGianNhap(Date ThoiGianNhap) {
        this.ThoiGianNhap = ThoiGianNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
