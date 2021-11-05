/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chan_le;

import abs.absIml;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class chan_leImp extends UnicastRemoteObject implements chan_le{

    public chan_leImp() throws RemoteException{
        super();
    }
    
    @Override
    public String check(int x) throws RemoteException {
        if (x%2==0)
            return "so chan";
        return "so le";
    }
    public static void main(String[] args) {
        try {           
            Registry registry = LocateRegistry.createRegistry(3839);
            Naming.rebind("rmi://localhost:3838/chan", new chan_leImp());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
