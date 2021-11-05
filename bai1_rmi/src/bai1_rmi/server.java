/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dang Thi Thu H
 */
public class server extends UnicastRemoteObject implements uoc{

    public server() throws RemoteException{
        super();
    }
    @Override
    public String listUoc(int n) throws RemoteException {
        String data ="";
        for (int i=1; i<=n;i++){
            if (n%i==0)
                data += i+" ";
        }
        return "Cac uoc la: "+data;
    }

    
    public static void main(String[] args) {
        try {           
            Registry registry = LocateRegistry.createRegistry(38);
            Naming.rebind("rmi://localhost:38/uoc", new server());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
