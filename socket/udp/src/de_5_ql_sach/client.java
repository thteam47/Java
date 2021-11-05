/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_5_ql_sach;

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
            Scanner scanner = new Scanner(System.in);
            InetAddress ip = InetAddress.getLocalHost();
            byte[] dataByte;
            int check;
            String data = "";
            do {
                System.out.println("1. Hien thi thong tin sach");
                System.out.println("2. Cho muon sach");
                System.out.println("3. Tra sach");
                System.out.println("4. Thoat");
                System.out.print("Lua chon: ");
                check = scanner.nextInt();
                if (check == 1) {
                    data = 1 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    //nhan so luong
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    client.receive(packet);
                    int soL = Integer.parseInt(new String(packet.getData(), 0, packet.getLength()));
                    for (int i = 0; i < soL; i++) {
                        dataByte = new byte[2048];
                        packet = new DatagramPacket(dataByte, dataByte.length);
                        client.receive(packet);
                        data = new String(packet.getData(), 0, packet.getLength());
                        String[] data1 = data.split("\\$");
                        System.out.println((i + 1) + ". Ma sach: " + data1[0] + ", Ten Sach: " + data1[1] + ", Nha xuat ban: " + data1[2] + ", So luong tong: " + data1[3] + ", So luong cho muon: " + data1[4]);
                    }
                } else if (check == 2) {
                    data = 2 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    //nhan ten sach
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    client.receive(packet);
                    System.out.println(new String(packet.getData(), 0, packet.getLength()) );
                    scanner.nextLine();
                    data = scanner.nextLine();
                    //gui lua chon ten sach
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    //nhan thong bao
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    client.receive(packet);
                    System.out.println(new String(packet.getData(), 0, packet.getLength()) );
                } else if (check == 3) {
                    data = 3 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    //nhan ten sach
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    client.receive(packet);
                    System.out.println(new String(packet.getData(), 0, packet.getLength()) );
                    scanner.nextLine();
                    data = scanner.nextLine();
                    //gui lua chon ten sach
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    //nhan thong bao
                    dataByte = new byte[2048];
                    packet = new DatagramPacket(dataByte, dataByte.length);
                    client.receive(packet);
                    System.out.println(new String(packet.getData(), 0, packet.getLength()) );
                } else {
                    data = 4 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    break;
                }

            } while (check != 4);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
