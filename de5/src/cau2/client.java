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
    
    public static void sendData(DatagramSocket client, InetAddress ip, int port, String data) {
        DatagramPacket packet;
        try {
            byte[] dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, ip, port);
            client.send(packet);
        } catch (Exception e) {
        }
    }
    public static String receiveData(DatagramSocket client){
        DatagramPacket packet = null;
        try {
            byte[]dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            client.receive(packet);
            
        } catch (Exception e) {
        }
        return new String(packet.getData(),0,packet.getLength());
    }
    
    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            DatagramPacket packet;
            int check=0;
            String data = "";
            Scanner sc = new Scanner(System.in);
            do {                
                System.out.println("1. Hien thi thong tin sach");
                System.out.println("2. Muon sach");
                System.out.println("3. Tra sach");
                System.out.println("4. Thoat");
                System.out.print("Lua chon: ");
                check = sc.nextInt();
                
                if (check==1){
                    sendData(client, ip, 38, check+"");
                    while (!(data=receiveData(client)).equalsIgnoreCase("null")) {                        
                        System.out.println(data);
                    }
                }
                else if (check==2){
                    sendData(client, ip, 38, check+"");
                    System.out.println("Cac sach co the cho muon la");
                    while (!(data=receiveData(client)).equalsIgnoreCase("null")) {                        
                        System.out.println(data);
                    }
                    System.out.println("Nhap ma sach can muon: ");
                    sc.nextLine();
                    String maSach = sc.nextLine();
                    sendData(client, ip, 38, maSach);
                    System.out.println(receiveData(client));
                }
                else if (check==3){
                    sendData(client, ip, 38, check+"");
                    
                    System.out.println("Nhap ma sach can tra: ");
                    sc.nextLine();
                    String maSach = sc.nextLine();
                    sendData(client, ip, 38, maSach);
                    System.out.println(receiveData(client));
                }
                else if (check==4){
                    sendData(client, ip, 38, check+"");
                }
            } while (check!=4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
