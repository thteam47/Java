/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author Dang Thi Thu H
 */
public class client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong: ");
        int x = sc.nextInt();
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",38);
            uoc t = (uoc) Naming.lookup("rmi://localhost:38/uoc");
            System.out.println(t.listUoc(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
