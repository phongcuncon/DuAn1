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
    private String maDV,tenDV;
    private int soLuong,donGia;

    public ChiTietDichVu() {
    }

    public ChiTietDichVu(String maDV, String tenDV, int soLuong, int donGia) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    
    public Object[] toRowOrder() {
        return new Object[]{this.maDV, this.donGia, this.soLuong, this.soLuong * this.donGia};
    }

    
}
