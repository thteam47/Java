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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {

    static List<Nha> list = (new listNha()).importList();

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
                    for (Nha pt : list) {
                        out.writeUTF(pt.toString());
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                } else if (options == 2) {
                    Nha nha = new Nha();
                    out.writeUTF("Nhap thong tin nha");
                    out.flush();
                    out.writeUTF("Nhap so nha: ");
                    out.flush();
                    nha.setSoNha(in.readInt());
                    out.writeUTF("Nhap gia: ");
                    out.flush();
                    nha.setGiaBan(in.readFloat());
                    out.writeUTF("Tinh trang: \n1. Ban\n2.Chua ban");
                    out.flush();
                    int ban = in.readInt();
                    if (ban == 1) {
                        nha.setTinhTrang(true);
                    } else {
                        nha.setTinhTrang(false);
                    }
                    list.add(nha);
                    out.writeUTF("Them nha thanh cong");
                    out.flush();
                } else if (options == 3) {
                    out.writeUTF("Cac nha chua ban: ");
                    out.flush();
                    int dem = 0;
                    for (Nha nha : list) {
                        if (!nha.isTinhTrang()) {
                            out.writeUTF(nha.toString());
                            out.flush();
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        out.writeUTF("Khong con nha de mua");
                        out.flush();
                    } else {
                        out.writeUTF("Chon so nha can mua:");
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                    int soNha = in.readInt();
                    for (Nha pt : list) {
                        if (pt.getSoNha() == soNha) {
                            pt.setTinhTrang(true);
                            out.writeUTF("Mua thanh cong");
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
