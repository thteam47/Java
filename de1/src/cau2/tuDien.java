/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Admin
 */
public interface tuDien extends Remote{
    public String dichENtoVN(String tu) throws RemoteException;
    public String dichVNtoEN(String tu) throws RemoteException;
    public String dichEN(String tu) throws RemoteException;
    
}
