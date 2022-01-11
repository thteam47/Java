/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hai_so;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class calculateImp extends UnicastRemoteObject implements calculate {

    public calculateImp() throws RemoteException {
        super();
    }

    @Override
    public int sum(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int dig(int a, int b) throws RemoteException {
        return a - b;
    }

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(3820);
            Naming.rebind("rmi://localhost:3820/aa", new calculateImp());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
