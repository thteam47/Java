/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_ktra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class nha extends muaBan{
    int loaiNha;
    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public void nhapnha(){
        Scanner scanner = new Scanner(System.in);        
        System.out.println("1. Biet Thu");
        System.out.println("2. Chung cu");
        System.out.print("Loai nha: ");
        this.loaiNha = scanner.nextInt();                  
    }
    public void tinhNha(){
        if (this.loaiNha == 2) 
        {
            this.donGia = this.donGia*(0.9f);
        }
        sumTien();
    }

   
}
