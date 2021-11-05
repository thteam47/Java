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
public class hinhVuong extends hinh{
    private float canh;

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }
    
     public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        this.canh =  scanner.nextFloat();
  
         chieuDai=chieuRong=canh;
         tinhChuVi();
         tinhDienTich();
    }
     
     
    
}
