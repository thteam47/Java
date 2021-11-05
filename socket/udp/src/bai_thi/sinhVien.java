/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_thi;

/**
 *
 * @author Admin
 */
public class sinhVien {

    String maSv;
    String hoTen;
    String lop;
    String khoa;
    String khoaH;

    public sinhVien(String maSv, String hoTen, String lop, String khoa, String khoaH) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.khoa = khoa;
        this.khoaH = khoaH;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getKhoaH() {
        return khoaH;
    }

    public void setKhoaH(String khoaH) {
        this.khoaH = khoaH;
    }

    @Override
    public String toString() {
        return maSv + "$" +hoTen+ "$" + lop + "$" + khoa+ "$" +khoaH; //To change body of generated methods, choose Tools | Templates.
    }

    

    public String toString1() {
        return "Ma sinh vien: " + maSv + ", Ho ten: " + hoTen + ", Lop: " + lop + ", Khoa: " + khoa + ", Khoa: " + khoaH; //To change body of generated methods, choose Tools | Templates.
    }

}
