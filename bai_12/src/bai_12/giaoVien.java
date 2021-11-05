/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_12;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class giaoVien extends person{
    String chuyenNganh; 

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    public void nhap2(){
        System.out.println("Chuyen nganh: ");
        Scanner scanner = new Scanner(System.in);
        this.chuyenNganh = scanner.nextLine();
    }
    public void xuat2(){
        System.out.printf("%-20s",this.chuyenNganh);
    }
}
