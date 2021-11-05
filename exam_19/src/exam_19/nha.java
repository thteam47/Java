/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_19;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class nha extends muaBan{
    
    int loaiNha;

    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Loai nha: ");
        System.out.println("1. Biet thu");
        System.out.println("2. Chung thu");
        System.out.print("Lua chon: ");
        Scanner scanner = new Scanner(System.in);
        this.loaiNha= scanner.nextInt();
        if (loaiNha==2) setDonGia(2);
        setTinhTien();
    }
    @Override 
    public void xuat(){
        super.xuat();
        if (loaiNha==1) System.out.println("Loai nha: Biet thu");
        else if (loaiNha==2) System.out.println("Loai nha: Chung cu");
        System.out.println("Thanh tien: "+tinhTien);
        
    }
}
