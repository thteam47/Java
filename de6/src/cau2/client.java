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
            int check = 1;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("1. Tim kiem mat hang theo ma hang");
                System.out.println("2. Lap don thanh toan");
                System.out.println("3. Thoat");
                check = scanner.nextInt();
                switch (check) {
                    case 1:
                        //gui lua chon
                        out.writeInt(check);
                        out.flush();
                        // gui thong tin
                        scanner.nextLine();
                        System.out.println("Nhap ma hang: ");
                        String maHang = scanner.nextLine();
                        out.writeUTF(maHang);
                        out.flush();

                        //nhan ket qua
                        System.out.println(in.readUTF());

                        break;
                    case 2:
                        out.writeInt(check);
                        out.flush();
                        int checkNhap = 1;
                        do {
                            out.writeInt(checkNhap);
                            out.flush();
                            scanner.nextLine();
                            System.out.println("Nhap mat hang can mua");
                            String matHang = scanner.nextLine();
                            out.writeUTF(matHang);
                            out.flush();
                            if (in.readInt() == 1) {
                                int checkSL = 1;
                                do {
                                    System.out.println("Nhap so luong");
                                    out.writeInt(scanner.nextInt());
                                    out.flush();
                                    checkSL = in.readInt();
                                    if (checkSL == 0) {
                                        System.out.println("Khong du so luong. Nhap lai");
                                    } else {
                                        System.out.println("Mua thanh cong");
                                    }
                                } while (checkSL == 0);
                            } else {
                                System.out.println("Khong co mat hang nay");
                            }
                            System.out.println("Co muon mua nua khong: ");
                            checkNhap = scanner.nextInt();

                            if (checkNhap == 0) {
                                out.writeInt(checkNhap);
                                out.flush();
                            }

                        } while (checkNhap != 0);
                        String data = "";
                        while ((data = in.readUTF()).equalsIgnoreCase("null") == false) {
                            System.out.println(data);
                        }

                }
            } while (check != 3);
        } catch (Exception e) {
        }
    }
}
