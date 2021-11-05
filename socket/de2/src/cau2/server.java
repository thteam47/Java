/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

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
            int check;
            //nhan lua chon
            do {
                check = in.readInt();
                if (check == 1) {
                    for (sinhVien sv : list) {
                        out.writeUTF(sv.toString());
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                } else if (check == 2) {
                    sinhVien sv = new sinhVien();
                    String maSV = in.readUTF();
                    sv.setMaSv(maSV);
                    sv.setTen(in.readUTF());
                    sv.setNgaySinh(in.readUTF());
                    sv.setQueQuan(in.readUTF());
                    list.add(sv);
                    out.writeUTF("Them thanh cong");
                } else if (check == 3) {
                    String dataS = in.readUTF();
                    int dem = 0;
                    for (sinhVien sv : list) {
                        if (sv.getMaSv().equalsIgnoreCase(dataS)) {
                            out.writeUTF(sv.toString());
                            out.flush();
                            dem++;
                            break;
                        }
                    }
                    if (dem == 0) {
                        out.writeUTF("Khong co sinh vien " + dataS);
                        out.flush();
                    }
                } else if (check == 4) {
                    int c = in.readInt();
                    if (c == 1) {
                        int dem = 0;
                        String ngaySinh = in.readUTF();
                        for (sinhVien sv : list) {
                            if (sv.getNgaySinh().equalsIgnoreCase(ngaySinh)) {
                                out.writeUTF(sv.toString());
                                out.flush();
                                dem++;
                            }
                        }
                        if (dem == 0) {
                            out.writeUTF("Khong co sinh vien co ngay sinh " + ngaySinh);
                            out.flush();
                        }
                        out.writeUTF("null");
                        out.flush();
                    }else if (c == 2) {
                        int dem = 0;
                        String queQuan = in.readUTF();
                        for (sinhVien sv : list) {
                            if (sv.getQueQuan().equalsIgnoreCase(queQuan)) {
                                out.writeUTF(sv.toString());
                                out.flush();
                                dem++;
                            }
                        }
                        if (dem == 0) {
                            out.writeUTF("Khong co sinh vien co que quan " + queQuan);
                            out.flush();
                        }
                        out.writeUTF("null");
                        out.flush();
                    }
                }
            } while (check != 5);

        } catch (Exception e) {
        }
    }
}
