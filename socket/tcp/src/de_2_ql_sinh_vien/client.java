/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_2_ql_sinh_vien;

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
                System.out.println("1. Xem danh sach sinh vien");
                System.out.println("2. Them sinh vien moi");
                System.out.println("3. Xem thong tin sinh vien");
                System.out.println("4. Tim kiem thong tin theo nhom que quan hoac nam sinh");
                System.out.println("5. Thoat");
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
                    System.out.print(in.readUTF());
                    sc.nextLine();
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.print(in.readUTF());
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.print(in.readUTF());
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.print(in.readUTF());
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.println(in.readUTF());
                } else if (check == 3) {
                    out.writeInt(check);
                    out.flush();
                    System.out.print(in.readUTF());
                    sc.nextLine();
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.println(in.readUTF());
                } else if (check == 4) {
                    out.writeInt(check);
                    out.flush();
                    System.out.print(in.readUTF());
                    out.writeInt(check = sc.nextInt());
                    if (check == 1) {
                        System.out.print(in.readUTF());
                        out.writeInt(sc.nextInt());
                        while (!(data = in.readUTF()).equalsIgnoreCase("null")) {
                            System.out.println(data);
                        }
                    }
                    else if (check==2) {
                        System.out.print(in.readUTF());
                        sc.nextLine();
                        out.writeUTF(sc.nextLine());
                        out.flush();
                        while (!(data = in.readUTF()).equalsIgnoreCase("null")) {
                            System.out.println(data);
                        }
                    }
                }
            } while (check != 5);
            out.close();
            in.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
