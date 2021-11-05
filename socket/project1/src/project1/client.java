/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
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
            int check = 1;
            Scanner sc = new Scanner(System.in);
            String data;
            do {
                System.out.println("1. Xem danh sach nha");
                System.out.println("2. Them nha vao chung cu");
                System.out.println("3. Mua nha");
                System.out.println("4. Thoat");
                System.out.print("Lua chon: ");
                check = sc.nextInt();
                if (check == 1) {
                    out.writeInt(check);
                    out.flush();
                    while (!(data = in.readUTF()).equalsIgnoreCase("null")) {
                        System.out.println(data);
                    }

                } else if (check == 2) {
                    out.writeInt(check);
                    out.flush();
                    System.out.println(in.readUTF());
                    System.out.println(in.readUTF());
                    out.writeInt(sc.nextInt());
                    out.flush();
                    System.out.println(in.readUTF());
                    out.writeFloat(sc.nextFloat());
                    out.flush();
                    System.out.println(in.readUTF());
                    out.writeInt(sc.nextInt());
                    out.flush();
                    System.out.println(in.readUTF());
                } else if (check == 3) {
                    out.writeInt(check);
                    out.flush();
                    System.out.println(in.readUTF());
                    while (!(data = in.readUTF()).equalsIgnoreCase("null")) {
                        System.out.println(data);
                    }
                    int soNha = sc.nextInt();
                    out.writeInt(soNha);
                    out.flush();
                    System.out.println(in.readUTF());
                }
            } while (check != 4);
            out.close();
            in.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
