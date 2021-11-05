/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class sumImp extends UnicastRemoteObject implements sum {

    public sumImp() throws RemoteException {
        super();
    }

    @Override
    public int tong(int x, int y) throws RemoteException {
        return x + y;
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        try {
            LocateRegistry.createRegistry(444);
            Naming.rebind("rmi://localhost:444/ok", new sumImp());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
