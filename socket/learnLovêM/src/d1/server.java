/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1;

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
            ServerSocket server = new ServerSocket(13);
            System.out.println("server da san sang");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream ou = new DataOutputStream(socket.getOutputStream());
           int x = in.readInt();
           String data;
            int gt=1;
            for (int i=1;i<=x;i++){
                gt*=i;
            }
            ou.writeInt(gt);
        } catch (Exception e) {
        }
    }
        
    
    
}
