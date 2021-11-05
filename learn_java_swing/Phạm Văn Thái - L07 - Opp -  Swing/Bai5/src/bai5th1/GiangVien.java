/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5th1;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class GiangVien implements Serializable{
    protected String hoten ;
    protected String magv ;
    protected String diachi ;
    protected String gioitinh ;
    protected String khoa;

    public GiangVien(String hoten, String magv, String diachi, String gioitinh, String khoa) {
        this.hoten = hoten;
        this.magv = magv;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.khoa = khoa;
    }

    public GiangVien() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
}
