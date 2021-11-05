/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class teacher extends person{
    String boMon;
    int soTiet;

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }
    @Override
    public void nhap(){
        Scanner scanner=  new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap bo mon: ");
        boMon = scanner.nextLine();
        System.out.println("Nhap so tiet day: ");
        soTiet = scanner.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Bo mon: "+boMon);
        System.out.println("So tiet: "+soTiet);
    }
}
