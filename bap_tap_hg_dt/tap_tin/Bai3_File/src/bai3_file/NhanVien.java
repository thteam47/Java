/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_file;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhanVien extends Person {

    String phongban;
    int hesoluong;
    float thamnien;
    float luongcoban;
    float luongthuclinh;

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public int getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(int hesoluong) {
        this.hesoluong = hesoluong;
    }

    public float getThamnien() {
        return thamnien;
    }

    public void setThamnien(float thamnien) {
        this.thamnien = thamnien;
    }

    public float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(float luongcoban) {
        this.luongcoban = luongcoban;
    }

    public float getLuongthuclinh() {
        return ((this.luongcoban) * this.hesoluong * (1 + (this.thamnien) / 100));
    }

    public void setLuongthuclinh(float luongthuclinh) {
        this.luongthuclinh = luongthuclinh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phòng ban :");
        phongban = sc.nextLine();
        System.out.println("Nhập hệ số lương :");
        hesoluong = sc.nextInt();
        System.out.println("Nhập thâm niên :");
        thamnien = sc.nextFloat();
        System.out.println("Nhập lương cơ bản :");
        luongcoban = sc.nextFloat();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-20s %-10d %-10.1f %-10.2f %-10.2f\n", phongban, hesoluong, thamnien, luongcoban,getLuongthuclinh());
    }
}
