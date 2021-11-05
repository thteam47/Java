/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class server extends UnicastRemoteObject implements chuoi{

    public server() throws RemoteException {
        super();
    }

    
    @Override
    public int soLuong(String s) throws RemoteException {
        
        return s.length();
    }
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(10);
            Naming.rebind("rmi://localhost:10/abc", new server());
            System.out.println("Serveris running");
        } catch (Exception e) {
        }
    }
}
