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
public class client {
    public static void main(String[] args) {
        try {
            LocateRegistry.getRegistry("localhost",9999);
            caculator t = (caculator)Naming.lookup("rmi://localhost:9999/caculator");
            System.out.println("Tong cua 5 va 6: "+ t.sum(5, 6));
            System.out.println("Hieu cua 5 va 6: "+ t.dig(5, 6));
        } catch (Exception e) {
        }
    }
}
