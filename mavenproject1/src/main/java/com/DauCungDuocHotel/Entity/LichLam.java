/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Entity;

import java.util.Date;

/**
 *
 * @author Nguyen Thanh Dat
 */
public class LichLam {
    String ma, hoTen, chucDanh,manv;
    Date ngayLam;
    int ca;

    public LichLam(String ma, String hoTen, String chucDanh, String manv, Date ngayLam, int ca) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.chucDanh = chucDanh;
        this.manv = manv;
        this.ngayLam = ngayLam;
        this.ca = ca;
    }

    public LichLam() {
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public Date getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(Date ngayLam) {
        this.ngayLam = ngayLam;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }
    
    
}
