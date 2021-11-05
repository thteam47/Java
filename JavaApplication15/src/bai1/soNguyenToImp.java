/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class soNguyenToImp extends UnicastRemoteObject implements soNguyenTo{

    public soNguyenToImp() throws RemoteException{
        super();
    }
    
    public static void main(String[] args) {
        try {           
            Registry registry = LocateRegistry.createRegistry(3456);
            Naming.rebind("rmi://localhost:3456/abs", new soNguyenToImp());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkSnt(int n) {
        if (n<2) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }
    

    @Override
    public int sumSnt(int n) throws RemoteException {
        int dem=0;
        for (int  i=2;i<=n;i++){
            if (checkSnt(i))
                dem++;
        }
        return dem;
    }
}
