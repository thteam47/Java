/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_19;

import java.awt.AWTEventMulticaster;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exam_19 {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    public static void taolistNha (List<nha> listNha){
        int check=1;
        int dem=1;
        
        do {
            System.out.println("Nhap thong tin nha thu "+ (dem++));
            nha nha1 = new nha();
            nha1.nhap();
            listNha.add(nha1);
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        } while(check!=0);
        
    }
    public static void xuatNha(List<nha> listNha){
        int dem=1;
        for (nha nha1:listNha){
            System.out.println("Thong tin nha thu "+ (dem++));
            nha1.xuat();
        }
    }
    
    public static void main(String[] args) {
        int luachon=1;
        List<nha> listNha = new ArrayList<>();
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Nhap va tinh tien nha");
        System.out.println("2. Nhap va tinh tien dat");
        System.out.println("3. Ket thuc");
        System.out.print("Lua chon: ");
        luachon = scanner.nextInt();
        switch(luachon){
            case 1: 
                taolistNha(listNha);
                xuatNha(listNha);
                break;
            case 2: 
                dat dat1 = new dat();
                dat1.nhap();
                dat1.xuat();
                break;
            default: break;
        }
        } while(luachon!=3);    
    }
    
}
