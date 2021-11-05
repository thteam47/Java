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
public class sinhVien extends person implements Comparable<sinhVien>{
    private String maSv;
    float diemTB;
    
    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        
        System.out.print("Nhap ma sinh vien: ");
        maSv = scanner.nextLine();
        System.out.print("Nhap diem: ");
        diemTB = scanner.nextFloat();
    }
    @Override
    public  void xuat(){
        super.xuat();
        System.out.printf("%-15s%-10.1f",maSv,diemTB);
    }

    @Override
    public int compareTo(sinhVien other) {
        if (this.diemTB>other.diemTB)
            return 0;
        return 1;
                
        
    }
    
    
}
