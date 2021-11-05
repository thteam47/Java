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
public class listMua {
    String tenHang;
    int soLuong;

    public listMua(String tenHang, int soLuong) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
    }

    public String getTenHang() {
        return tenHang;
    }

    public listMua() {
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String listMu(){
        return "Ten hang: "+getTenHang()+",So luong: "+getSoLuong();
    }
}
