/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuDien;

import doc_thiSinhMon.*;
import doc_thiSinh.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(9999);
            System.out.println("Server is running");
            DatagramPacket packet;
            Scanner scanner = new Scanner(System.in);
            BufferedReader br = null;
            byte[] dataByte;
            int check = 1;
            String data;
            do {
                dataByte = new byte[2048];
                packet = new DatagramPacket(dataByte, dataByte.length);
                server.receive(packet);
                //nhan lua chon 
                data = new String(packet.getData(), 0, packet.getLength());
                check = Integer.parseInt(data);
                if (check == 1) {
                    try {
                        dataByte = new byte[2048];
                        packet = new DatagramPacket(dataByte, dataByte.length);
                        server.receive(packet);
                        //nhan tu
                        String tu = new String(packet.getData(), 0, packet.getLength());
                        br = new BufferedReader(new FileReader("tu_dien.txt"));
                        do {
                            data = br.readLine() + "";
                            String[] data1 = data.split("\\$");
                            if (tu.equalsIgnoreCase(data1[0])||tu.equalsIgnoreCase(data1[1])) {
                                dataByte = new byte[2048];
                                dataByte = data.getBytes();
                                packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                                server.send(packet);
                                data="null";
                            }
                            
                            if (data.equalsIgnoreCase("null")) {
                                dataByte = new byte[2048];
                                dataByte = data.getBytes();
                                packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                                server.send(packet);
                                break;
                            }
                        } while (true);

                    } catch (Exception e) {
                    }
                } else if (check == 2) {
                    //doc va gui tung nhan vien
                    try {
                        br = new BufferedReader(new FileReader("tu_dien.txt"));
                        do {
                            data = br.readLine() + "";
                            System.out.println(data);
                            dataByte = new byte[2048];
                            dataByte = data.getBytes();
                            packet = new DatagramPacket(dataByte, dataByte.length, packet.getAddress(), packet.getPort());
                            server.send(packet);
                            if (data.equalsIgnoreCase("null")) {
                                break;
                            }
                        } while (true);

                    } catch (Exception e) {
                    }
                } else {
                    break;
                }

            } while (check != 3);
            server.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
