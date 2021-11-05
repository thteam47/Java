/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de10java;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class De10java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int check=1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Nhap va tinh tien Sach giao khoa");
            System.out.println("2. Nhap va tinh tien Sach tham khao");
            System.out.println("3. Ket thuc");
            System.out.print("Lua chon: ");
            check = scanner.nextInt();
            switch(check){
                case 1:
                    sachGiaoKhoa sgk = new sachGiaoKhoa();
                    sgk.nhap();
                    sgk.xuatTienSach();
                    break;
                case  2:
                    sachThamKhao stk = new sachThamKhao();
                    stk.nhap();
                    stk.xuatTienSach();
                    break;
                default: break;
            }
            
        } while(check!=3);
    }
}
