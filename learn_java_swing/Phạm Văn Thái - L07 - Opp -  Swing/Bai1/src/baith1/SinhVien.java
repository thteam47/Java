/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith1;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class SinhVien implements Serializable{
    protected String maSv;
    protected String hoTen ;
    protected Date ngaySinh ;
    protected String gioiTinh ;
    protected float diemTb;

    public SinhVien(String maSv, String hoTen, Date ngaySinh, String gioiTinh, float diemTb) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTb = diemTb;
    }

    public SinhVien() {
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(float diemTb) {
        this.diemTb = diemTb;
    }
    public void hienThi()
    {
        System.out.printf("%-10s %-30s %-15s %-10s %-5.2f",maSv, hoTen, ngaySinh, gioiTinh, diemTb);
    }
}
