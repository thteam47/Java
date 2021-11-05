/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_12_buoi_3;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class person {
    String hoTen;
    int namSinh;
    String queQuan;
    
    public void nhap(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nam sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Que quan: ");
        queQuan = scanner.nextLine();
        
            
    }
    public void xuat(){
        System.out.printf("\n%-20s%-10d%-20s",hoTen,namSinh,queQuan);
    }
}
