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
            chuoi t = (chuoi) Naming.lookup("rmi://localhost:38/hihi");
            System.out.println("Nhap mot chuoi: ");
            Scanner sc = new Scanner(System.in);
            String tu = sc.nextLine();
            System.out.println("Do dai cua tu la: "+t.lenChuoi(tu));
        } catch (Exception e) {
        }
    }
}
