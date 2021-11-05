/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_thi;

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
                System.out.println("1. Tim kiem thong tin sinh vien");
                System.out.println("2. Hien thi danh sach khoa cong nghe thong tin");
                System.out.println("3. Hien thi toan bo danh sach");
                System.out.println("4. Thoat");
                System.out.print("Lua chon: ");
                check = scanner.nextInt();
                if (check == 3) {
                    data = 3 + "";
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
                        System.out.println((i + 1) + ". Ma sinh vien: " + data1[0] + ", Ho ten: " + data1[1] + ", Lop: " + data1[2] + ", Khoa: " + data1[3] + ", Khoa: " + data1[4]);
                    }
                } else if (check == 2) {
                    data = 2 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    //gui khoa
                    data = "CNTT";
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    // nhan thong tin
                    do {
                        dataByte = new byte[2048];
                        packet = new DatagramPacket(dataByte, dataByte.length);
                        client.receive(packet);
                        data = new String(packet.getData(), 0, packet.getLength());
                        if (data.equalsIgnoreCase("null")) {
                            break;

                        }
                        String[] data1 = data.split("\\$");
                        System.out.println(" Ma sinh vien: " + data1[0] + ", Ho ten: " + data1[1] + ", Lop: " + data1[2] + ", Khoa: " + data1[3] + ", Khoa: " + data1[4] );

                    } while (true);
                } else if (check == 1) {
                    data = 1 + "";
                    //gui lua chon
                    dataByte = new byte[2048];
                    dataByte = data.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    //gui ten
                    System.out.println("Nhap ten: ");
                    scanner.nextLine();
                    String ten = scanner.nextLine();
                    dataByte = new byte[2048];
                    dataByte = ten.getBytes();
                    packet = new DatagramPacket(dataByte, dataByte.length, ip, 9999);
                    client.send(packet);
                    // nhan thong tin
                    int i=1;
                    do {
                        dataByte = new byte[2048];
                        packet = new DatagramPacket(dataByte, dataByte.length);
                        client.receive(packet);
                        data = new String(packet.getData(), 0, packet.getLength());
                        if (data.equalsIgnoreCase("null")) {
                            if (i==1) System.out.println("Khong co sinh vien "+ten);
                            break;

                        }
                        String[] data1 = data.split("\\$");
                        System.out.println(" Ma sinh vien: " + data1[0] + ", Ho ten: " + data1[1] + ", Lop: " + data1[2] + ", Khoa: " + data1[3] + ", Khoa: " + data1[4] );

                    } while (true);

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
