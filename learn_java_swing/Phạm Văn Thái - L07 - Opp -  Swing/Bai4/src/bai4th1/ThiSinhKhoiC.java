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
public class ThiSinhKhoiC extends ThiSinh{
    private float diemvan ;
    private float diemsu ;
    private float diemdia ;

    public ThiSinhKhoiC(float diemvan, float diemsu, float diemdia, String hoten, String ngaysinh, String diachi) {
        super(hoten, ngaysinh, diachi);
        this.diemvan = diemvan;
        this.diemsu = diemsu;
        this.diemdia = diemdia;
    }

    public ThiSinhKhoiC() {
    }

    public float getDiemvan() {
        return diemvan;
    }

    public void setDiemvan(float diemvan) {
        this.diemvan = diemvan;
    }

    public float getDiemsu() {
        return diemsu;
    }

    public void setDiemsu(float diemsu) {
        this.diemsu = diemsu;
    }

    public float getDiemdia() {
        return diemdia;
    }

    public void setDiemdia(float diemdia) {
        this.diemdia = diemdia;
    }

    @Override
    public void nhap(){
    super.nhap();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Diem Van :");
        diemvan=scanner.nextFloat();
        System.out.println("Nhap Diem Su :");
        diemsu=scanner.nextFloat();
        System.out.println("Nhap Diem Dia :");
        diemdia=scanner.nextFloat();
    }
    @Override
    public void xuat(){
    super.xuat();
        System.out.printf(" %-5.2f %-5.2f %-5.2f\n",diemvan,diemsu,diemdia);
    }
    
}
