/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

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
            tuDien td = (tuDien) Naming.lookup("rmi://localhost:38/tuDien");
            int check=0;
            Scanner sc = new Scanner(System.in);
            do {                
                System.out.println("1. Dich tieng anh sang tieng viet");
                System.out.println("2. Dich tieng viet sang tieng anh");
                System.out.println("3. Dich nghia tieng anh");
                System.out.println("4. Thoat");
                System.out.print("Lua chon: ");
                check = sc.nextInt();
                if (check==1) {
                    System.out.println("Nhap tu tieng anh: ");
                    sc.nextLine();
                    String tu = sc.nextLine();
                    System.out.println("Tu tieng viet la: "+td.dichENtoVN(tu));                   
                }else if (check==2) {
                    System.out.println("Nhap tu tieng viet: ");
                    sc.nextLine();
                    String tu = sc.nextLine();
                    System.out.println("Tu tieng anh la: "+td.dichVNtoEN(tu));                   
                }else if (check==3) {
                    System.out.println("Nhap tu tieng anh: ");
                    sc.nextLine();
                    String tu = sc.nextLine();
                    System.out.println("Nghia tieng viet la: "+td.dichEN(tu));                   
                }
            } while (check!=4);
        } catch (Exception e) {
        }
    }
}
