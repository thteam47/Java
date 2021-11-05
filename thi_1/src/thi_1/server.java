/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi_1;

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

    static List<phongTro> list = new ArrayList<>();

    public static void main(String[] args) {
        try {
            String data = "";
            FileReader fr = new FileReader("database.txt");
            BufferedReader buff = new BufferedReader(fr);
            while ((data = buff.readLine()) != null) {
                String[] data1 = data.split("\\$");
                phongTro pt = new phongTro();
                pt.setMaPhong(Integer.parseInt(data1[0]));
                pt.setLoai(data1[1]);
                pt.setDiaChi(data1[2]);
                pt.setTinhTrang(data1[3]);
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
                if (options == 2) {
                    for (phongTro pt : list) {
                        out.writeUTF(pt.toString());
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                } else if (options == 1) {
                    out.writeUTF("Nhap ma phong: ");
                    out.flush();
                    int ma = in.readInt();
                    int dem = 0;
                    for (phongTro pt : list) {
                        if (pt.getMaPhong() == ma) {
                            out.writeUTF(pt.toString());
                            out.flush();
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        out.writeUTF("Khong co phong nay");
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                } else if (options == 3) {
                    out.writeUTF("Cac phong con trong: ");
                    out.flush();
                    int dem = 0;
                    for (phongTro pt : list) {
                        if (pt.getTinhTrang().equalsIgnoreCase("Trong")) {
                            out.writeUTF(pt.toString());
                            out.flush();
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        out.writeUTF("Khong con phong trong");
                        out.flush();
                    } else {
                        out.writeUTF("Chon ma phong can thue:");
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                    int maP = in.readInt();
                    for (phongTro pt : list) {
                        if (pt.getMaPhong() == maP) {
                            pt.setTinhTrang("Khong");
                            out.writeUTF("Thue thanh cong");
                            out.flush();
                            break;
                        }
                    }
                } else if (options==4) {
                    phongTro pt = new phongTro();
                    out.writeUTF("Nhap thong tin phong can them: ");
                    out.flush();
                    out.writeUTF("Nhap ma phong: ");
                    out.flush();
                    pt.setMaPhong(in.readInt());
                    out.writeUTF("Nhap loai phong: ");
                    out.flush();
                    pt.setLoai(in.readUTF());
                    out.writeUTF("Nhap dia chi: ");
                    out.flush();
                    pt.setDiaChi(in.readUTF());
                    out.writeUTF("Nhap tinh trang:\n1. Trong \n2.Khong");
                    out.flush();
                    if (in.readInt()==1) pt.setTinhTrang("Trong");
                    else pt.setTinhTrang("Khong");
                    list.add(pt);
                    out.writeUTF("Them thanh cong");
                    out.flush();
                }

            } while (options != 5);
            out.close();
            in.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
