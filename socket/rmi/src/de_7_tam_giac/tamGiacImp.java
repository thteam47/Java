/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_7_tam_giac;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class tamGiacImp extends UnicastRemoteObject implements tamGiac{

    public tamGiacImp() throws RemoteException{
        super();
    }
    
    public static void main(String[] args) {
        try {           
            LocateRegistry.createRegistry(38);
            Naming.rebind("rmi://localhost:38/tamGiac", new tamGiacImp());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String check(int a, int b, int c) throws RemoteException {
        if (a+b>c&&b+c>a&&a+c>b)
            return "Tao thanh tam giac";
        return "Khong tao thanh tam giac";
    }
    
}
