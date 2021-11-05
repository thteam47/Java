/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiTamgiac;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class server extends UnicastRemoteObject implements tamGiac {

    public server() throws RemoteException {
        super();
    }

    @Override
    public String checkTamGiac(int a, int b, int c) throws RemoteException {
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            return "La tam giac";
        }
        return "Khong la tam giac";
    }
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(100);
            Naming.rebind("rmi://localhost:100/hi", new server());
            System.out.println("Server is running");
        } catch (Exception e) {
        }
    }
}
