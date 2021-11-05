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
            Socket socket = new Socket("localhost",38);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            int check =1;
            Scanner scanner = new Scanner(System.in);
            do {                
                System.out.println("1. Them cau thu moi");
                System.out.println("2. Tinh luong cau thu");
                System.out.println("3. Thoat");
                System.out.println("Lua chon: ");
                check = scanner.nextInt();
                switch (check){
                    case 1:
                        out.writeInt(check);
                        out.flush();
                        System.out.println("Hay them cau thu moi");
                        System.out.println("Nhap ma cau thu");
                        scanner.nextLine();
                        out.writeUTF(scanner.nextLine());
                        out.flush();
                        System.out.println("Nhap ten cau thu");
                        out.writeUTF(scanner.nextLine());
                        out.flush();
                        System.out.println("Nhap nam sinh");
                        out.writeInt(scanner.nextInt());
                        out.flush();
                        System.out.println("Nhap vi tri cau thu");
                        System.out.println("1. Tien dao");
                        System.out.println("2. Tien ve");
                        System.out.println("3. Hau ve");
                        System.out.println("4. Thu mon");
                        out.writeInt(scanner.nextInt());
                        out.flush();
                        System.out.println("Luong mac dinh");
                        out.writeFloat(scanner.nextFloat());
                        out.flush();
                        System.out.println("Them thanh cong");
                        break;
                    case 2:
                        out.writeInt(check);
                        out.flush();
                        System.out.println("Nhap ten cau thu");
                        scanner.nextLine();
                        out.writeUTF(scanner.nextLine());
                        out.flush();
                        if (in.readInt()==1){
                            System.out.println("Nhap so tran");
                            out.writeInt(scanner.nextInt());
                            System.out.println("Luong: "+ in.readFloat());
                        }else {
                            System.out.println("Khong co cau thu nay");
                        }
                        break;
                    case 3:
                        out.writeInt(check);
                        out.flush();
                        break;
                    default:
                        System.out.println("Xin nhap lai");
                        break;
                }
            } while (check !=3);
        } catch (Exception e) {
        }
    }
}
