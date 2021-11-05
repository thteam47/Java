/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_thi_8_hcgd;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class matHang implements Serializable{
    String maHang;
    String tenHang;
    float giaHang;

    public String getMaHang() {
        return maHang;
    }

    public matHang(String maHang, String tenHang, float giaHang) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaHang = giaHang;
    }

    
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getGiaHang() {
        return giaHang;
    }

    public void setGiaHang(float giaHang) {
        this.giaHang = giaHang;
    }
}
