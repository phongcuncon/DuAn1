/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DauCungDuocHotel.Untils;

import com.DauCungDuocHotel.Entity.NhanVien;

/**
 *
 * @author ps22004_taquocphong
 */
public class Auth {

    public static NhanVien user = null; // Duy tri User dang nhap vao he thong 

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
	
        return Auth.isLogin() && user.getChucDanh().equalsIgnoreCase("Quản lí");
    }
}
