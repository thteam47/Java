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
public class hangHoa {
    String tenHang;
    float giaBan;
    
    int soLuong;
    String tinhTrang;
    public hangHoa() {
    }

    public hangHoa(String tenHang, float giaBan, int soLuong, String tinhTrang) {
        this.tenHang = tenHang;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
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

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

   
    public String view(){
        return "Ten hang: "+getTenHang()+", Gia ban: "+getGiaBan()+ ", So luong: "+getSoLuong()+", Tinh trang: "+getTinhTrang();
    }
    public String dSachHang(){
        return "Ten hang: "+getTenHang()+", Gia ban: "+getGiaBan();
    }
}
