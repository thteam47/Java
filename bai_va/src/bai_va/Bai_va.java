/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_va;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai_va {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	        int check=1;
	        ArrayList<SinhVien> listB = new ArrayList<SinhVien>();
	        while (check !=3){
	            System.out.println("1. Nhap danh sach sinh vien ");
	            System.out.println("2.danh sach thong tin sinh vien ");
	            System.out.println("3. Ket thuc ");
	            Scanner sc =  new Scanner(System.in);
	            check = sc.nextInt();
	            switch (check){
	                case 1: 
	                	System.out.printf("nhap so luong sinh vien:  ");
	                	 int n = sc.nextInt();
	                	 for(int i=0;i<n;i++) {
                                     	 SinhVien sv =new SinhVien();
	                		 sv.nhap();
	                		 listB.add(sv);
	                	 }
	                	listB.forEach ((item)->{
            item.xuat();
        });
	                  
	                    break;
	                case 2: 
	                	/*for(SinhVien sv1 :listB) {
	                	sv.xuat();
	                }*/
	                	
	                	
	                	 for(int i=0;i<listB.size();i++) {
	                		listB.get(i).xuat();
	                	 }	                 
	                    break;
	                default:
	                    break;
	            }
	            
	            
	        }
	    }
    
}
