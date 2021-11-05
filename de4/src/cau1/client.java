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
            String chu;
            do {                
                System.out.println("Nhap mot ki tu Anphabe: ");
                chu = sc.nextLine();
                if (chu.length()>1) System.out.println("Nhap 1 ki tu thoi");
            } while (chu.length()>1);
            
            byte []dataByte = new byte[1024];
            dataByte = chu.getBytes();
            InetAddress ip = InetAddress.getLocalHost();
            DatagramPacket packet;
            packet = new DatagramPacket(dataByte, dataByte.length, ip, 38);
            client.send(packet);
            
            dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            client.receive(packet);
            String result = new String(packet.getData(),0,packet.getLength());
            System.out.println("Ket qua la: "+result);
        } catch (Exception e) {
        }
    }
}
