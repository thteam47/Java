/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4_buoi_3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class congNhan extends canBo {

    int bac;

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        do {
            System.out.print("Nhap bac: ");
            bac = scanner.nextInt();
            if ((bac < 1 || bac > 9)) System.out.println("\nNhap lai he so bac. (1-9)");
        } while (bac < 1 || bac > 9);

    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-20s%-15d","Cong nhan", bac);
    }
}
