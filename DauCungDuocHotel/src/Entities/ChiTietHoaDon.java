/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author GIGABYTE
 */
public class ChiTietHoaDon {
    String MaCTHD, MaHD, MaNV, MaPhong;
    double DonGia, ThanhTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String MaCTHD, String MaHD, String MaNV, String MaPhong, double DonGia, double ThanhTien) {
        this.MaCTHD = MaCTHD;
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaPhong = MaPhong;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
    }

    public String getMaCTHD() {
        return MaCTHD;
    }

    public void setMaCTHD(String MaCTHD) {
        this.MaCTHD = MaCTHD;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
}
