/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.List;

/**
 *
 * @author Dang Thi Thu H
 */
public class server {

    static List<nha> list = (new listNha()).importList();

    static void sendData(DatagramSocket server, DatagramPacket packet, String data) {
        try {
            byte[] dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);
        } catch (Exception e) {
        }
    }

    static String receiveData(DatagramSocket server, DatagramPacket packet) {
        try {
            byte[] dataReceive = new byte[2048];
            packet = new DatagramPacket(dataReceive, dataReceive.length);
            server.receive(packet);
        } catch (Exception e) {
        }
        return new String(packet.getData(), 0, packet.getLength());
    }

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(38);
            System.out.println("Server is running");
            DatagramPacket packet = null;
            //nhan lua chon

            int check = 0;
            do {
                //nhan lua chon
                byte[] dataReceive = new byte[2048];
                packet = new DatagramPacket(dataReceive, dataReceive.length);
                server.receive(packet);
                check = Integer.parseInt(new String(packet.getData(), 0, packet.getLength()));
                if (check == 1) {

                    //gui yeu cau 
                    sendData(server, packet, "Nhap so nha can tim: ");
                    //nhan sos nha
                    int soNha = Integer.parseInt(receiveData(server, packet));
                    int dem = 0;
                    for (nha n : list) {
                        if (n.getSoNha() == soNha) {
                            sendData(server, packet, n.toString());
                            dem++;
                            break;
                        }
                    }
                    if (dem == 0) {
                        sendData(server, packet, "Khong co nha " + soNha);
                    }
                    sendData(server, packet, null);
                } else if (check == 2) {
                    //gui yeu cau 
                    sendData(server, packet, "Hay nhap thong tin nha: ");
                    sendData(server, packet, "Nhap so nha: ");
                    nha n = new nha();
                    n.setSoNha(Integer.parseInt(receiveData(server, packet)));
                    sendData(server, packet, "Nhap gia ban: ");
                    n.setGiaBan(Float.parseFloat(receiveData(server, packet)));
                    sendData(server, packet, "Nhap tinh trang: \n1. Ban\n2. Chua ban\nLua chon: ");
                    int lua = Integer.parseInt(receiveData(server, packet));
                    if (lua == 1) {
                        n.setTinhTrang(true);
                    } else {
                        n.setTinhTrang(false);
                    }
                    sendData(server, packet, "Them thanh cong");
                }
            } while (check != 4);

        } catch (Exception e) {
        }

    }
}
