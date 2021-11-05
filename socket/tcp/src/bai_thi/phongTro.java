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
public class phongTro {
    int maPhong;
    String loai;
    String diaChi;
    String tinhTrang;

    public phongTro() {
    }

    public phongTro(int maPhong, String loai, String diaChi, String tinhTrang) {
        this.maPhong = maPhong;
        this.loai = loai;
        this.diaChi = diaChi;
        this.tinhTrang = tinhTrang;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    

    @Override
    public String toString() {
        return "Ma phong: "+maPhong +", Loai: "+loai+", Dia chi: "+ diaChi +", Tinh trang: "+tinhTrang;
    }
    
}
