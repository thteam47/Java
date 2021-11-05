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
public class sinhVien {
    String ten;
    String ngaySinh;
    String maSv;
    String queQuan;

    public sinhVien() {
    }

    public sinhVien(String ten, String ngaySinh, String maSv, String queQuan) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.maSv = maSv;
        this.queQuan = queQuan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Ma sinh vien: "+maSv+", Ho ten: "+ten+", Ngay Sinh: "+ngaySinh+", Que quan: "+queQuan;
    }
    
}
