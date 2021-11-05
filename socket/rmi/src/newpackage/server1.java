/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import de_thi_8_hcgd.server;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class server1 extends UnicastRemoteObject implements rmisum{

    public server1() throws RemoteException{
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
                    LocateRegistry.createRegistry(38);
                    Naming.rebind("rmi://localhost:38/hi",new server1());
                    System.out.println("server da san sang");
        } catch (Exception e) {
        }
    }
}
