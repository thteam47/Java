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
            tamgiac t = (tamgiac) Naming.lookup("rmi://localhost:38/tamgiac");
            System.out.println("Nhap ba canh cua tam giac");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (t.checkTamGiac(a, b, c)) {
                System.out.println("La tam giac");
            }else{
                System.out.println("Khong la tam giac");
            }
        } catch (Exception e) {
        }
    }
}
