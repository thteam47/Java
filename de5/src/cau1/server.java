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
public class server extends UnicastRemoteObject implements chuoi{

    public server() throws RemoteException {
        super();
    }

    @Override
    public int lenChuoi(String tu) throws RemoteException {
        return tu.length();
    }
    
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(38);
            Naming.rebind("rmi://localhost:38/hihi", new server());
            System.out.println("Server is running");
        } catch (Exception e) {
        }
    }
}
