/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp_sont;

import com.sun.xml.internal.ws.api.message.Packet;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author Admin
 */
public class server {

    static int ckeck(int a) {
        if (a < 2) {
            return 0;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(12);
            System.out.println("server da san sang");
            byte[] dataByte = new byte[1024];
            DatagramPacket packet = new DatagramPacket(dataByte, dataByte.length);
            server.receive(packet);

            String data = new String(packet.getData(), 0, packet.getLength());
            int n = Integer.parseInt(data);
            data = "";
            int dem = 0;
            for (int i = 1; i <= n; i++) {
                if (ckeck(i) == 1) {
                    dem++;
                    data += i + " ";
                }
            }

            dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);
            dataByte = (dem+"").getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);

        } catch (Exception e) {
        }
    }

}
