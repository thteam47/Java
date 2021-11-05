/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_2_tichHaiSo;

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
            DatagramPacket packet;
            byte []byteData;
            InetAddress ip = InetAddress.getLocalHost();
            String data;
            //gui du lieu
            System.out.println("Nhap hai so nguyen duong: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            byteData = new byte[2048];
            byteData = (a+"$"+b).getBytes();
            packet = new DatagramPacket(byteData,byteData.length, ip, 38);
            client.send(packet);
            
            //nhan du lieu
            byteData = new byte[2048];
            packet = new DatagramPacket(byteData, byteData.length);
            client.receive(packet);
            data = new String(packet.getData(), 0, packet.getLength());
            System.out.println(data);
            client.close();
        } catch (Exception e) {
        }
        
    }
}
