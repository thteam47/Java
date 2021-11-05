/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_4 {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);

    static void nhap(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i + 1, j + 1);
                a[i][j] = scanner.nextInt();
            }
        }
    }

    static void xuat(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.println();
        }
    }

    static void max(int[][] a, int m, int n) {
        int max = a[0][0];
        int chiSoI = 0;
        int chiSoJ = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    chiSoI = i + 1;
                    chiSoJ = j + 1;
                }
            }
        }
        System.out.println("Phan tu max la: " + max);
        System.out.println("Nam tai chi so: " + "[" + chiSoI + "]" + "[" + chiSoJ + "]");
    }

    static int isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return 0;
        }
        // check so nguyen to khi n >= 2   
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    static void xuatSoNT(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isPrimeNumber(a[i][j]) == 1) {
                    System.out.printf("%d\t", a[i][j]);
                } else {
                    System.out.printf("%d\t", 0);
                }
            }
            System.out.println();
        }
    }

    static void sort_cot(int[][] a, int m, int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m - 1; i++) {
                for (int k = 1; k < m; k++) {
                    if (a[i][j] > a[k][j]) {
                        int tg = a[i][j];
                        a[i][j] = a[k][j];
                        a[k][j] = tg;
                    }
                }
            }           
        }
        xuat(a, m, n);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int m, n;
        System.out.print("So dong: ");
        m = scanner.nextInt();
        System.out.print("So cot: ");
        n = scanner.nextInt();
        int[][] arr = new int[m][n];
        nhap(arr, m, n);
        xuat(arr, m, n);
        max(arr, m, n);
        System.out.println("Cac so nguyen to cua ma tran la:");
        xuatSoNT(arr, m, n);
        System.out.println("Sap xep cac phan tu cua ma tran theo cot:");
        sort_cot(arr, m, n);
    }

}
