/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_5_ql_sach;

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

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(9999);
            System.out.println("Server is running");
            DatagramPacket packet;
            Scanner scanner = new Scanner(System.in);
            byte[] dataByte;
            int check;
            String data;
            do {
                dataByte = new byte[2048];
                packet = new DatagramPacket(dataByte, dataByte.length);
                server.receive(packet);
                //nhan lua chon 
                data = new String(packet.getData(), 0, packet.getLength());
                check = Integer.parseInt(data);

                if (check == 1) {
                    //gui so luong
                    dataByte = new byte[2048];
                    dataByte = (list.size() + "").getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                    server.send(packet);
                    //gui tung sach
                    for (sach s : list) {
                        System.out.println(s.toString());
                        dataByte = new byte[2048];
                        dataByte = s.toString().getBytes();
                        packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                        server.send(packet);
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
                    dataByte = new byte[2048];
                    dataByte = (data).getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                    server.send(packet);
                    //nhan ten sach
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    server.receive(packet);
                    data = new String(packet.getData(), 0, packet.getLength());
                    for (sach s :list){
                        if (s.getTenSach().equalsIgnoreCase(data)){
                            if(s.getSoLuong()>s.getSoLgcMuon()) {
                                s.setSoLgcMuon(s.getSoLgcMuon()+1);
                                data = "Cho muon thanh cong";
                                break;
                            }
                            else {
                                data = "Da het sach.";
                                break;
                            }
                        }                           
                    }
                    dataByte = new byte[2048];
                    dataByte = (data).getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                    server.send(packet);
                } else if (check==3){
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
                    dataByte = new byte[2048];
                    dataByte = (data).getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                    server.send(packet);
                    //nhan ten sach
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    server.receive(packet);
                    data = new String(packet.getData(), 0, packet.getLength());
                    for (sach s :list){
                        if (s.getTenSach().equalsIgnoreCase(data)){
                            s.setSoLgcMuon(s.getSoLgcMuon()-1);
                            data = "Tra thanh cong";
                        }                           
                    }
                    dataByte = new byte[2048];
                    dataByte = (data).getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                    server.send(packet);
                }

            } while (check != 4);
            //
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
