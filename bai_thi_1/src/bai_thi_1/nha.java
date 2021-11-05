/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_thi_1;

/**
 *
 * @author Dang Thi Thu H
 */
public class nha {
    int soNha;
    float giaBan;
    boolean tinhTrang;

    public nha() {
    }

    public nha(int soNha, float giaBan, boolean tinhTrang) {
        this.soNha = soNha;
        this.giaBan = giaBan;
        this.tinhTrang = tinhTrang;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        String tt="";
        if (isTinhTrang()) tt="Ban";
        else tt="Chua ban";
        return "So nha: "+soNha +", Gia ban: "+giaBan+", Tinh trang: "+tt;
    }
    
}
