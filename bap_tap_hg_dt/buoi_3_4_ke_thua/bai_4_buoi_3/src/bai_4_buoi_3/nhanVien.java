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
public class nhanVien extends canBo{
    String congViec;
    
    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap cong viec: ");
        congViec = scanner.nextLine();
        
        
       }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s%-15s","Nhan vien",congViec);
    }
}
