/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dang Thi Thu H
 */
public interface uoc extends Remote{
    public String listUoc (int n) throws RemoteException;
}
