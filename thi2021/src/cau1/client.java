/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {
    public static void main(String[] args) {
        try {
            LocateRegistry.getRegistry("localhost", 38);
            tinhTong t = (tinhTong) Naming.lookup("rmi://localhost:38/tinhtong");
            Scanner scanner = new Scanner(System.in);
            int n=0;
            do {                
                System.out.println("Nhap so duong");
            
                n = scanner.nextInt();
                if (n<=0) {
                    System.out.println("Nhap lai so duong n");
                }
            } while (n<=0);
            System.out.println("Tong la: "+t.tong(n));
        } catch (Exception e) {
        }
    }
}
