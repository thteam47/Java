/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(17);
            System.out.println("server da san sang");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream ou = new DataOutputStream(socket.getOutputStream());
            int a = in.readInt();
            int b = in.readInt();
            int tong = a+b;
            ou.writeInt(tong);
            ou.flush();
            
        } catch (Exception e) {
        }
    }
    
}
