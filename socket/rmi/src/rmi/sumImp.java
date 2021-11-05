/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class sumImp extends UnicastRemoteObject implements sum{

    public sumImp() throws RemoteException{
        super();
    }
    @Override
    public int tong(int n) throws RemoteException {
        return n+5;
    }
    public static void main(String[] args) {
        try {           
            Registry registry = LocateRegistry.createRegistry(1234);
            Naming.rebind("rmi://localhost:1234/sum", new sumImp());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
