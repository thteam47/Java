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
public class server extends UnicastRemoteObject implements tinhTong{

    public server() throws RemoteException{
        super();
    }
    

    
    @Override
    public float tong(int n) throws RemoteException {
        float t =0;
        for (int i=1;i<=n;i++){
            t += (float)1/(i*i);
        }
        return t;
    }
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(38);
            Naming.bind("rmi://localhost:38/tinhtong", new server());
            System.out.println("server is running");
        } catch (Exception e) {
        }
    }
}
