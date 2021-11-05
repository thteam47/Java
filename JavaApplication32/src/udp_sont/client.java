/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp_sont;

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
            System.out.println("Nhap so nguyen duong");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            byte []dataByte = new byte[1024];
            dataByte = a.getBytes();
            InetAddress ip = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(dataByte, dataByte.length, ip, 12);
            client.send(packet);
            
            dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            client.receive(packet);
            String data = new String(packet.getData(),0,packet.getLength());
            System.out.println(data);
            dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            client.receive(packet);
            data = new String(packet.getData(),0,packet.getLength());
            System.out.println(data);
        } catch (Exception e) {
        }
    }
    
}
