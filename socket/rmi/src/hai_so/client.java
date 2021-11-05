/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hai_so;

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
        System.out.println("Nhap hai nguyen duong: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",3820);
            calculate t = (calculate) Naming.lookup("rmi://localhost:3820/aa");
            int check;
            do {                
                System.out.println("1. Tinh tong");
                System.out.println("2. Tinh hieu");
                System.out.println("3. Thoat");
                System.out.print("Lua chon: ");
                check = sc.nextInt();
                if (check==1) System.out.println("Tong la: "+ t.sum(x,y));
                else if (check==2) System.out.println("Hieu la: "+ t.dig(x,y));               
            } while (check !=3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
