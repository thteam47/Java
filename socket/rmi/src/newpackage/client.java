/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Admin
 */
public class client {

    public static void main(String[] args) {
        try {
            LocateRegistry.getRegistry("localhost", 38);
            rmisum rmi = (rmisum) Naming.lookup("rmi://localhost:38/hi");
            System.out.println("tong cua 4 va 7 la: "+rmi.sum(4, 7));
            System.out.println("hieu cua 3 va 8 la: "+rmi.dig(3, 8));
            
        } catch (Exception e) {
        }

    }

}
