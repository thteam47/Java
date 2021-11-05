/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class student extends person{
    int khoa;
    String lop;   

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }
    
    
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void nhap1(){
        Scanner scanner = new Scanner(System.in);
        nhap();
        System.out.println("Nhap khoa hoc: ");
        khoa = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Nhap lop: ");
        lop = scanner.nextLine();
    }
    public void xuat1(){
        xuat();
        System.out.println("Khoa hoc: "+khoa);
        System.out.println("Lop: "+lop);
    }
}
