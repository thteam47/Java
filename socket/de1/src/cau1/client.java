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
            Socket socket = new Socket("localhost", 38);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //lay du lieu tu user
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so nguyen duong: ");
            int x = sc.nextInt();
            //gui du lieu sang server
            out.writeInt(x);
            out.flush();
            //nhan du lieu
            System.out.println(in.readUTF());
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
        }
    }
}
