/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function_udp_sach;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {

    static List<sach> list = (new listSach()).importList();

    static void sendPacket(DatagramSocket server, DatagramPacket packet, String data) {
        try {
            byte[] dataByte = new byte[2048];
            dataByte = (data).getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);
        } catch (Exception e) {
        }
    }

    static String receivePacket(DatagramSocket server, DatagramPacket packet) {
        try {
            byte[] dataByte = new byte[2048];
            packet = new DatagramPacket(dataByte, dataByte.length);
            server.receive(packet);
        } catch (Exception e) {
        }
        return new String(packet.getData(), 0, packet.getLength());
    }

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(9999);
            System.out.println("Server is running");
            DatagramPacket packet = null;
            Scanner scanner = new Scanner(System.in);
            byte[] dataByte;
            int check;
            String data;
            do {
                //nhan lua chon 
                dataByte = new byte[2048];
                packet = new DatagramPacket(dataByte, dataByte.length);
                server.receive(packet);
                data = new String(packet.getData(), 0, packet.getLength());
                check = Integer.parseInt(data);

                if (check == 1) {
                    //gui so luong
                    sendPacket(server, packet, list.size() + "");
                    //gui tung sach
                    for (sach s : list) {
                        System.out.println(s.toString());

                        sendPacket(server, packet, s.toString());
                    }
                } else if (check == 2) {
                    data = "Cac sach co trong thu vien:\n";
                    //gui ten sach 
                    for (int i = 0; i < list.size(); i++) {
                        if (i != (list.size() - 1)) {
                            data += list.get(i).getTenSach() + ", ";
                        } else {
                            data += list.get(i).getTenSach();
                        }
                    }
                    data += "\nHay nhap ten sach can muon";
                    sendPacket(server, packet, data);
                    //nhan ten sach
                    data = receivePacket(server, packet);
                    for (sach s : list) {
                        if (s.getTenSach().equalsIgnoreCase(data)) {
                            if (s.getSoLuong() > s.getSoLgcMuon()) {
                                s.setSoLgcMuon(s.getSoLgcMuon() + 1);
                                data = "Cho muon thanh cong";
                                break;
                            } else {
                                data = "Da het sach.";
                                break;
                            }
                        }
                    }
                    sendPacket(server, packet, data);
                } else if (check == 3) {
                    data = "Cac sach co trong thu vien:\n";
                    //gui ten sach 
                    for (int i = 0; i < list.size(); i++) {
                        if (i != (list.size() - 1)) {
                            data += list.get(i).getTenSach() + ", ";
                        } else {
                            data += list.get(i).getTenSach();
                        }
                    }
                    data += "\nHay nhap ten sach can tra";
                    sendPacket(server, packet, data);
                    //nhan ten sach

                    data = receivePacket(server, packet);
                    for (sach s : list) {
                        if (s.getTenSach().equalsIgnoreCase(data)) {
                            s.setSoLgcMuon(s.getSoLgcMuon() - 1);
                            data = "Tra thanh cong";
                        }
                    }
                    sendPacket(server, packet, data);
                }

            } while (check != 4);
            //
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
