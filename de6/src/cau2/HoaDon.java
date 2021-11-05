/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author Admin
 */
public class HoaDon {
    String matHang;
    int soLuong;

    public String getMatHang() {
        return matHang;
    }

    public void setMatHang(String matHang) {
        this.matHang = matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HoaDon(String matHang, int soLuong) {
        this.matHang = matHang;
        this.soLuong = soLuong;
    }
    public String view(){
       return "Mat hang: "+getMatHang()+", So luong: "+ getSoLuong();
    }
}

