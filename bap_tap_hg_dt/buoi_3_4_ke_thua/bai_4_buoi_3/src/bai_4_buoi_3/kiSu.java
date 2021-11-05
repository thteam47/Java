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
public class kiSu extends canBo{
    String nganhDaoTao;
    
    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap nganh dao tao: ");
        nganhDaoTao = scanner.nextLine();
        
        
       }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s%-15s","Ki su",nganhDaoTao);
    }
}