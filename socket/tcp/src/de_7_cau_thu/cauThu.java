/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_7_cau_thu;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class cauThu {
    String maCauThu;
    String ten;
    int namSinh;
    String viTri;
    float luongMD;

    public cauThu() {
    }

    @Override
    public String toString() {
        return maCauThu + "$" + ten + "$" + namSinh + "$" + viTri + "$" + luongMD;
    }

    public cauThu(String maCauThu, String ten, int namSinh, String viTri, float luongMD) {
        this.maCauThu = maCauThu;
        this.ten = ten;
        this.namSinh = namSinh;
        this.viTri = viTri;
        this.luongMD = luongMD;
    }

    public String getMaCauThu() {
        return maCauThu;
    }

    public void setMaCauThu(String maCauThu) {
        this.maCauThu = maCauThu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public float getLuongMD() {
        return luongMD;
    }

    public void setLuongMD(float luongMD) {
        this.luongMD = luongMD;
    }
    
}
