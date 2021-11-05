/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_7_tam_giac;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {
    public static void main(String[] args) {
        try {
            LocateRegistry.getRegistry("localhost",38);
            tamGiac t = (tamGiac) Naming.lookup("rmi://localhost:38/tamGiac");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ba canh: ");
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println(t.check(a,b,c));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
