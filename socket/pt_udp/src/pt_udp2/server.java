/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_udp2;

import pt_udp.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {

    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket my_server = new DatagramSocket(9);
        byte[] receive_server = new byte[1024];
        DatagramPacket data_receive = new DatagramPacket(receive_server, receive_server.length);
        my_server.receive(data_receive);
        String data = new String(data_receive.getData(), 0, data_receive.getLength());
        String[] datax = data.split(" ");
        int x = Integer.parseInt(datax[0]);    
        int y = Integer.parseInt(datax[1]);  
        int tong  = x+y;
        String data_send = String.valueOf(tong);
        byte[] datas = data_send.getBytes();
        int port = data_receive.getPort();
        InetAddress ip = data_receive.getAddress();
        DatagramPacket data_sendudp = new DatagramPacket(datas, datas.length, ip, port);
        my_server.send(data_sendudp);
    }

}
