/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

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
            //nhan du lieu
            byte []dataByte = new byte[1024];
            DatagramPacket packet;
            packet = new DatagramPacket(dataByte, dataByte.length);
            server.receive(packet);
            String data = new String(packet.getData(),0,packet.getLength());
            
            //xu li du lieu
            int x = Integer.parseInt(data);
            dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            server.receive(packet);
            data = new String(packet.getData(),0,packet.getLength());
            int y = Integer.parseInt(data);
            int tich = x*y;
            data = tich+"";
            //gui du lieu
            dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);
            
        } catch (Exception e) {
        }
    }
}
