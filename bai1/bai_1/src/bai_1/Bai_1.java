/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_1 {

    public static void listGiaoVien(){
        int check;
        ArrayList<giaoVien> list = new ArrayList<giaoVien>();
        while(true){
             
             giaoVien a = new giaoVien();
             a.nhap();
             list.add(a);
             System.out.println("Co muon nhap nua khong(1/0): ");
             Scanner scanner = new Scanner(System.in);
             check = scanner.nextInt();
             if (check == 0) break;   
        }
        System.out.printf("%-15s%-15s%-15s%-15s","Ho ten", "Ngay sinh", "Gioi tinh","Chuyen nganh");
        list.forEach ((item)->{
            item.xuat();
        });     
    }
    
     public static void listNhanVien(){
        int check;
        ArrayList<nhanVien> listB = new ArrayList<nhanVien>();
        while(true){
             nhanVien b = new nhanVien();
             b.nhap();
             listB.add(b);
             System.out.println("Co muon nhap nua khong(1/0): ");
             Scanner scanner = new Scanner(System.in);
             check = scanner.nextInt();
             if (check == 0) break;   
        }
        System.out.printf("%-15s%-15s%-15s%-15s%-15s","Ho ten", "Ngay sinh", "Gioi tinh","Cong viec","Phong");
        listB.forEach ((item)->{
            item.xuat();
        });     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int check=1;
        
        while (check !=3){
            System.out.println("\n1. Nhap va hien thi danh sach giao vien");
            System.out.println("2. Nhap va hien thi danh sach nhan vien");
            System.out.println("3. Ket thuc");
            Scanner scanner =  new Scanner(System.in);
            check = scanner.nextInt();
            switch (check){
                case 1: 
                    listGiaoVien();
                    break;
                case 2: 
                    listNhanVien();
                    break;
                default:
                    break;
            }
            
            
        }
    }
    
}
