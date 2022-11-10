/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author GIGABYTE
 */
public class DichVu {
    String MaDV, TenDV, GhiChu;
    double Gia;

    public DichVu() {
    }

    public DichVu(String MaDV, String TenDV, String GhiChu, double Gia) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.GhiChu = GhiChu;
        this.Gia = Gia;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }
    
}
