/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_2_ql_sinh_vien;

/**
 *
 * @author Admin
 */
public class sinhVien {
    String hoTen;
    String ngaySinh;
    String maSv;
    String address;

    public sinhVien() {
    }

    public sinhVien(String hoTen, String ngaySinh, String maSv, String address) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.maSv = maSv;
        this.address = address;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return hoTen+ "$" + ngaySinh + "$" + maSv+ "$" +address; //To change body of generated methods, choose Tools | Templates.
    }
    public String toString1() {
        return "Ho va ten: "+ hoTen+ ",Ngay sinh: " +ngaySinh + ",Ma sinh vien: " + maSv+ ",Dia chi: " +address; //To change body of generated methods, choose Tools | Templates.
    }

    

   
}
