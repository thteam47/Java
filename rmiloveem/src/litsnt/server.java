/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package litsnt;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class server extends UnicastRemoteObject implements snt {

    public server() throws RemoteException {
        super();
    }

    public int check(int x) {
        if (x < 2) {
            return 0;

        }
        for (int i = 2; i < x; i++) {
            if (x%i==0) {
                return 0;
                
            }
        }
        return 1;
    }

    @Override
    public String listsnt(int x) throws RemoteException {
        String data = "";
        for (int i = 1; i <= x; i++) {
            if (check(i) == 1) {
                data += i + " ";
            }
        }
        return data;
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(38);
            Naming.rebind("rmi://localhost:38/hi", new server());
            System.out.println("server da san sang");
        } catch (Exception e) {
        }
    }

    @Override
    public int soSNT(int x) throws RemoteException {
        int dem=0;
        for (int i = 1; i <= x; i++) {
            if (check(i) == 1) {
                dem++;
            }
        }
        return dem;
    }

}
