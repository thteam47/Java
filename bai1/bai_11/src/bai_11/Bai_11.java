/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_11;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int check=1;
        
        while (check !=3){
            System.out.println("\n1. Hinh chu nhat");
            System.out.println("2. Hinh vuong");
            System.out.println("3. Ket thuc");
            Scanner scanner =  new Scanner(System.in);
            check = scanner.nextInt();
            switch (check){
                case 1: 
                    hinhCN hcn = new hinhCN();
                     hcn.nhap();
                       hcn.show();
                    hcn.showChuVi();
                     hcn.showDienTich();
                    break;
                case 2: 
                    hinhVuong hv = new hinhVuong();
                    hv.nhap();
                    hv.show();
                       hv.showChuVi();
                  hv.showDienTich();
                    break;
                default:
                    break;
            }
            
            
        }
    }
    
}
