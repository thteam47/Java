/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnRmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Admin
 */
public class client1 {
    public static void main(String[] args) {
        try {
            LocateRegistry.getRegistry("localhost", 38);
            sum TH = (sum) Naming.lookup("rmi://localhost:38/alo");
            System.out.println("Tong hai so 3 va 8: "+TH.tong(3, 8));
            System.out.println("Hieu hai so 4 va 7: "+TH.hieu(4, 7));
        } catch (Exception e) {
        }
    }
}
