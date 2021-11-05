/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Admin
 */
public class server {
    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(38);
            byte []data = new byte[1024];
            DatagramPacket packet;
            packet = new DatagramPacket(data, data.length);
            server.receive(packet);
            int x = Integer.parseInt(new String(packet.getData(), 0, packet.getLength()));
            String resp = "";
            String []dataS = {"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
            resp = dataS[x];
            data = resp.getBytes();
            packet = new DatagramPacket(data, data.length, packet.getAddress(), packet.getPort());
            server.send(packet);
        } catch (Exception e) {
        }
        
        
    }
}
