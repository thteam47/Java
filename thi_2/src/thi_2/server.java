/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi_2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {

    static List<sinhVien> list = new ArrayList<>();

    public static void main(String[] args) {
        try {
            String data = "";
            FileReader fr = new FileReader("database1.txt");
            BufferedReader buff = new BufferedReader(fr);
            while ((data = buff.readLine()) != null) {
                String[] data1 = data.split("\\$");
                float d;
                if (data1.length==5) {
                    d = Float.parseFloat(data1[4]);
                } else {
                    d = -1;
                }
                sinhVien pt = new sinhVien(data1[0], data1[1], data1[2], data1[3], d);
                list.add(pt);
            }
            ServerSocket server = new ServerSocket(3838);
            System.out.println("Server is running");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            int options;
            do {
                options = in.readInt();
                if (options == 1) {
                    for (sinhVien sv : list) {
                        out.writeUTF(sv.toString());
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                } else if (options == 2) {
                    for (sinhVien sv : list) {
                        if (sv.diem >= 8) {
                            out.writeUTF(sv.toString());
                            out.flush();
                        }
                    }
                    out.writeUTF("null");
                    out.flush();
                } else if (options == 3) {
                    out.writeUTF("Nhap ma sinh vien: ");
                    out.flush();
                    String ma = in.readUTF();
                    int dem = 0;
                    for (sinhVien pt : list) {
                        if (pt.getMaSv().equalsIgnoreCase(ma)) {
                            out.writeUTF(pt.toString());
                            out.flush();
                            if (pt.getDiem() == -1) {

                                out.writeUTF("Nhap diem: ");
                                out.flush();
                                out.writeUTF("ok");
                                out.flush();
                                pt.setDiem(in.readFloat());
                            }

                            dem++;
                            break;
                        }
                    }
                    if (dem == 0) {
                        out.writeUTF("Khong co sinh vien nay");
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                }

            } while (options != 4);
            out.close();
            in.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
