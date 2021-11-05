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
public class sach {
    String tenSach;
    int soLuong;
    float giaTien;
    
    float tinhTien;
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public float getTinhTien() {
        return tinhTien;
    }

    public void setTinhTien(int check, float thue) {
        if (check==2)
            this.tinhTien = this.giaTien*this.soLuong*0.5f;
        else if (check==3)
            this.tinhTien = this.giaTien*this.soLuong+thue;
        else 
            this.tinhTien = this.giaTien*this.soLuong;
    }
    
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten sach: " );
        tenSach = scanner.nextLine();
        System.out.print("So luong: ");
        soLuong = scanner.nextInt();
        //soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Gia tien: ");
        giaTien = scanner.nextFloat();
                
    }
    
    public void xuatTienSach(){
        System.out.println("Tien sach la: "+ tinhTien );
    }
    
}
