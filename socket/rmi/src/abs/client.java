/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abs;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import rmi.sum;

/**
 *
 * @author Admin
 */
public class client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong: ");
        int x = sc.nextInt();
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",3456);
            abs t = (abs) Naming.lookup("rmi://localhost:3456/abs");
            System.out.println("Binh phuong la: "+ t.abss(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
