/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class person {
    String hoTen;
    int namSinh;
    
    
   public void nhap(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Nhap ho ten: ");
       hoTen = scanner.nextLine();
       System.out.print("Nhap nam sinh: ");
       namSinh = scanner.nextInt();
        scanner.nextLine();
   }
   public void xuat(){
       
       System.out.printf("\n%-20s%-10d",hoTen,namSinh);
   }
    
}
