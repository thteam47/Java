/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author HSEKMA
 */

public class Bai10 {
    /**
     * @param args the command line arguments
     */   
    static void nhap(int []arr,  int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < n;i++){
            System.out.println("Nhap phan tu thu "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }      
    }
  static int tong(int []arr, int n){
        if (n==1) return arr[0];
        else return arr[n-1]+tong(arr,n-1);
    }
    
    
    
    static int timMax(int []arr, int n){
        if (n==1) return arr[0];
        if (arr[n-1]>timMax(arr,n-1))
            return arr[n-1];
        else return timMax(arr,n-1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        float []arr1 = new float[1000];
        double []arr2 = new double[1000];
        int[] arr = new int[1000];
        int n =0;
        int check =1;
        Scanner scanner = new Scanner(System.in);
         do {
            System.out.println("1. Nhap day so");
            System.out.println("2. Tim lon nhat");
            System.out.println("3. Tinh tong");
            System.out.println("4. Ket thuc");
            System.out.print("Lua chon: ");
            check = scanner.nextInt();
            switch(check){
                case 1:
                    System.out.print("Nhap so luong phan tu: ");
                    n = scanner.nextInt();
                    System.out.println(n);
                    //nhap(arr,n);
                    //nhap(arr1,n);
                    nhap(arr,n);
                    break;
                    
                case 2:
                    System.out.println("Phan tu lon nhat la: "+ timMax(arr,n));
                    break;
                case 3:
                    System.out.println("Tong la: "+tong(arr,n));
                    
                    break;
                default:
         
                   break;
            }
        }while(check!=4);
    }
    
}
