/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Admin
 */
public class Nha {
    int soNha;
    float giaBan;
    boolean tinhTrang;

    public Nha(int soNha, float giaBan, boolean tinhTrang) {
        this.soNha = soNha;
        this.giaBan = giaBan;
        this.tinhTrang = tinhTrang;
    }

    public Nha() {
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
        String data;
        if (isTinhTrang()) 
            data = "Ban";
        else data = "Chua ban";
        return "So nha: "+soNha +", Gia ban: "+giaBan+", Tinh trang: "+data;
    }
    
}
