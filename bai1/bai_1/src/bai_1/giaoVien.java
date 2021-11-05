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
public class giaoVien extends person {
    private String chuyenNganh;
    
    public giaoVien() {
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public void nhap(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Chuyen nganh: ");
        this.chuyenNganh = scanner.nextLine();
    }
    public void xuat(){
        System.out.printf("\n%-15s%-15s%-15s%-15s",hoTen,ngaySinh,gioiTinh,chuyenNganh);
        
    }
    
}
