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
public class Dat extends muaBan{
    int loaiDat;
    public int getLoaidat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = this.loaiDat;
    }

    public void nhapdat(){
        Scanner scanner = new Scanner(System.in);        
        System.out.println("1,2. khong ngon");
        System.out.println("3. ngon");
        System.out.print("Loai dat: ");
        this.loaiDat = scanner.nextInt();                  
    }
    public void tinhDat(){
        if (this.loaiDat==3 ) 
        {
            this.donGia = this.donGia*(1.5f);
        }
        sumTien();
    }
 
}
