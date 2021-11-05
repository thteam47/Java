/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

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
            int check = 0;
            Scanner sc = new Scanner(System.in);
            String data = "";
            do {
                System.out.println("1. Xem danh sach sinh vien");
                System.out.println("2. Them sinh vien");
                System.out.println("3. Xem thong tin sinh vien");
                System.out.println("4. Tim nhom sinh vien theo que quan hoac nam sinh");
                System.out.println("5. Thoat");
                System.out.print("Lua chon: ");
                check = sc.nextInt();

                if (check == 1) {
                    //gui lua chon
                    out.writeInt(check);
                    out.flush();
                    while (!(data = in.readUTF()).equalsIgnoreCase("null")) {
                        System.out.println(data);
                    }
                } else if (check == 2) {
                    out.writeInt(check);
                    out.flush();
                    System.out.println("Hay nhap thong tin sinh vien");
                    System.out.println("Nhap ma sinh vien: ");
                    sc.nextLine();
                    String maSV = sc.nextLine();
                    out.writeUTF(maSV);
                    out.flush();

                    System.out.println("Nhap ho ten: ");
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.println("Nhap ngay sinh: ");
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.println("Nhap que quan: ");
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.println(in.readUTF());
                } else if (check == 3) {
                    out.writeInt(check);
                    out.flush();
                    System.out.println("Hay nhap ma sinh vien can tim: ");
                    sc.nextLine();
                    out.writeUTF(sc.nextLine());
                    out.flush();
                    System.out.println(in.readUTF());

                }
                if (check == 4) {
                    out.writeInt(check);
                    out.flush();
                    System.out.println("1. Tim kiem theo ngay sinh");
                    System.out.println("2. Tim kiem theo que quan");
                    System.out.println("Lua chon: ");
                    int c = sc.nextInt();
                    out.writeInt(c);
                    out.flush();
                    if (c == 1) {
                        System.out.println("Nhap ngay sinh: ");
                        sc.nextLine();
                        out.writeUTF(sc.nextLine());
                        while (!(data = in.readUTF()).equalsIgnoreCase("null")) {
                            System.out.println(data);
                        }
                    }else if (c == 2) {
                        System.out.println("Nhap que quan: ");
                        sc.nextLine();
                        out.writeUTF(sc.nextLine());
                        while (!(data = in.readUTF()).equalsIgnoreCase("null")) {
                            System.out.println(data);
                        }
                    }
                }
            } while (check != 5);
        } catch (Exception e) {
        }
    }
}
