
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dangt
 */
public class server {
    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(12);
            System.out.println("server da san sang");
            byte[] dataByte = new byte[1024];
            DatagramPacket packet = new DatagramPacket(dataByte, dataByte.length);
            server.receive(packet);
        } catch (Exception e) {
        }
    }
    
    
}
