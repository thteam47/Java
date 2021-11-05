/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<thiSinh> listSV = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        int i = 0;
        float diemMax = 0;
        do {
            System.out.print("Nhap thong tin thi vien thu " + (++i));
            thiSinh SinhVien = new thiSinh();
            SinhVien.nhap();
            diemMax = SinhVien.tinhTongDiem();
            listSV.add(SinhVien);
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        } while (check != 0);
        System.out.printf("%-15s%-20s%-10s%-10s%-10s%-10s", "Ma SV", "Ho ten", "Diem Toan", "Diem Ly", "Diem Hoa", "Tong");
        for (thiSinh sv : listSV) {

            sv.xuat();
        }

        System.out.println("\nThong tin sinh vien co diem lon nhat");
        System.out.printf("%-15s%-20s%-10s%-10s%-10s%-10s", "Ma SV", "Ho ten", "Diem Toan", "Diem Ly", "Diem Hoa", "Tong");
        for (thiSinh sv : listSV) {
            if (sv.tinhTongDiem() == diemMax) {
                sv.xuat();
            }
        }
        System.out.println("\nDanh sach duoc sap xep theo ho ten");
        System.out.printf("%-15s%-20s%-10s%-10s%-10s%-10s", "Ma SV", "Ho ten", "Diem Toan", "Diem Ly", "Diem Hoa", "Tong");
        Collections.sort(listSV);
        for (thiSinh sv : listSV) {

            sv.xuat();
        }
    }

}
