/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_thi_8_hcgd;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class serverImp extends UnicastRemoteObject implements server{
    
    
    public serverImp() throws RemoteException{
        super();
        
              
    }
    
    @Override
    public matHang hang(List<matHang> list) throws RemoteException {
        Random rd = new Random();
        int x = rd.nextInt(list.size());
        return list.get(x);
    }

    @Override
    public String checkGia(matHang mHang, float gia) throws RemoteException {
        if (gia > mHang.getGiaHang())
            return "cao hon";
        else if (gia < mHang.getGiaHang())
            return "thap hon";
        return "chinh xac";
    }
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(7777);
        Naming.rebind("rmi://localhost:7777/ok", new serverImp());
        System.out.println("running");
    }
}
