/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hai so: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        LocateRegistry.getRegistry(444);
        sum t = (sum) Naming.lookup("rmi://localhost:444/ok");
        System.out.println("Tong: "+t.tong(x, y));
    }
}
