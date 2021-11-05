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
public class sach {
    String maSach;
    String tenSach;
    String nhaXB;
    int soLuongTong;
    int soLuongMuon;

    public sach() {
    }

    public sach(String maSach, String tenSach, String nhaXB, int soLuongTong, int soLuongMuon) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXB = nhaXB;
        this.soLuongTong = soLuongTong;
        this.soLuongMuon = soLuongMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getSoLuongTong() {
        return soLuongTong;
    }

    public void setSoLuongTong(int soLuongTong) {
        this.soLuongTong = soLuongTong;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    @Override
    public String toString() {
        return "Ma sach: "+maSach+", Ten sach: "+tenSach+", Nha xuat ban: "+nhaXB+", So luong tong: "+soLuongTong+", So luong muon: "+soLuongMuon;
    }
    
    
}
