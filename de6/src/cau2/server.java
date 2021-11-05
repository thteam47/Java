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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class server {

    static List<MatHang> listMH = (new listHang()).importList();

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(38);
            System.out.println("Server is running");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            int check = 1;
            do {
                // nhan lua chon
                check = in.readInt();
                if (check == 1) {
                    String maHang = in.readUTF();
                    int dem = 0;
                    for (MatHang mh : listMH) {
                        if (maHang.equalsIgnoreCase(mh.getMaHang())) {
                            dem++;
                            out.writeUTF(mh.view());
                            out.flush();
                            break;
                        }
                    }
                    if (dem == 0) {
                        out.writeUTF("khong co mat hang " + maHang);
                        out.flush();
                    }
                }
                if (check == 2) {
                    List<HoaDon> listHD = new ArrayList<>();
                    float tongDH = 0;
                    while (in.readInt() == 1) {
                        String matHang = in.readUTF();
                        int demS = 0;
                        for (MatHang mhh : listMH) {
                            if (matHang.equalsIgnoreCase(mhh.getTenHang())) {
                                out.writeInt(1);
                                out.flush();
                                demS++;
                                int soL;
                                do {
                                    soL = in.readInt();
                                    if (soL > mhh.getSoLuong()) {
                                        out.writeInt(0);
                                        out.flush();
                                    }else{
                                        out.writeInt(1);
                                        out.flush();
                                    }
                                } while (soL > mhh.getSoLuong());
                                listHD.add(new HoaDon(mhh.getTenHang(), soL));
                                tongDH += soL * mhh.getGiaBan();
                                break;
                            }

                        }
                        if (demS == 0) {
                            out.writeInt(0);
                            out.flush();
                        }
                    }
                    for (HoaDon hoaDon : listHD) {
                        out.writeUTF(hoaDon.view());
                        out.flush();
                    }
                    out.writeUTF("Tong thanh toanL " + tongDH);
                    out.flush();
                    out.writeUTF("null");
                    out.flush();
                }
            } while (check != 3);

        } catch (Exception e) {
        }
    }
}
