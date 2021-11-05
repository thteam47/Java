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

    static List<cauThu> listCT = (new listCauThu()).importList();

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(38);
            System.out.println("Server is running");
            Socket socket = server.accept();
            String[] vitri = {"Tien dao", "Tien ve", "Hau ve", "Thu mon"};
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            int luachon = 1;
            while ((luachon = in.readInt()) != 3) {
                if (luachon == 1) {
                    cauThu ct = new cauThu();
                    ct.setMaCauThu(in.readUTF());
                    ct.setTenCauThu(in.readUTF());
                    ct.setNamSinh(in.readInt());
                    ct.setViTri(vitri[in.readInt()]);
                    ct.setLuong(in.readFloat());
                    listCT.add(ct);
                } else if (luachon == 2) {
                    String tenCt = in.readUTF();
                    int dem = 0;
                    for (cauThu thu : listCT) {
                        if (tenCt.equalsIgnoreCase(thu.getTenCauThu())) {
                            dem++;
                            out.writeInt(1);
                            out.flush();
                            float phanTram;
                            if (thu.getViTri().equalsIgnoreCase("Tien dao")) {
                                phanTram = 2.5f;
                            }else if (thu.getViTri().equalsIgnoreCase("Tien dao")) {
                                phanTram = 2.0f;
                            }else if (thu.getViTri().equalsIgnoreCase("Tien dao")) {
                                phanTram = 2.0f;
                            }else {
                                phanTram = 1.5f;
                            }
                            int soTran = in.readInt();
                            out.writeFloat(thu.getLuong()*soTran*(1+phanTram/100));
                        }
                    }
                    if (dem == 0) {
                        out.writeInt(1);
                        out.flush();
                        
                    }
                }
            }

        } catch (Exception e) {
        }
    }
}
