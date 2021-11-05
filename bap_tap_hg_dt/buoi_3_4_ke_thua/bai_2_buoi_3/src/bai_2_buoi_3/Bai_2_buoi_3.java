/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_buoi_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_2_buoi_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Sach> listSV = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check=0;
        int i=0;
        do{
            System.out.print("Nhap thong tin sach thu "+(++i)+"\n");
            Sach sach = new Sach();
            sach.nhap();
            listSV.add(sach);
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        }while(check!=0);
        
        for (Sach s : listSV){
            s.xuat();
        }
    }
    
}
