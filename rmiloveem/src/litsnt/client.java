/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package litsnt;

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
         snt t= (snt) Naming.lookup("rmi://localhost:38/hi");
            System.out.println("nhap mot so nguyen");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            String data;
            data = t.listsnt(x);
            System.out.println(data);
            System.out.println(t.soSNT(x));
            
        } catch (Exception e) {
        }
    }
    
}
