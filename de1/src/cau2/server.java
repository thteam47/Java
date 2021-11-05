/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Admin
 */
public class server extends UnicastRemoteObject implements tuDien{

    List<word> list = (new listWord()).importList();
    public server() throws RemoteException{
        super();
    }
    @Override
    public String dichENtoVN(String tu) throws RemoteException {
        for (word w : list) {
            if (w.getEn().equalsIgnoreCase(tu))
                return w.getVn();
        }
        return "Khong thay tu nay";
    }

    @Override
    public String dichVNtoEN(String tu) throws RemoteException {
        for (word w : list) {
            if (w.getVn().equalsIgnoreCase(tu)){
            return w.getEn();
            }
            
        }
        return "Khong thay tu nay";
    }

    @Override
    public String dichEN(String tu) throws RemoteException {
        for (word w : list) {
            if (w.getEn().equalsIgnoreCase(tu)){
            return w.getDich();
            }         
        }
        return "Khong thay tu nay";
        
    }
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(38);
            Naming.rebind("rmi://localhost:38/tuDien", new server());
            System.out.println("Server is running");
        } catch (Exception e) {
        }
    }
}
