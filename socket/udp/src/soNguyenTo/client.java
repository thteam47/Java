/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soNguyenTo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket my_client = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        String x = scanner.nextLine();
        InetAddress ip =  InetAddress.getByName("localhost");
        DatagramPacket data_client = new DatagramPacket(x.getBytes(), x.length(), ip, 2);
        my_client.send(data_client);
        
        
        byte[] receive = new byte[1024];
        DatagramPacket data_receive = new DatagramPacket(receive, receive.length);
        my_client.receive(data_receive);
        String data = new String(data_receive.getData(),0,data_receive.getLength());
        System.out.println(data);
    }
}