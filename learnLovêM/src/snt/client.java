/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 15);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream ou = new DataOutputStream(socket.getOutputStream());
            System.out.println("nhap so guyen to");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            ou.writeInt(x);
            ou.flush();
            String data = in.readUTF();
            System.out.println(data);
        } catch (Exception e) {
        }
    }
    
}
