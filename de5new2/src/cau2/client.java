/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {

    static void sendData(DatagramSocket client, DatagramPacket packet, InetAddress ip, int port, String data) {
        try {
            byte[] dataByte = new byte[1024];
            dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, ip, port);
            client.send(packet);
        } catch (Exception e) {
        }
    }

    static String receive(DatagramSocket client) {
        DatagramPacket packet = null;
        try {
            byte[] dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            client.receive(packet);
        } catch (Exception e) {
        }
        return new String(packet.getData(), 0, packet.getLength());
    }

    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket();
            DatagramPacket packet = null;
            int check = 1;
            Scanner scanner = new Scanner(System.in);
            InetAddress ip = InetAddress.getLocalHost();
            int port = 38;
            do {
                System.out.println("1. Thu tien");
                System.out.println("2. Chi tien");
                System.out.println("3. Xem so du");
                System.out.println("4. Xem lich su thu tien");
                System.out.println("5. Thoat");
                System.out.println("Lua chon: ");
                check = scanner.nextInt();
                float tien =0;
                switch (check) {
                    case 1:
                        sendData(client, packet, ip, port, (1 + ""));
                        System.out.println("Nhap so tien can thu: ");
                        tien = scanner.nextFloat();
                        sendData(client, packet, ip, port, (tien + ""));
                        System.out.println("Them thanh cong");
                        break;
                    case 2:
                        sendData(client, packet, ip, port, (2 + ""));
                        System.out.println("Nhap so tien can thu: ");
                        tien = scanner.nextFloat();
                        sendData(client, packet, ip, port, (tien + ""));
                        System.out.println("Chi thanh cong");
                        break;
                    case 3:
                        sendData(client, packet, ip, port, (3 + ""));
                        System.out.println("So tien con lai: "+receive(client));
                        break;
                    case 4:
                        sendData(client, packet, ip, port, (4 + ""));
                        String data = "";
                        System.out.println("Lich su: ");
                        while ((data = receive(client)).equalsIgnoreCase("null")==false) {                            
                            System.out.println(data);
                        }
                        break;
                    case 5:
                        sendData(client, packet, ip, port, (5 + ""));
                        break;
                    default:
                        System.out.println("Xin nhap lai");
                        break;

                }
            } while (check != 5);
        } catch (Exception e) {
        }
    }
}
