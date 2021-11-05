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
public class sachThamKhao extends sach{
    float thue;
    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thue: ");
        thue = scanner.nextFloat();
        setTinhTien(3, thue);
        
    }
}
