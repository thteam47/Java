/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Admin
 */
public class clinet {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1234);
            sum t = (sum) Naming.lookup("rmi://localhost:1234/sum");
            System.out.println("Tong: "+ t.tong(7));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
