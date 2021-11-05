/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

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
            Socket socket = new Socket("localhost",38);
            
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap mot so nguyen: ");
            int x = sc.nextInt();
            
            out.writeInt(x);
            out.flush();
            
            int gt = in.readInt();
            System.out.println("Gia thua la: "+gt);
            
        } catch (Exception e) {
        }
    }
}
