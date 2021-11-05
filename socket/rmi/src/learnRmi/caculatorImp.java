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
public class caculatorImp extends UnicastRemoteObject implements caculator{
    public caculatorImp() throws RemoteException{
        super();
    }
    @Override
    public int sum(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int dig(int a, int b) throws RemoteException {
        return a-b;
    }
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(9999);
            Naming.rebind("rmi://localhost:9999/caculator", new caculatorImp());
            System.out.println("Server is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
