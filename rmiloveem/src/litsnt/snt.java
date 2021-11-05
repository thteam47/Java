/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package litsnt;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Admin
 */
public interface snt extends Remote{
    public String listsnt ( int x)throws RemoteException;
    public int soSNT(int x)throws  RemoteException;
        
    
    
}
