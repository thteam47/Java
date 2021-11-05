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
            byte[] dataByte = new byte[1024];
            DatagramPacket packet;
            packet = new DatagramPacket(dataByte, dataByte.length);
            server.receive(packet);
            String data = new String(packet.getData(),0,packet.getLength());
            
            String dataNew = data.toUpperCase();
        
            dataByte = new byte[1024];
            dataByte= dataNew.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);
        } catch (Exception e) {
        }
    }
}
