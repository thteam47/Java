/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4_buoi_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_4_buoi_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<canBo> listCB = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        int i = 0;
        do {
            System.out.print("Nhap thong tin can bo thu " + (++i) + "\n");
            System.out.println("Can bo nay la: ");
            System.out.println("1. Cong nhan");
            System.out.println("2. Ki su");
            System.out.println("3. Nhan vien");
            System.out.print("Lua chon: ");
            check = scanner.nextInt();
            if (check == 1) {
                canBo cCN = new congNhan();
                cCN.nhap();
                listCB.add(cCN);
            }
            else if (check == 2) {
                canBo kis = new kiSu();
                kis.nhap();
                listCB.add(kis);
            }
            else {
                canBo nhav = new nhanVien();
                nhav.nhap();
                listCB.add(nhav);
            }
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        } while (check != 0);
        
        System.out.printf("\n%-20s%-10s%-15s%-20s%-20s%-15s","Ho ten","Nam sinh","Gioi tinh","Dia chi","Can bo","Thong tin");
        for (canBo cb : listCB){
            cb.xuat();
        }
        scanner.nextLine();
        String nameString;
        System.out.print("\n Nhap thong tin can bo can tim kiem: ");
        nameString = scanner.nextLine();
        System.out.println("\nThong tin can bo");
        System.out.printf("\n%-20s%-10s%-15s%-20s%-20s%-15s","Ho ten","Nam sinh","Gioi tinh","Dia chi","Can bo","Thong tin");
        for (canBo cb : listCB){
            if (cb.hoTen.equals(nameString))
                cb.xuat();
        }
    }

}
