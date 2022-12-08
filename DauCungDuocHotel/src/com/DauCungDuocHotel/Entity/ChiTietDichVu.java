/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

import lombok.Data;

/**
 *
 * @author ps22004_taquocphong
 */
@Data
public class ChiTietDichVu{
    private String maHD,maDV;
    private int soLuong;

    public ChiTietDichVu(String maHD, String maDV, int soLuong) {
        this.maHD = maHD;
        this.maDV = maDV;
        this.soLuong = soLuong;
    }

    public ChiTietDichVu() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    
}
