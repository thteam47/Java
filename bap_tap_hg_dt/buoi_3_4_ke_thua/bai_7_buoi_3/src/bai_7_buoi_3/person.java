/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7_buoi_3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class person {
    String hoTen;
    int tuoi;
    int namSinh;
    String ngheNghiep;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int namSinh) {
        this.tuoi = 2020-namSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap nam sinh: " );
        namSinh = scanner.nextInt();
        setNamSinh(namSinh);
        System.out.print("Nhap nghe nghiep: ");
        scanner.nextLine();
        ngheNghiep = scanner.nextLine();
        
    }
    public void xuat(){
        System.out.printf("\n%-20s%-10d%-10d%-20s",hoTen,namSinh,getTuoi(),ngheNghiep);
    
    }
}
