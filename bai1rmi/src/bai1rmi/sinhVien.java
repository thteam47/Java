
package bai1rmi;

import java.io.Serializable;

public class sinhVien implements Serializable{
    String maSv;
    String hoTen;
    String diaChi;
    String gioiTinh;
    Float diem;

    public sinhVien() {
    }

    public sinhVien(String maSv, String hoTen, String diaChi, String gioiTinh, Float diem) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Float getDiem() {
        return diem;
    }

    public void setDiem(Float diem) {
        this.diem = diem;
    }
    @Override
    public String toString() {
        return "Ma sinh vien: "+maSv+", Ho ten: "+hoTen + ", Dia chi: "+diaChi +",Gioi tinh: "+gioiTinh+", Diem: "+diem;
    }
}
