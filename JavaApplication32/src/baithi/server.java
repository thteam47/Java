/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author dangt
 */
public class server {

    static void sendPacket(DatagramSocket server, DatagramPacket packet, String data) {
        try {
            byte[] dataByte = new byte[2048];
            dataByte = (data).getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(38);
            System.out.println("Server is running");
            DatagramPacket packet;
            byte[] dataByte;
            String data;
            int check = 0;
            do {
                dataByte = new byte[1024];
                packet = new DatagramPacket(dataByte, dataByte.length);
                server.receive(packet);
                check = Integer.parseInt(new String(packet.getData(), 0, packet.getLength()));
                if (check == 1) {
                    dataByte = new byte[1024];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    server.receive(packet);
                    int dem = 0;
                    String mahs = new String(packet.getData(), 0, packet.getLength());
                    System.out.println(mahs);
                    BufferedReader br = new BufferedReader(new FileReader("hocsinh.dat"));
                    while ((data = br.readLine()) != null) {
                        String[] data1 = data.split("\\$");
                        System.out.println(data);
                        if (data1[0].equalsIgnoreCase(mahs)) {
                            data = "Ma hoc sinh: " + data1[0] + ", Ten hoc sinh: " + data1[1] + ", Lop: " + data1[2] + ", Diem tong ket: " + data1[3];
                            sendPacket(server, packet, data);
                            dem++;
                            break;
                        }

                    }
                    if (dem == 0) {
                        sendPacket(server, packet, "Khong co hoc sinh");
                    }
                    sendPacket(server, packet, "null");
                }
                

            } while (check != 2);
        } catch (Exception e) {
        }
    }
}
