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
            System.out.println("Nhap vao 1 chuoi: ");
            Scanner scanner = new Scanner(System.in);
            out.writeUTF(scanner.nextLine());
            out.flush();
            System.out.println("Do dai cua chuoi la: "+in.readInt());
        } catch (Exception e) {
        }
    }
}
