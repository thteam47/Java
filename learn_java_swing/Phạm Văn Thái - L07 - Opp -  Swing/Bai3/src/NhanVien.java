
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class NhanVien extends Person{
    private String phongban ;
    private int thammien;
    private int hsluong ;
    private float luongcb;
    private float luongtl;
    

    public NhanVien(String phongban, int hsluong, float luongcb, String hoten, Date ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hsluong = hsluong;
        this.luongcb = luongcb;
    }

    public NhanVien() {
    }

    public float getLuongtl() {
        return luongcb *hsluong*(1+thammien);
}
    public int getThammien() {
        return thammien;
    }

    public void setThammien(int thammien) {
        this.thammien = thammien;
    }

    public void setLuongtl(float luongtl) {
        this.luongtl = luongtl;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public int getHsluong() {
        return hsluong;
    }

    public void setHsluong(int hsluong) {
        this.hsluong = hsluong;
    }

    public float getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(float luongcb) {
        this.luongcb = luongcb;
    }

    @Override
    public String toString() {
        return "NhanVien{" +super.toString()+ "phongban=" + phongban + ", hsluong=" + hsluong + ", luongcb=" + luongcb  +"luong thuc linh = "+getLuongtl()+'}';
    }
    
}
