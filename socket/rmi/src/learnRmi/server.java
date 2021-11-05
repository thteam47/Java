/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnRmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class server extends UnicastRemoteObject implements sum {

    public server() throws RemoteException {
        super();
    }

    @Override
    public int tong(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int hieu(int a, int b) throws RemoteException {
        return a - b;
    }

    public static void main(String[] args) throws RemoteException {
        try {
            LocateRegistry.createRegistry(38);
            Naming.rebind("rmi://localhost:38/alo", new server());
            System.out.println("Server is running");
        } catch (Exception e) {
        }

    }
}
