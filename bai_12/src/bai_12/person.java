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
public class person {
    String hoTen;
    String ngaySinh;
    String gioiTinh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = scanner.nextLine();
        
    }
    public void xuat() {
        System.out.printf("\n%-20s%-20s%-20s",this.hoTen, this.ngaySinh,this.gioiTinh);
        
    }
}
    

