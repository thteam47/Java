/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_5_do_dai_chuooi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class chuoiImp extends UnicastRemoteObject implements chuoi{

    public chuoiImp() throws RemoteException{
        super();
    }
    @Override
    public int lenghtSring (String s) throws RemoteException{
        return s.length();
    }
    public static void main(String[] args) {
        try {           
            LocateRegistry.createRegistry(38);
            Naming.rebind("rmi://localhost:38/chuoi", new chuoiImp());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
