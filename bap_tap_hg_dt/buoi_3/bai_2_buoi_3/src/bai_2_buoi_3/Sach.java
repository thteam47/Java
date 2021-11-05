/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_buoi_3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Sach extends TaiLieu{
    String tenTacGia;
    int soTrang;
    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Ten tac gia: ");
        tenTacGia = scanner.nextLine();
        System.out.print("So trang: ");
        soTrang = scanner.nextInt();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Ten tac gia: "+tenTacGia);
        System.out.println("So trang: "+soTrang);
    }
}
