/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_thi_8_hcgd;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface server extends Remote{
    public matHang hang(List<matHang> list) throws RemoteException;
    public String checkGia(matHang mHang, float gia) throws RemoteException;
}
