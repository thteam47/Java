/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_5_do_dai_chuooi;

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
            chuoi t = (chuoi) Naming.lookup("rmi://localhost:38/chuoi");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap chuoi: ");
            String x = sc.nextLine();
            System.out.println("Do dai chuoi: "+ t.lenghtSring(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
