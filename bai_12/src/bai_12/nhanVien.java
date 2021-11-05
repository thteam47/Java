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
public class nhanVien extends person{
    String congViec;
    String phong;
    

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }
    
    public void nhap1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cong viec: ");
        this.congViec = scanner.nextLine();
        System.out.print("Phong: ");
        this.phong = scanner.nextLine();
    }
    public void xuat1() {
        System.out.printf("%-20s%-20s",this.congViec,this.phong);
        
    }
    
}
