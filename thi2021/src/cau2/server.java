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

    static List<hangHoa> listHH = (new listHang()).importList();
    static List<listMua> listM = new ArrayList<>();
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(38);
            System.out.println("Server is running");
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            int luachon = 1;
            do {
                luachon = in.readInt();
                if (luachon == 1) {
                    for (hangHoa hh : listHH) {
                        out.writeUTF(hh.dSachHang());
                        out.flush();
                    }
                    out.writeUTF("null");
                    out.flush();
                } else if (luachon == 2) {
                    hangHoa hh = new hangHoa();
                    hh.setTenHang(in.readUTF());
                    hh.setGiaBan(in.readFloat());
                    int soLuon = in.readInt();
                    hh.setSoLuong(soLuon);
                    if (soLuon == 0) {
                        hh.setTinhTrang("het hang");
                    } else {
                        hh.setTinhTrang("con hang");
                    }
                    listHH.add(hh);
                    out.writeUTF("Them thanh cong");
                    out.flush();

                } else if (luachon == 3) {
                    String tenHang = in.readUTF();
                    System.out.println(tenHang);
                    int dem = 0;
                    for (hangHoa hh : listHH) {
                        if (tenHang.equalsIgnoreCase(hh.getTenHang())) {
                            dem++;
                            out.writeInt(1);
                            out.flush();
                            int soL = in.readInt();
                            if (soL > hh.getSoLuong()) {
                                out.writeInt(0);
                                out.flush();

                            } else {
                                out.writeInt(1);
                                out.flush();
                                hh.setSoLuong(hh.getSoLuong() - soL);
                                if (hh.getSoLuong() == 0) {
                                    hh.setTinhTrang("Het hang");
                                }
                                listM.add(new listMua(hh.getTenHang(),soL));
                            }
                            break;
                        }
                    }
                    if (dem == 0) {
                        out.writeInt(0);
                        out.flush();
                    }
                } else if (luachon == 4) {
                    for (hangHoa hh : listHH) {
                        out.writeUTF(hh.view());
                        out.flush();

                    }
                    out.writeUTF("null");
                    out.flush();
                    if (listM.isEmpty()) {
                        out.writeUTF("Chua mua hang");
                        out.flush();
                    }else{
                        for (listMua mua : listM) {
                        out.writeUTF(mua.listMu());
                        out.flush();
                    }
                    }
                    out.writeUTF("null");
                    out.flush();
                }
            } while (luachon != 5);
        } catch (Exception e) {
        }
    }
}
