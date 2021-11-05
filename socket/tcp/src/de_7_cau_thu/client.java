/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_7_cau_thu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        int check;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhap cau thu moi");
            System.out.println("2. Tinh luong cau thu");
            System.out.println("3. Thoat");
            System.out.print("Lua chon: ");
            check = sc.nextInt();
            String data;
            if (check == 1) {
                data = 1 + "";
                out.writeUTF(data);
                out.flush();
                System.out.println(in.readUTF());
                cauThu ct = new cauThu();
                sc.nextLine();
                System.out.print("Nhap ma cau thu: ");
                ct.setMaCauThu(sc.nextLine());
                System.out.print("Nhap ten cau thu: ");
                ct.setTen(sc.nextLine());
                System.out.print("Nhap nam sinh cau thu: ");
                ct.setNamSinh(sc.nextInt());
                System.out.println("Nhap vi tri cau thu: ");
                System.out.println("1. Tien dao");
                System.out.println("2. Tien ve");
                System.out.println("3. Hau ve");
                System.out.println("4. Thu mon");
                System.out.print("Lua chon: ");
                int c = sc.nextInt();
                if (c==1) ct.setViTri("tien dao");
                else if (c==2) ct.setViTri("tien ve");
                else if (c==3) ct.setViTri("hau ve");
                else ct.setViTri("thu mon");
                System.out.print("Nhap luong mac dinh : ");
                ct.setLuongMD(sc.nextFloat());
                sc.nextLine();
                data = ct.toString();
                out.writeUTF(data);
                out.flush();
                System.out.println(in.readUTF());

            } else if (check == 2) {
                data = 2 + "";
                out.writeUTF(data);
                out.flush();
                String[] data1 = in.readUTF().split("\\$");
                data = "";
                for (int i = 1; i < data1.length; i++) {
                    if (i != (data1.length - 1)) {
                        data += (data1[i] + ",");
                    } else {
                        data += data1[i];
                    }
                }
                if (data1[0].equalsIgnoreCase("0")) {
                    System.out.println("Chua co cau thu nao. Hay them moi");
                } else {
                    System.out.print("Ban muon tinh luong cua cau thu nao: ");
                    System.out.println(data);
                    System.out.print("Ten cau thu: ");
                    sc.nextLine();
                    data = sc.nextLine();
                    out.writeUTF(data);
                    out.flush();
                    System.out.println(in.readUTF());
                    data = sc.nextInt() + "";
                    out.writeUTF(data);
                    out.flush();
                    System.out.println(in.readUTF());

                }
            } else if (check == 3) {
                data = 3 + "";
                out.writeUTF(data);
                out.flush();
                in.close();
                out.close();
                socket.close();
            }
        } while (check != 3);
    }
}
