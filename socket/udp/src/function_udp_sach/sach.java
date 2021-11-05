/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function_udp_sach;


/**
 *
 * @author Admin
 */
public class sach {
    String maSach;
    String tenSach;
    String nhaXB;
    int soLuong;
    int soLgcMuon;

    public sach() {
    }

    public sach(String maSach, String tenSach, String nhaXB, int soLuong, int soLgcMuon) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXB = nhaXB;
        this.soLuong = soLuong;
        this.soLgcMuon = soLgcMuon;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLgcMuon() {
        return soLgcMuon;
    }

    public void setSoLgcMuon(int soLgcMuon) {
        this.soLgcMuon = soLgcMuon;
    }

    @Override
    public String toString() {
        return maSach + "$" +tenSach+ "$" + nhaXB + "$" + soLuong+ "$" +soLgcMuon;
    }
   
    
}
