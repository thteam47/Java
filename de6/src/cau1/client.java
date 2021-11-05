/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {
    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao mot so: ");
            int x = scanner.nextInt();
            byte []data = (x + "").getBytes();
            DatagramPacket packet;
            InetAddress ip = InetAddress.getLocalHost();
            packet = new DatagramPacket(data, data.length, ip, 38);
            client.send(packet);
            data = new byte[1024];
            packet = new DatagramPacket(data, data.length);
            client.receive(packet);
            System.out.println(new String(packet.getData(), 0, packet.getLength()));
        } catch (Exception e) {
        }
    }
}
