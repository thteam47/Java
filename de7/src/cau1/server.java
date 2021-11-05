/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class server extends UnicastRemoteObject implements tamgiac{

    public server() throws RemoteException {
        super();
    }
    

    @Override
    public boolean checkTamGiac(int a, int b, int c) throws RemoteException {
        if ((a+b)>c&&(b+c)>a&&(a+c)>b)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(38);
            Naming.bind("rmi://localhost:38/tamgiac", new server());
            System.out.println("server is running");
        } catch (Exception e) {
        }
    }
}
