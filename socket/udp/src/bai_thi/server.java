/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_thi;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {

    static List<sinhVien> list = (new listSV()).importList();

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

                if (check == 3) {
                    //gui so luong
                    dataByte = new byte[2048];
                    dataByte = (list.size() + "").getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                    server.send(packet);
                    //gui tung sinh vien
                    for (sinhVien s : list) {
                        System.out.println(s.toString());
                        dataByte = new byte[2048];
                        dataByte = s.toString().getBytes();
                        packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                        server.send(packet);
                    }
                } else if (check == 2) {

                    //nhan ten khoa
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    server.receive(packet);
                    String ten = new String(packet.getData(), 0, packet.getLength());
                    for (sinhVien s : list) {
                        if (s.getKhoa().equalsIgnoreCase(ten)) {
                            data = s.toString();
                            dataByte = new byte[2048];
                            dataByte = (data).getBytes();
                            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                            server.send(packet);
                        }
                    }
                    data = "null";
                    dataByte = new byte[2048];
                    dataByte = (data).getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                    server.send(packet);
                } else if (check == 1) {
                    //nhan ten 
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    server.receive(packet);
                    String ten = new String(packet.getData(), 0, packet.getLength());
                    for (sinhVien s : list) {
                        String hoTen = s.getHoTen();
                        String []tenC = hoTen.split(" ");
                        if (tenC[tenC.length-1].equalsIgnoreCase(ten)) {
                            data = s.toString();
                            dataByte = new byte[2048];
                            dataByte = (data).getBytes();
                            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                            server.send(packet);
                        }
                    }
                    data = "null";
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
