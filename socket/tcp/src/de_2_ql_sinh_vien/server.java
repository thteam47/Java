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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {

    static List<sinhVien> list = (new listSV()).importList();

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(38);
            System.out.println("Server is running");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String data = "";
            int options;
            do {
                options = in.readInt();
                if (options == 1) {
                    for (sinhVien sv : list) {
                        out.writeUTF(sv.toString1());
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                } else if (options == 2) {
                    sinhVien sv = new sinhVien();
                    out.writeUTF("Nhap thong tin sinh vien can them");
                    out.flush();
                    out.writeUTF("Nhap ho va ten: ");
                    out.flush();
                    sv.setHoTen(in.readUTF());
                    out.writeUTF("Nhap ngay sinh: ");
                    out.flush();
                    sv.setNgaySinh(in.readUTF());
                    out.writeUTF("Nhap ma sinh vien: ");
                    out.flush();
                    sv.setMaSv(in.readUTF());
                    out.writeUTF("Nhap que quan: ");
                    out.flush();
                    sv.setAddress(in.readUTF());
                    list.add(sv);
                    out.writeUTF("Them sinh vien than cong");
                    out.flush();
                } else if (options == 3) {
                    out.writeUTF("Nhap ma sinh vien can tim: ");
                    out.flush();
                    data = in.readUTF();
                    for (sinhVien sv : list) {
                        if (sv.getMaSv().equalsIgnoreCase(data)) {
                            out.writeUTF(sv.toString1());
                            out.flush();
                            data = "null";
                            break;
                        }
                    }
                    if (!data.equalsIgnoreCase("null")) {
                        out.writeUTF("Khong tim thay sinh vien " + data);
                        out.flush();
                    }
                } else if (options == 4) {
                    out.writeUTF("1. Tim kiem thong tin theo nam sinh\n2. Tim kiem thong tin sinh vien theo que quan\nLua chon: ");
                    out.flush();
                    int options1 = in.readInt();
                    if (options1 == 1) {
                        out.writeUTF("Nhap nam sinh: ");
                        int nam = in.readInt();
                        for (sinhVien sv : list) {
                            String[] namSinh = sv.getNgaySinh().split("/");
                            if (nam == Integer.parseInt(namSinh[2])) {
                                out.writeUTF(sv.toString1());
                                out.flush();
                            }
                        }
                    } else if (options1 == 2) {
                        out.writeUTF("Nhap que quan: ");
                        data = in.readUTF();
                        for (sinhVien sv : list) {
                            if (sv.getAddress().equalsIgnoreCase(data)) {
                                out.writeUTF(sv.toString1());
                                out.flush();
                            }
                        }
                    }
                    out.writeUTF("null");
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
