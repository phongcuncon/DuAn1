/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author GIGABYTE
 */
public class HoaDon {
    String MaHD, DiaChi, MaKH, MaDV;
    double Gia;

    public HoaDon() {
    }

    public HoaDon(String MaHD, String DiaChi, String MaKH, String MaDV, double Gia) {
        this.MaHD = MaHD;
        this.DiaChi = DiaChi;
        this.MaKH = MaKH;
        this.MaDV = MaDV;
        this.Gia = Gia;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }
    
}
