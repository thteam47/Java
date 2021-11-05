/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<sinhVien> listSV = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check=0;
        int i=0;
        do{
            System.out.print("Nhap thong tin sinh vien thu "+(++i));
            sinhVien SinhVien = new sinhVien();
            SinhVien.nhap();
            listSV.add(SinhVien);
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        }while(check!=0);
        
        System.out.printf("%-15s%-20s%-10s%-10s%-10s", "Ma SV", "Ho ten", "Diem LT", "DiemTH", "diemTB");
        for (sinhVien sv : listSV){
            sv.xuat();
        }
        
        
    }
    
}
