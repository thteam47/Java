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
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap hai so nguyen duong: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            DatagramPacket packet;
            String data = x + "";
            byte[] dataByte = data.getBytes();
            InetAddress ip = InetAddress.getLocalHost();
            packet = new DatagramPacket(dataByte, dataByte.length, ip, 38);
            client.send(packet);
            //gui y
            data = y + "";
            dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, ip, 38);
            client.send(packet);
            //nhan du lieu
            dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            client.receive(packet);
            System.out.println("Tich cua hai so la: " + new String(packet.getData(), 0, packet.getLength()));
        } catch (Exception e) {
        }
    }
}
