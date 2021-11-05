/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class hinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    public float tinhChuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public float tinhDienTich(){
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return "Chieu dai: "+ chieuDai + "\nChieu rong: "+chieuRong+ "\nChu vi: "+tinhChuVi()+"\nDien tich: "+tinhDienTich();
    }
    public static void main(String[] args) {
        hinhChuNhat hcn = new hinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        hcn.chieuDai = scanner.nextFloat();
        System.out.print("Nhap chieu rong: ");
        hcn.chieuRong =  scanner.nextFloat();
        System.out.println(hcn.toString());
    }
    
    
    
}
