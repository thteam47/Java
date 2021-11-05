/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_tap_tin_ke_thua;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class student implements Serializable{
    String hoTen;
    int tuoi;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen =  scanner.nextLine();
        System.out.print("Tuoi: ");
        tuoi = scanner.nextInt();
    }
    public void xuat(){
        System.out.printf("\n%-20s%-10d",hoTen,tuoi);
        
    }
}
