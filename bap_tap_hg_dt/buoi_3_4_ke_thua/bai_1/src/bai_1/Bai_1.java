/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    Scanner scanner = new Scanner(System.in);

    enum xepLoai {
        Gioi, Kha, TrungBinh, Yeu, Kem
    };

    public static void main(String[] args) {
        // TODO code application logic here
        List<sinhVien> listSV = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        int i = 0;
        do {
            System.out.print("Nhap thong tin sinh vien thu " + (++i) + "\n");
            sinhVien SinhVien = new sinhVien();
            SinhVien.nhap();
            listSV.add(SinhVien);
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        } while (check != 0);
        System.out.printf("%-20s%-10s%-15s%-10s", "Ho ten", "Nam sinh", "Ma SV", "diemTB");
        for (sinhVien sv : listSV) {
            sv.xuat();
        }
        System.out.printf("\n%-20s%-10s%-15s%-10s%-20s", "Ho ten", "Nam sinh", "Ma SV", "diemTB", "Xep loai");

        for (sinhVien sv : listSV) {
            sv.xuat();
            if (sv.diemTB <= 10.0 && sv.diemTB >= 8.0) {
                System.out.printf("%-20s", xepLoai.Gioi);
            } else if (sv.diemTB < 8.0 && sv.diemTB >= 6.5) {
                System.out.printf("%-20s", xepLoai.Kha);
            } else if (sv.diemTB < 6.5 && sv.diemTB >= 5.0) {
                System.out.printf("%-20s", xepLoai.TrungBinh);
            } else if (sv.diemTB < 5.0 && sv.diemTB >= 2.5) {
                System.out.printf("%-20s", xepLoai.Yeu);
            } else {
                System.out.printf("%-20s", xepLoai.Kem);
            }

        }
        System.out.println("\nSap xep sinh vien theo diem TB");
        Collections.sort(listSV);
        System.out.printf("\n%-20s%-10s%-15s%-10s", "Ho ten", "Nam sinh", "Ma SV", "diemTB");
        for (sinhVien sv : listSV) {
            sv.xuat();
        }
        String searchMsv;
        scanner.nextLine();
        System.out.print("\nNhap ma sinh vien can tim kiem: ");
        searchMsv = scanner.nextLine();
        System.out.println("\nThong tin sinh vien tim kiem");
        System.out.printf("\n%-20s%-10s%-15s%-10s", "Ho ten", "Nam sinh", "Ma SV", "diemTB");
        for (sinhVien sv : listSV) {
            if (searchMsv.equals(sv.maSv))
                sv.xuat();
        }
    }

}
