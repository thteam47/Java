/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function_udp_sach;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {

    static void sendPacket(DatagramSocket client, DatagramPacket packet,InetAddress ip, int port, String data) {
        try {
            byte[] dataByte = new byte[2048];
            dataByte = (data).getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, ip, port);
            client.send(packet);
        } catch (Exception e) {
        }
    }

    static String receivePacket(DatagramSocket client, DatagramPacket packet) {
        try {
            byte[] dataByte = new byte[2048];
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
                    sendPacket(client, packet, ip,9999,data);
                    //nhan so luong
                    
                    int soL = Integer.parseInt(receivePacket(client, packet));
                    for (int i = 0; i < soL; i++) {
                        data = receivePacket(client, packet);
                        String[] data1 = data.split("\\$");
                        System.out.println((i + 1) + ". Ma sach: " + data1[0] + ", Ten Sach: " + data1[1] + ", Nha xuat ban: " + data1[2] + ", So luong tong: " + data1[3] + ", So luong cho muon: " + data1[4]);
                    }
                } else if (check == 2) {
                    data = 2 + "";
                    //gui lua chon
                    sendPacket(client, packet, ip,9999,data);
                    //nhan ten sach
                    System.out.println(receivePacket(client, packet));
                    scanner.nextLine();
                    data = scanner.nextLine();
                    //gui lua chon ten sach
                    sendPacket(client, packet,ip,9999, data);
                    //nhan thong bao
                   
                    System.out.println(receivePacket(client, packet));
                } else if (check == 3) {
                    data = 3 + "";
                    //gui lua chon
                    sendPacket(client, packet,ip,9999, data);
                    //nhan ten sach
                    
                    System.out.println(receivePacket(client, packet));
                    scanner.nextLine();
                    data = scanner.nextLine();
                    //gui lua chon ten sach
                    sendPacket(client, packet, ip,9999,data);
                    //nhan thong bao
                    
                    System.out.println(receivePacket(client, packet) );
                } else {
                    data = 4 + "";
                    //gui lua chon
                    sendPacket(client, packet,ip,9999, data);
                    break;
                }

            } while (check != 4);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
