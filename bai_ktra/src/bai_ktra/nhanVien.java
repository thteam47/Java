/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_ktra;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class nhanVien {
    String MaNv;
    String ten;
    int thamNien;

    public nhanVien() {
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    
    public void nhap(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Ngay sinh: ");
        this.ten = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        this.MaNv = scanner.nextLine();  
        System.out.print("Gioi tinh: ");
        this.thamNien = scanner.nextInt();
    
    }
    public void xuat( ){
        
        System.out.printf("\n%-15s%-15s%-15d%",ten,MaNv,thamNien);
    }
    
    
}
