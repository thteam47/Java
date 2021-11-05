/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuDien;

import doc_thiSinhMon.*;
import doc_thiSinh.*;
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
            InetAddress ip = InetAddress.getLocalHost();
            byte[] dataByte;
            int check = 1;
            String data = "";
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("1. Tim tu dien");
                System.out.println("2. Hien thi danh sach tu dien");                
                System.out.println("3. Thoat");
                System.out.print("Lua chon: ");
                check = sc.nextInt();
                if (check ==1) {
                    data = 1 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    System.out.println("Nhap ten tu dien can tim: ");
                    sc.nextLine();
                    String ten =  sc.nextLine();
                    dataByte = new byte[2048];
                    dataByte = ten.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    
                    int i = 1;
                    do {
                        dataByte = new byte[2048];
                        packet = new DatagramPacket(dataByte, dataByte.length);
                        client.receive(packet);
                        data = new String(packet.getData(), 0, packet.getLength());
                        if (data.equalsIgnoreCase("null")) {
                            if (i==1) {
                                System.out.println("Khong co tu "+ ten);
                            }
                            break;

                        }
                        String[] data1 = data.split("\\$");
                        System.out.println((i++) + ". EN: " + data1[0] + ", VN: " + data1[1]);
                    } while (true);
                }
                else if (check == 2) {
                    data = 2 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    int i = 1;
                    do {
                        dataByte = new byte[2048];
                        packet = new DatagramPacket(dataByte, dataByte.length);
                        client.receive(packet);
                        data = new String(packet.getData(), 0, packet.getLength());
                        if (data.equalsIgnoreCase("null")) {
                            break;

                        }
                        String[] data1 = data.split("\\$");
                        System.out.println((i++) + ". EN: " + data1[0] + ", VN: " + data1[1]);

                    } while (true);
                } else if (check == 3) {
                    data = 3 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                }
            } while (check != 3);
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
