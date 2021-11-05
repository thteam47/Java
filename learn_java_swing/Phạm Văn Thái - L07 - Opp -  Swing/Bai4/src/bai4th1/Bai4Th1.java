/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4th1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai4Th1 {

    ArrayList<ThiSinhKhoiA> ka = new ArrayList<>();
    ArrayList<ThiSinhKhoiC> kc = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    Scanner scanner = new Scanner(System.in);

    public void nhapa() {
        int check = 0;
        do {
            ThiSinhKhoiA tska = new ThiSinhKhoiA();
            tska.nhap();
            ka.add(tska);
            System.out.println("nhap tiep hay khong 0/1");
            check = scanner.nextInt();
        } while (check != 0);
    }

    public void nhapc() {

        int check = 0;
        do {
            ThiSinhKhoiC tskc = new ThiSinhKhoiC();
            tskc.nhap();
            kc.add(tskc);
            System.out.println("nhap tiep hay khong 0/1");
            check = scanner.nextInt();
        } while (check != 0);
    }

    public void doca() {
        System.out.println("Thi Sinh Khoi A");
        System.out.printf("%-30s %-10s %-15s %-5s %-5s %-5s\n", "Ho Ten", "Ngay Sinh", "Dia Chi", "Dtoan", "Dly", "Dhoa");
        for (ThiSinhKhoiA info : ka) {
            if ((info.getDiemhoa() + info.getDiemly() + info.getDiemtoan()) > 20) {
                info.xuat();
            }
        }
    }

    public void docc() {

        System.out.println("Thi Sinh Khoi C");
        System.out.printf("%-30s %-10s %-15s %-5s %-5s %-5s\n", "Ho Ten", "Ngay Sinh", "Dia Chi", "Dtvan", "Dsu", "Ddia");
        for (ThiSinhKhoiC info : kc) {
            if ((info.getDiemsu() + info.getDiemvan() + info.getDiemdia()) > 20) {
                info.xuat();
            }
        }
    }

    public static void main(String[] args) {
        Bai4Th1 bai4 = new Bai4Th1();
        int check1 = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 :Nhap Thi Sinh Khoi A");
            System.out.println("2 :Nhap Thi Sinh Khoi C");
            System.out.println("3 :In Danh Sach Thi Sinh Trung Tuyen");
            System.out.println("0 :Thoat");
            System.out.println("Nhap Lua Chon");
            check1 = scanner.nextInt();
            switch (check1) {
                case 1:
                    bai4.nhapa();
                    break;
                case 2:
                    bai4.nhapc();
                    break;
                case 3:
                    bai4.doca();
                    bai4.docc();
                    break;
            }
        } while (check1 != 0);
    }

}
