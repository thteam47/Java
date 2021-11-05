/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_12_buoi_3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class giaoVien extends  person{
    float luongCuong;
    float thuong;
    float phat;
    float luongThuc;

    public float getLuongCuong() {
        return luongCuong;
    }

    public void setLuongCuong(float luongCuong) {
        this.luongCuong = luongCuong;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    public float getPhat() {
        return phat;
    }

    public void setPhat(float phat) {
        this.phat = phat;
    }

    public float getLuongThuc() {
        return luongThuc;
    }

    public void setLuongThuc() {
        this.luongThuc = luongCuong+thuong-phat;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Luong cung: ");
        luongCuong = scanner.nextFloat();
        System.out.print("Thuong: ");
        thuong = scanner.nextFloat();
        System.out.print("Phat: ");
        phat = scanner.nextFloat();
        setLuongThuc();
              
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-15.1f%-15.1f%-15.1f%-15.1f",luongCuong,thuong,phat,luongThuc);
    }
}
