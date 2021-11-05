/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class sinhVien {

    private String maSV;
    private String hoTen;
    private float DiemTH;
    private float DiemLT;

    public sinhVien() {
    }

    public sinhVien(String maSV, String hoTen, float DiemTH, float DiemLT) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.DiemTH = DiemTH;
        this.DiemLT = DiemLT;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(float DiemTH) {
        this.DiemTH = DiemTH;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(float DiemLT) {
        this.DiemLT = DiemLT;
    }

    public float diemTB() {
        return (DiemLT + DiemTH) / 2;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap ma sinh vien: ");
        maSV = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Diem TH: ");
        DiemTH = scanner.nextFloat();
        System.out.print("Diem LT: ");
        DiemLT = scanner.nextFloat();
    }

    public void xuat() {
        System.out.printf("\n%-15s%-20s%-10.1f%-10.1f%-10.1f", maSV, hoTen, DiemLT, DiemTH, diemTB());
    }

}
