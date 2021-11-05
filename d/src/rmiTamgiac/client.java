/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiTamgiac;

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
            LocateRegistry.getRegistry("localhost", 100);
            tamGiac tg = (tamGiac) Naming.lookup("rmi://localhost:100/hi");
            System.out.println("Nhap ba canh cua tam giac: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(tg.checkTamGiac(a, b, c));
        } catch (Exception e) {
        }
    }
}
