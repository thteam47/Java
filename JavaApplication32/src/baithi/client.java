/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithi;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author dangt
 */
public class client {
    static String receiveData(DatagramSocket server, DatagramPacket packet) {
        try {
            byte[] dataReceive = new byte[2048];
            packet = new DatagramPacket(dataReceive, dataReceive.length);
            server.receive(packet);
        } catch (Exception e) {
        }
        return new String(packet.getData(), 0, packet.getLength());
    }
    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            InetAddress ip = InetAddress.getLocalHost();
            DatagramPacket packet;
            String data;
            byte[] dataByte;
            int check = 0;
            do {
                System.out.println("1. Tim kiem thong tin hoc sinh");
                System.out.println("2. Thoat");
                check = sc.nextInt();
                if (check == 1) {
                    dataByte = new byte[1024];
                    dataByte = (check + "").getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 38);
                    client.send(packet);
                    System.out.println("Nhap ma hoc sinh can tim: ");
                    sc.nextLine();
                    String maHS = sc.nextLine();
                    dataByte = new byte[1024];
                    dataByte = (maHS).getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 38);
                    client.send(packet);
                    while (!(data = receiveData(client, packet)).equalsIgnoreCase("null")) {                        
                        System.out.println(data);
                    }
                }
                else if (check==2){
                    dataByte = new byte[1024];
                    dataByte = (check + "").getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 38);
                    client.send(packet);
                }

            } while (check!=2);
        } catch (Exception e) {
        }
    }
}
