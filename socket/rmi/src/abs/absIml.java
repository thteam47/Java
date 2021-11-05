/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abs;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import rmi.sumImp;

/**
 *
 * @author Admin
 */
public class absIml extends UnicastRemoteObject implements abs{

    public absIml() throws RemoteException{
        super();
    }
    @Override
    public int abss(int x) throws RemoteException {
        return x*x;
    }
    public static void main(String[] args) {
        try {           
            Registry registry = LocateRegistry.createRegistry(3456);
            Naming.rebind("rmi://localhost:3456/abs", new absIml());
            System.out.println("running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
