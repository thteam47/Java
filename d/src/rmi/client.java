/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

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
            LocateRegistry.getRegistry("localhost", 10);
            chuoi t = (chuoi) Naming.lookup("rmi://localhost:10/abc");
            System.out.println("Nhap chuoi");
            Scanner sc = new Scanner(System.in);
            String tu = sc.nextLine();
            System.out.println("Do dai cua chuoi la: "+ t.soLuong(tu));
        } catch (Exception e) {
        }
        
    }
}
