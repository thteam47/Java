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
public class ThiSinhKhoiA extends ThiSinh{
    private float diemtoan;
    private float diemly;
    private float diemhoa;

    public ThiSinhKhoiA(float diemtoan, float diemly, float diemhoa, String hoten, String ngaysinh, String diachi) {
        super(hoten, ngaysinh, diachi);
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
    }

    public ThiSinhKhoiA() {
    }

    public float getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(float diemtoan) {
        this.diemtoan = diemtoan;
    }

    public float getDiemly() {
        return diemly;
    }

    public void setDiemly(float diemly) {
        this.diemly = diemly;
    }

    public float getDiemhoa() {
        return diemhoa;
    }

    public void setDiemhoa(float diemhoa) {
        this.diemhoa = diemhoa;
    }
    @Override
    public void nhap(){
    super.nhap();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Diem Toan :");
        diemtoan=scanner.nextFloat();
        System.out.println("Nhap Diem Ly :");
        diemly=scanner.nextFloat();
        System.out.println("Nhap Diem Hoa :");
        diemhoa=scanner.nextFloat();
    }
    @Override
    public void xuat(){
    super.xuat();
        System.out.printf(" %-5.2f %-5.2f %-5.2f\n",diemtoan,diemly,diemhoa);
    }
    
}
