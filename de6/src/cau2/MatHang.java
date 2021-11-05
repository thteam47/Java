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
public class MatHang {
    String maHang;
    String tenHang;
    float giaBan;
    int soLuong;

    public String getMaHang() {
        return maHang;
    }

    public MatHang(String maHang, String tenHang, float giaBan, int soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String view(){
        return "Ma hang: "+getMaHang()+ ", Ten hang: "+getTenHang()+", Gia ban: "+getGiaBan()+", So luong ton kho: "+ getSoLuong();
    }
    
}
