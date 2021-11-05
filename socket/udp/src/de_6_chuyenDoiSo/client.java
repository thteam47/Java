/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_6_chuyenDoiSo;

import udp.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket client = new DatagramSocket();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int x;
            do {
                System.out.print("Nhap so: ");
                x = scanner.nextInt();
                if (x<0||x>9) System.out.println("Nhap lai");
            } while (x<0||x>9);

                       
            byte[] dataSend = (x+"").getBytes();
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket clientPacket = new DatagramPacket(dataSend, dataSend.length, ip, 38);
            client.send(clientPacket);

            byte[] reByte = new byte[1024];
            DatagramPacket rePacket = new DatagramPacket(reByte, reByte.length);
            client.receive(rePacket);
            System.out.println(new String(rePacket.getData(),0,rePacket.getLength()));
        }

    }
}
