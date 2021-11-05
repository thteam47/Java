/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3_1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_3_1 {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    //ham nhap mang

    static void nhap_mang(int[] a, int n) {
        System.out.println("Nhap phan tu mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = scanner.nextInt();
        }
    }

    static void xuat(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", a[i]);
        }
    }

    static void sx_tang(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        xuat(a, n);
    }
    static void tim_max(int[] a, int n){
        int max=a[0];
        for (int i=0; i<n; i++){
            if (a[i]>max)
                max=a[i];
        }
        System.out.println("Phan tu max: "+max);
        System.out.print("Nam tai chi so: ");
        for (int i=0; i<n; i++){
            if (a[i]==max)
                System.out.print(i);
        }
        int max2=0;
        for (int i=0; i<n; i++){
            if (a[i]!=max)
            {
                max2=a[i];
                for (int j=0; j<n; j++){
                    if(a[j]>max2&&a[j]!=max)
                        max2=a[j];
                }
                break;
            }
        }
        System.out.println();
        System.out.println("Phan tu max thu 2: "+max2);
        System.out.print("Nam tai chi so: ");
        for (int i=0; i<n; i++){
            if (a[i]==max2)
                System.out.print(i);
        }
    }
    static void chen(int []a, int n){
        int x;
        System.out.print("So x can chen: ");
        x= scanner.nextInt();
        System.out.println("Mang sau khi chen");
        int []b= new int[n+1];
        for (int i=0; i<n+1;i++){
            if (x>a[i])
                b[i]=a[i];
            else {
                for (int j=i+1;j<n+1;j++){
                    b[j]=a[j-1];
                }
                b[i]=x;
                break;
            }
            
        }
        xuat(b, n+1);
        
    }
    void menu(){
    System.out.printf("\nMenu");
    System.out.printf("\n1. Nhap phan tu mang");    
    System.out.printf("\n2. Sap Xep Mang Tang Dan");
    System.out.printf("\n3. Tim phan tu lon nhat va thu 2");
    System.out.printf("\n4. Chen so nguyen x");
    System.out.printf("\n5. Thoat");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        int []a =null;
        int lc;
        Bai_3_1 bai3 = new Bai_3_1();
        Scanner scanner = new Scanner(System.in);
    do {
        bai3.menu();
        System.out.printf("\nLua chon: ");
        lc = scanner.nextInt();
        switch (lc) {
        case 1:
            System.out.print("Nhap so phan tu mang: ");
            n = scanner.nextInt();
            a= new int[n];
            bai3.nhap_mang(a, n);
            break;
        case 2:
            System.out.println("Mang sau khi sap xep");
            bai3.sx_tang(a, n);
            break;
        case 3:
            bai3.tim_max(a, n);
            break;
        case 4:            
            bai3.chen(a, n);
            break;
        case 5:
            break;
        default: {
            System.out.printf("\nLua chon khong hop le");
            break;
        }
        }
    } while (lc!=5);
    }

}
