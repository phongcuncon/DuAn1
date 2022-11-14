/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author ps22004_taquocphong
 */
public class NhanVien {
    String maNV,tenNV,tenDN, Anh,matKhau,chucDanh,Sdt,DiaChi,Email,CCCD;
    Date NgaySinh;
    boolean GioiTinh;
    public NhanVien() {
    }

    public String getMaNV() {
	return maNV;
    }

    public void setMaNV(String maNV) {
	this.maNV = maNV;
    }

    public String getTenNV() {
	return tenNV;
    }

    public void setTenNV(String tenNV) {
	this.tenNV = tenNV;
    }

    public String getTenDN() {
	return tenDN;
    }

    public void setTenDN(String tenDN) {
	this.tenDN = tenDN;
    }

    public String getAnh() {
	return Anh;
    }

    public void setAnh(String Anh) {
	this.Anh = Anh;
    }

    public String getMatKhau() {
	return matKhau;
    }

    public void setMatKhau(String matKhau) {
	this.matKhau = matKhau;
    }

    public String getChucDanh() {
	return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
	this.chucDanh = chucDanh;
    }

    public String getSdt() {
	return Sdt;
    }

    public void setSdt(String Sdt) {
	this.Sdt = Sdt;
    }

    public String getDiaChi() {
	return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
	this.DiaChi = DiaChi;
    }

    public String getEmail() {
	return Email;
    }

    public void setEmail(String Email) {
	this.Email = Email;
    }

    public String getCCCD() {
	return CCCD;
    }

    public void setCCCD(String CCCD) {
	this.CCCD = CCCD;
    }

    public Date getNgaySinh() {
	return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
	this.NgaySinh = NgaySinh;
    }

    public boolean isGioiTinh() {
	return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
	this.GioiTinh = GioiTinh;
    }

    public NhanVien(String maNV, String tenNV, String tenDN, String Anh, String matKhau, String chucDanh, String Sdt, String DiaChi, String Email, String CCCD, Date NgaySinh, boolean GioiTinh) {
	this.maNV = maNV;
	this.tenNV = tenNV;
	this.tenDN = tenDN;
	this.Anh = Anh;
	this.matKhau = matKhau;
	this.chucDanh = chucDanh;
	this.Sdt = Sdt;
	this.DiaChi = DiaChi;
	this.Email = Email;
	this.CCCD = CCCD;
	this.NgaySinh = NgaySinh;
	this.GioiTinh = GioiTinh;
    }

   
	    
}
