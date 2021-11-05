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
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {
    static boolean checkSoNT(int n){
        if (n<2) return false;
        if (n==2) return true;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket my_server = new DatagramSocket(2);
        byte[] receive_server = new byte[1024];
        DatagramPacket data_receive = new DatagramPacket(receive_server, receive_server.length);
        my_server.receive(data_receive);
        String data = new String(data_receive.getData(), 0, data_receive.getLength());
        int x = Integer.parseInt(data);
        String data_send="";
        if (checkSoNT(x)) {
            data_send = "la so nguyen to";
            
        }
        else data_send = "Khong la so nguyen to";
        
        byte[] datas = data_send.getBytes();
        int port = data_receive.getPort();
        InetAddress ip = data_receive.getAddress();
        DatagramPacket data_sendudp = new DatagramPacket(datas, datas.length, ip, port);
        my_server.send(data_sendudp);
    }

}
