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

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(38);
            System.out.println("Server is running");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //nhan du lieu tu client
            int x = in.readInt();
            //xu li du lieu
            String data = "";
            if (x % 2 == 0) {
                data = "La so chan";
            } else {
                data = "La so le";
            }
            //gui tra du lieu
            out.writeUTF(data);
            out.flush();
            out.close();
            in.close();
            socket.close();
            server.close();
        } catch (Exception e) {
        }
    }
}
