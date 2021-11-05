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
public class cauThu {
    String maCauThu;
    String tenCauThu;
    int namSinh;
    String viTri;
    float luong;

    public cauThu() {
    }

    public cauThu(String maCauThu, String tenCauThu, int namSinh, String viTri, float luong) {
        this.maCauThu = maCauThu;
        this.tenCauThu = tenCauThu;
        this.namSinh = namSinh;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaCauThu() {
        return maCauThu;
    }

    public void setMaCauThu(String maCauThu) {
        this.maCauThu = maCauThu;
    }

    public String getTenCauThu() {
        return tenCauThu;
    }

    public void setTenCauThu(String tenCauThu) {
        this.tenCauThu = tenCauThu;
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

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
}
