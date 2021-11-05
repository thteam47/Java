/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_6_chuyenDoiSo;

import udp.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Admin
 */
public class server {

    
    
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket server = new DatagramSocket(38);
        String []data = {"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
        while (true) {
            byte[] receive = new byte[1024];
            DatagramPacket rePacket = new DatagramPacket(receive, receive.length);
            server.receive(rePacket);
            String dataReceive = new String(rePacket.getData(),0,rePacket.getLength());
           
            byte[] sendByte = (data[Integer.parseInt(dataReceive)]).getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendByte, sendByte.length, rePacket.getAddress(), rePacket.getPort());
            server.send(sendPacket);
        }

    }
}
