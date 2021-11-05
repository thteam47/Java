/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_10_buoi_3;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class tuyenSinh {

    List<sinhVien> listSv = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

    public void nhapList() {
        int check = 0;
        int i = 0;
        do {
            System.out.print("Nhap thong tin sinh vien thu " + (++i) + "\n");
            sinhVien SinhVien = new sinhVien();
            SinhVien.nhap();
            listSv.add(SinhVien);
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        } while (check != 0);
    }
    public void xuatList(){
        System.out.printf("\n%-10s%-20s%-20s%-20s%-10s%-20s","So BD","Ho ten","Dia chi","Diem uu tien","Khoi","To hop mon");
        for (sinhVien svVien:listSv){
            svVien.xuat();
        }
    }
    public void search_sbd(){
        String sbdlString;
        scanner.nextLine();
        System.out.print("\nNhap so bao danh can tim: ");
        sbdlString = scanner.nextLine();
        System.out.println("\nThong tin sinh vien can tim");
        System.out.printf("\n%-10s%-20s%-20s%-20s%-10s%-20s","So BD","Ho ten","Dia chi","Diem uu tien","Khoi","To hop mon");
        for (sinhVien svVien:listSv){
            if (svVien.soBaoDanh.equals(sbdlString))
                svVien.xuat();
        }
    }
    public void ghiFile() {
        try (PrintWriter pw = new PrintWriter(new File("sinhvien.DAT"))) {
            pw.printf("%-10s%-10s%-20s%-20s%-20s%-10s%-20s","STT","So BD","Ho ten","Dia chi","Diem uu tien","Khoi","To hop mon");
            pw.println();
            int st = 1;
            for (sinhVien info : listSv) {
                pw.printf("\n%-10d%-10s%-20s%-20s%-20.1f%-10s%-20s",st++,info.getSoBaoDanh(),info.getHoTen(),info.getDiaChi(),info.getDiemUuTien(),info.getKhoi(),info.getToHopMon());
                pw.println();
            }
        } catch (Exception e) {
            System.out.println("Got on exception!");
        }
    }
}
