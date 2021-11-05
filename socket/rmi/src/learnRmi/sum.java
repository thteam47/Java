/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnRmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Admin
 */
public interface sum extends Remote{
    public int tong(int a, int b) throws RemoteException;
    public int hieu(int a, int b) throws RemoteException;
}
