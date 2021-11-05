/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.List;

/**
 *
 * @author Admin
 */
public class server {

    static List<sach> list = (new listSach()).importList();

    public static void sendData(DatagramSocket server, DatagramPacket packet, String data) {
        try {
            byte[] dataByte = data.getBytes();
            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
            server.send(packet);
        } catch (Exception e) {
        }
    }

    public static String receiveData(DatagramSocket server) {
        DatagramPacket packet = null;
        try {
            byte[] dataByte = new byte[1024];
            packet = new DatagramPacket(dataByte, dataByte.length);
            server.receive(packet);

        } catch (Exception e) {
        }
        return new String(packet.getData(), 0, packet.getLength());
    }

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(38);
            System.out.println("Server is running");
            DatagramPacket packet;
            int check = 0;
            do {
                byte[] dataByte = new byte[1024];
                packet = new DatagramPacket(dataByte, dataByte.length);
                server.receive(packet);
                check = Integer.parseInt(new String(packet.getData(), 0, packet.getLength()));
                if (check == 1) {
                    for (sach s : list) {
                        sendData(server, packet, s.toString());
                    }
                    sendData(server, packet, "null");
                } else if (check == 2) {
                    for (sach s : list) {
                        if (s.getSoLuongMuon() < s.soLuongTong) {
                            sendData(server, packet, s.toString());
                        }
                    }
                    sendData(server, packet, "null");
                    
                    //nhan ma sach
                    String maSach = receiveData(server);
                    for (sach s : list) {
                        if (s.getMaSach().equalsIgnoreCase(maSach)) {
                            s.setSoLuongMuon(s.getSoLuongMuon()+1);
                            break;
                        }
                    }
                    sendData(server, packet, "Cho muon thanh cong");
                }else if (check == 3) {
                    
                    //nhan ma sach
                    String maSach2 = receiveData(server);
                    
                    for (sach s : list) {
                        if (s.getMaSach().equalsIgnoreCase(maSach2)) {
                            s.setSoLuongMuon(s.getSoLuongMuon()-1);
                            break;
                        }
                    }
                    sendData(server, packet, "tra sach thanh cong");
                }

            } while (check != 4);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
