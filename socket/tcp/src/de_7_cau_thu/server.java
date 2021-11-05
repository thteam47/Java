/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_7_cau_thu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        System.out.println("Server is running");
        Socket socket = server.accept();

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        List<cauThu> list = new ArrayList<>();
        int check;
        String data;
        do {
            data = in.readUTF();
            check = Integer.parseInt(data);
            if (check == 1) {
                data = "Hay dien thong tin cau thu";
                out.writeUTF(data);
                out.flush();
                data = in.readUTF();
                String[] data1 = data.split("\\$");
                list.add(new cauThu(data1[0], data1[1], Integer.parseInt(data1[2]), data1[3], Float.parseFloat(data1[4])));               
                data = "Them thanh cong";                
                out.writeUTF(data);
                out.flush();

            } else if (check == 2) {
                if (list.size() == 0) {
                    data = 0 + "$";
                    out.writeUTF(data);
                    out.flush();
                } else {
                    data = 1+"";
                    for (cauThu ct : list) {
                        data += ("$" + ct.getTen());
                    }
                    out.writeUTF(data);
                    out.flush();
                    data = in.readUTF();
                    out.writeUTF("Nhap so tran trong thang: ");
                    out.flush();
                    int soTran = Integer.parseInt(in.readUTF());
                    float tien;
                    float th;
                    for (cauThu ct : list) {
                        if (data.equalsIgnoreCase(ct.getTen())) {
                            if (ct.getViTri().equalsIgnoreCase("tien dao")) {
                                th = 0.025f * ct.getLuongMD();
                            } else if (ct.getViTri().equalsIgnoreCase("tien ve") || ct.getViTri().equalsIgnoreCase("hau ve")) {
                                th = 0.02f * ct.getLuongMD();
                            } else {
                                th = 0.015f * ct.getLuongMD();
                            }
                            tien = ct.luongMD + soTran * th;
                            out.writeUTF("Luong la: " + tien);
                            out.flush();
                            break;
                        }
                    }
                }
            }
            if (check == 3) {
                in.close();
                out.close();
                socket.close();
            }
        } while (check != 3);
    }
}
