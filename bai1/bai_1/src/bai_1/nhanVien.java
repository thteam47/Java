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
public class nhanVien extends person{
    private String congViec;
    private String phong;

    public nhanVien() {
    }

    public String getCongViec() {
        return congViec;
    }

    public String getPhong() {
        return phong;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }
    
    public void nhap(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Cong viec: ");
        this.congViec = scanner.nextLine();
        System.out.print("Phong: ");
        this.phong = scanner.nextLine();
    }
    public void xuat( ){
        
        System.out.printf("\n%-15s%-15s%-15s%-15s%-15s",hoTen,ngaySinh,gioiTinh,congViec,phong);
    }
    
}
