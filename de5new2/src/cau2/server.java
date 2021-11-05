/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class server {

    static List<String> lichSu = new ArrayList<>();

    static void sendData(DatagramSocket server, DatagramPacket packet, String data) {
        try {
            byte[] dataByte = new byte[1024];
            dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);
        } catch (Exception e) {
        }
    }

    static String receive(DatagramSocket server) {
        DatagramPacket packet = null;
        try {
            byte[] dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            server.receive(packet);
        } catch (Exception e) {
        }
        return new String(packet.getData(), 0, packet.getLength());
    }

    static float tienSo = 3535;

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(38);
            System.out.println("Server is running");
            DatagramPacket packet = null;
            int luachon =1;
            float tien;
            do {
                byte[] dataByte = new byte[1024];
                packet = new DatagramPacket(dataByte, dataByte.length);
                server.receive(packet);
                luachon = Integer.parseInt(new String(packet.getData(), 0, packet.getLength()));
                if (luachon==1) {
                    tien = Float.parseFloat(receive(server));
                    tienSo += tien;
                    lichSu.add("Thu tien "+tien);
                }else if (luachon ==2){
                    tien = Float.parseFloat(receive(server));
                    tienSo -= tien;
                    lichSu.add("Chi tien "+tien);
                }else if (luachon ==3){
                    sendData(server, packet, (tienSo+""));
                }else if (luachon==4){
                    for (String t : lichSu) {
                        System.out.println(t);
                        sendData(server, packet, t);
                    }
                    sendData(server, packet, "null");
                }
            } while (luachon !=5);
        } catch (Exception e) {
        }
    }
}
