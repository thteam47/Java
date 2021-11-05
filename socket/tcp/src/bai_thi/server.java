/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_thi;

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

    static List<phongTro> list = (new listPhong()).importList();

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
