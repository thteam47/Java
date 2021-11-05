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
public class TaiLieu {
    String maTaiLieu;
    String nhaXuatBan;
    String soBanPhatHanh;
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma tai lieu: ");
        maTaiLieu = scanner.nextLine();
        System.out.print("Nha xuat ban: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("So ban phat hanh: ");
        soBanPhatHanh = scanner.nextLine();
    }
    public void xuat(){
        System.out.println("Ma tai lieu: "+maTaiLieu);
        System.out.println("Nha xuat ban: "+nhaXuatBan);
        System.out.println("So ban phat hanh: "+soBanPhatHanh);        
    }
}
