/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<teacher> listgv = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        do {
            teacher gv = new teacher();
            gv.nhap();
            listgv.add(gv);
            System.out.println("ban co muon nhap tiep khong (1/0)");
            check= scanner.nextInt();
        } while (check != 0);
        int i=0;
        for (var gvv: listgv){
            
            System.out.println("Nhap thong tin thu " +(i++));
            gvv.xuat();
        }

    }

}
