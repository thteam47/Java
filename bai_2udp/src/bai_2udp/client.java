/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Dang Thi Thu H
 */
public class client {
    static void sendData(DatagramSocket server, DatagramPacket packet,InetAddress ip, int port,String data) {
        try {
            byte[] dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length,ip, port);
            server.send(packet);
        } catch (Exception e) {
        }
    }
    static String receiveData(DatagramSocket server, DatagramPacket packet){
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
            DatagramPacket packet = null;
            InetAddress ip = InetAddress.getLocalHost();
            Scanner sc = new Scanner(System.in);
            int check;
            do {                
                System.out.println("1. Tim kiem nha trong chung cu");
                System.out.println("2. Them nha vao chung cu");
                System.out.println("3. Mua nha");
                System.out.println("4. Thoat");
                System.out.print("Lua chon: ");
                check = sc.nextInt();
                if (check==1) {
                    //gui lua chon
                    sendData(client, packet,ip, 38, "1");
                    //nhan du lieu
                    System.out.println(receiveData(client, packet));
                    int soNha = sc.nextInt();
                    //gui so nha
                    sendData(client, packet, ip, 38, soNha+"");
                    //nhan du lieu
                    System.out.println(receiveData(client, packet));
                }
                else if (check==2){
                    //gui lua chon
                    sendData(client, packet,ip, 38, "2");
                    //nhan du lieu
                    System.out.println(receiveData(client, packet));
                    System.out.println(receiveData(client, packet));
                    int sonha= sc.nextInt();
                    sendData(client, packet, ip, 38, sonha+"");
                    System.out.println(receiveData(client, packet));
                    float giaban= sc.nextFloat();
                    sendData(client, packet, ip, 38, giaban+"");
                    System.out.println(receiveData(client, packet));
                    int lua = sc.nextInt();
                    sendData(client, packet, ip, 38, lua+"");
                    System.out.println(receiveData(client, packet));
                }
                else if (check==3){
                    
                }
            } while (check!=4);
        } catch (Exception e) {
        }
    }
}
