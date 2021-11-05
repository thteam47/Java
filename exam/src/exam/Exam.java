/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
     ArrayList<nhanVien> list = new ArrayList<nhanVien>();
      public static void listNhanVien(){
        int check;
        while(true){
             
             nhanVien a = new nhanVien();
             a.nhap();
             list.add(a);
             System.out.println("Co muon nhap nua khong(1/0): ");
             Scanner scanner = new Scanner(System.in);
             check = scanner.nextInt();
             if (check == 0) break;   
        }
          
    }
    static void showNhanVien(){
        System.out.printf("%-15s%-15s%-15d%","Ho Ten", "Ma NV","Tham Nien");
        list.forEach ((item)->{
            item.xuat();
        });   
    }
    static void showThamNien(){
        System.out.println("Thong tin nhan vien co tham nien tren 10 nam la:");
        list.forEach ((item)->{
            if (item.thamNien>10){
                item.xuat();
            }
        });
        
    }
    static void menu(){
        System.out.println("1. Nhap danh sach nhan vien");
        System.out.println("2. Hien thi danh sach nhan vien");
        System.out.println("3. Hien thi danh sach nhan vien co tham nien tren 10 nam");
        System.out.println("4. Ket thuc");
        System.out.print("Lua Chon: ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int check=1;
        Scanner scanner = new Scanner(System.in);
        do{
            menu();
            check = scanner.nextInt();
            switch (check){
                case 1: 
                    listNhanVien();
                    break;
                case 2:
                    showNhanVien();
                    break;
                case 3:
                    showThamNien();
                    break;
                default:
                    break;
                    
            }
        }while (check!=4);
    }
    
}
