/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class server {

    static int checksnt(int x) {
        if (x < 2) {
            return 0;

        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(15);
            System.out.println("server da san sang");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream ou = new DataOutputStream(socket.getOutputStream());
            int x = in.readInt();
            String data = "";
             for(int i=1;i<=x;i++){
                 if (checksnt(i)==1) {
                     data+= i+" ";
                 }
             }
                
            ou.writeUTF(data);
            ou.flush();

        } catch (Exception e) {
        }
    }

}
