/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong;

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
            tinh t=(tinh) Naming.lookup("rmi://localhost:38/hi");
            System.out.println("Nhap vao hai so");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tong = t.tong(a, b);
            int hieu = t.hieu(a, b);
            System.out.println("tong la:"+tong);
            System.out.println("hieu la:"+hieu);
            
            
        } catch (Exception e) {
        }
    }
    
}
