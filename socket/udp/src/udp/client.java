/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
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
        DatagramSocket client = new DatagramSocket();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Client: ");
            String send = scanner.nextLine();
            byte[] dataSend = send.getBytes();
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket clientPacket = new DatagramPacket(dataSend, dataSend.length, ip, 38);
            client.send(clientPacket);

            byte[] reByte = new byte[1024];
            DatagramPacket rePacket = new DatagramPacket(reByte, reByte.length);
            client.receive(rePacket);
            String reString = new String(rePacket.getData());
            System.out.println("Server: " + reString);
        }
        
    }
}
