/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_8_tinhBinhPhuong;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Admin
 */
public class server {
    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(38);
            System.out.println("Server is running");
            DatagramPacket packet;
            String data;
            byte []byteData;
            //nhan du lieu
            byteData = new byte[2048];
            packet = new DatagramPacket(byteData, byteData.length);
            server.receive(packet);
            data = new String(packet.getData(), 0, packet.getLength());
            //xu li du lieu
            int x = Integer.parseInt(data);
            int binhPhuong = x*x;
            //gui du lieu
            byteData = new byte[2048];
            byteData = ("Binh phuong la: " + binhPhuong).getBytes();
            packet = new DatagramPacket(byteData,byteData.length, packet.getAddress(), packet.getPort());
            server.send(packet);
            //dong luong
            server.close();
        } catch (Exception e) {
        }
        
    }
}
