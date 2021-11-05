/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp_snt;

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
            Socket socket = new Socket("localhost", 12);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream ou = new DataOutputStream(socket.getOutputStream());
            System.out.println("nhap mot so nguyen duong");
            Scanner sc = new Scanner(System.in);
            int a = 
            
        } catch (Exception e) {
        }
    }
    
}
