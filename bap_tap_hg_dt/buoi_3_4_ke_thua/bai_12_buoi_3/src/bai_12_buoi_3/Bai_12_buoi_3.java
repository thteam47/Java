/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_12_buoi_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_12_buoi_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<giaoVien> listGv = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        int i = 0;
        do {
            System.out.print("Nhap thong tin giao vien thu " + (++i) + "\n");
            giaoVien gv = new giaoVien();
            gv.nhap();
            listGv.add(gv);
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        } while (check != 0);
        System.out.printf("\n%-20s%-10s%-20s%-15s%-15s%-15s%-15s","Ho ten","Nam sinh","Dia chi","Luong cung","Thuong","Phat","Luong thuc");
        for (giaoVien gvVien:listGv){
            gvVien.xuat();
        }
    }

}
