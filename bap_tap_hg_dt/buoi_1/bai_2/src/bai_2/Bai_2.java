/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_2 {

    Scanner scanner = new Scanner(System.in);
    void check_snt() {
        int n;
        do {
            System.out.printf("nhap n = ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.printf("\nn duong, nhap lai\n");
            }
        } while (n < 1);
        int dem = 0;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.printf("\n%d khong phai la so nguyen to", n);
                dem++;
                break;
            }
        }
        if (dem == 0 || n == 2 || n == 3) {
            System.out.printf("\n%d la so nguyen to", n);
        }
    }

    void sohhn() {
        int n, tong = 0;
        do {
            System.out.printf("nhap n = ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.printf("\nn duong, nhap lai\n");
            }
        } while (n < 1);
        System.out.printf("\nso hoan hao la: ");
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.printf("1");
                continue;
            }
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    tong += j;
                }
            }
            if (i == tong) {
                System.out.printf("\t%d", i);
            }
            tong = 0;
        }

    }

    void check_sohhn() {
        int n, tong = 0;
        do {
            System.out.printf("nhap n = ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.printf("\nn duong, nhap lai\n");
            }
        } while (n < 1);
        for (int j = 1; j < n; j++) {
            if (n % j == 0) {
                tong += j;
            }
        }
        if (n != tong || n == 1) {
            System.out.printf("\n%d khong la so hoan hao", n);
        } else {
            System.out.printf("\n%d la so hoan hao", n);
        }

    }

    int kiemtra(int n) {
        int dem = 0;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {                
                dem++;                               
                return 0;
            }
        }
        if (dem == 0 || n == 2 || n == 3) {
            return 1;
        }
        return 1;
    }

    void snt_n() {
        int n;
        System.out.printf("\nNhap N: ");
        n = scanner.nextInt();
        System.out.printf("\ncac so nguyen to tu 1 den %d la:\n", n);
        for (int i = 2; i <= n; i++) {
            if (kiemtra(i)==1) {
                System.out.printf("%d\t", i);
            }
        }

    }

    int ucln(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    int ucln1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    void tim_ucln() {
        int a, b;
        System.out.printf("Nhap a = ");
        a = scanner.nextInt();
        System.out.printf("\nNhap b = ");
        b = scanner.nextInt();
        System.out.printf("\nUCLN cua %d va %d la: %d", a, b, ucln1(a, b));
    }

    void u_cln() {
        int a, b;
        do {
            System.out.printf("Nhap tu so = ");
            a = scanner.nextInt();
            System.out.printf("\nNhap mau so = ");
            b = scanner.nextInt();
            if ( b == 0) {
                System.out.printf("\nnhap so khac 0, nhap lai: \n");
            }
        } while ( b == 0);
        if (b == 1) {
            System.out.printf("\nPhan so rut gon %d/%d = %d", a, b, a);
        } else if (b == -1) {
            System.out.printf("\nPhan so rut gon %d/%d = %d", a, b, -a);
        } else {
            if (b > 0) {
                System.out.printf("\nPhan so rut gon %d/%d = %d/%d", a, b, a / ucln(a, b), b / ucln(a, b));
            } else {
                System.out.printf("\nPhan so rut gon %d/%d = %d/%d", a, b, -a / ucln(a, b), -b / ucln(a, b));
            }
        }

    }

    void menu() {
        System.out.printf("\n1. Kiem tra so nguyen to");
        System.out.printf("\n2. In so nguyen to nho hon n");
        System.out.printf("\n3. Kiem tra so hoan hao");
        System.out.printf("\n4. In so hoan hao nho hon n");
        System.out.printf("\n5. Tim USCLN cua 2 so");
        System.out.printf("\n6. In phan so toi gian");
        System.out.printf("\n7. Thoat");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lc;
        Bai_2 bai2 = new Bai_2();
        Scanner scanner = new Scanner(System.in);
    do {
        bai2.menu();
        System.out.printf("\nLua chon: ");
        lc = scanner.nextInt();
        switch (lc) {
        case 1:
            bai2.check_snt();
            break;
        case 2:
            bai2.snt_n();
            break;
        case 3:
            bai2.check_sohhn();
            break;
        case 4:
            bai2.sohhn();
            break;
        case 5:
            bai2.tim_ucln();
            break;
        case 6:
            bai2.u_cln();
            break;
        case 7:
            break;
            
        default: {
            System.out.printf("\nLua chon khong hop le");
            break;
        }
        }
    } while (lc!=7);
        
        
        
    }
            
}
