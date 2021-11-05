/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_11;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class hinhCN extends hinh{
    
    public hinhCN() {
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.chieuDai =  scanner.nextFloat();
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = scanner.nextFloat();
        tinhChuVi();
        tinhDienTich();
    }
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

  
   
    
    
    
         
}
