/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class server {
    static int tinhGt(int n){
        if (n==1)
            return 1;
        return n*tinhGt(n-1);
    }
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(38);
            System.out.println("Server is running");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            
            int x = in.readInt();
            int gt=tinhGt(x);
            
            out.writeInt(gt);
            out.flush();
            
        } catch (Exception e) {
        }
    }
           
}
