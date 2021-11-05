/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4th1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ThiSinh {
    protected String hoten ;
    protected String ngaysinh ;
    protected String diachi ;

    public ThiSinh(String hoten, String ngaysinh, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public ThiSinh() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void nhap (){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập Họ Tên Thí Sinh :");
        hoten=sc.nextLine();
        System.out.println("Nhập Ngày Sinh Thí Sinh :");
        ngaysinh=sc.nextLine();
        System.out.println("Nhập Địa Chỉ THí Sinh :");
        diachi=sc.nextLine();
    }
    public void xuat (){
        System.out.printf("%-30s %-10s %-15s",hoten,ngaysinh, diachi);
    }
}
