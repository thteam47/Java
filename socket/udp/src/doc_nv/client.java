/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc_nv;

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
            int check = 1;
            String data = "";
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("1. Hien thi danh sach sinh vien");
                System.out.println("2. Thoat");
                System.out.println("Lua chon: ");
                check = sc.nextInt();
                if (check == 1) {
                    data = 1 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    int i=1;
                    do {
                        dataByte = new byte[2048];
                        packet = new DatagramPacket(dataByte, dataByte.length);
                        client.receive(packet);
                        data = new String(packet.getData(), 0, packet.getLength());
                        if (data.equalsIgnoreCase("null")) {
                            break;
                            
                        }
                        String[] data1 = data.split("\\$");
                        System.out.println((i++) + ". Ho ten: " + data1[0] + ", Tuoi: " + data1[1] + ", Que quan: " + data1[2] + ", Chuc vu: " + data1[3]);
                    } while (true);
                }
            } while (check != 2);
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
