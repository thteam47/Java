/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7_buoi_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_7_buoi_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ArrayList<hoGiaDinh> listHoGiaDInh = new ArrayList<>();
        int i=0;
        int check=0;
        do{
            System.out.print("Nhap ho dan thu "+(++i)+"\n");
            hoGiaDinh hgd = new hoGiaDinh();
            hgd.nhapHoGiaDinh();
            listHoGiaDInh.add(hgd);
            System.out.print("Co muon nhap nua khong(1/0): ");
            check = scanner.nextInt();
                    
        }while(check!=0);
        i=0;
        for (hoGiaDinh hdgDinh: listHoGiaDInh){
            System.out.println("\nThong tin ho gia dinh: "+(++i)+"\n");
            hdgDinh.xuatHoGiaDinh();
        }
            
            
    }
    
}
