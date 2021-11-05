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
public class sachGiaoKhoa extends sach{
        int check;

    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Loai sach");
        System.out.println("1. Sach moi");
        System.out.println("2. Sach cu");
        Scanner scanner = new Scanner(System.in);
        check = scanner.nextInt();
        if (check==2) setTinhTien(2,0);
        else setTinhTien(1,0);
    }
    
}
