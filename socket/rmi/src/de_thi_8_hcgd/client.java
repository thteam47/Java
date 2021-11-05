/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_thi_8_hcgd;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Scanner sc = new Scanner(System.in);
        int check;
        List<matHang> list = new ArrayList<>();
        list.add(new matHang("ha", "dau an", 80000));
        list.add(new matHang("ha1", "dau an 1", 60000));
        list.add(new matHang("ha2", "dau an 2", 6888));
        list.add(new matHang("ha3", "dau an 3", 88888));
        list.add(new matHang("ha4", "dau an 4", 4400));
        list.add(new matHang("ha5", "dau an 5", 4444));
        list.add(new matHang("ha6", "dau an 6", 44444));
        try {
            LocateRegistry.getRegistry(7777);
            server test = (server) Naming.lookup("rmi://localhost:7777/ok");

            do {
                System.out.println("Chao mung den den voi ai la trieu phu");
                System.out.println("Ban da san sang chua");
                System.out.println("1. Ok");
                System.out.println("2. Thoat");
                check = sc.nextInt();
                float gia;
                if (check == 1) {
                    matHang h = test.hang(list);
                    int soLan = 1;
                    do {
                        
                        System.out.println("San pham cua ban la");
                        System.out.println(h.getTenHang());
                        System.out.println("Doan gia: ");
                        gia = sc.nextFloat();
                        String checkString = test.checkGia(h, gia);
                        if (checkString.equalsIgnoreCase("chinh xac") == false) {
                            System.out.println(checkString);
                            soLan++;
                        } else {
                            System.out.println(checkString);
                            break;
                        }
                    } while (soLan < 8);

                } else {
                    break;
                }
            } while (check != 2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
