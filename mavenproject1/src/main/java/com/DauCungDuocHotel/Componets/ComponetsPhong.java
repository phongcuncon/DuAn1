/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.Componets;

import com.DauCungDuocHotel.Entity.Phong;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lombok.AllArgsConstructor;
/**
 *
 * @author Admin
 */
@AllArgsConstructor
public class ComponetsPhong {
    private JPanel lblPhong;
    private JLabel tenPong;
    private JLabel trangThai;
    private JLabel loaiPhong;

   

    public void show(Phong phong) {
	tenPong.setText(phong.getMaPhong());
        trangThai.setText(phong.getTrangThai());
        loaiPhong.setText(phong.getMaLoaiPhong() + "");
    }

    public void clear() {
	this.tenPong.setText("");
        this.trangThai.setText("");
        this.loaiPhong.setText( "");
    }
}
