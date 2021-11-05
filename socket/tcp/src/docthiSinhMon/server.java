/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docthiSinhMon;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(567);
            System.out.println("Server is running");
            Socket socket = server.accept();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            BufferedReader br = null;
            int check = 1;
            String data;
            do {
                
                check = in.readInt();
                System.out.println(check);
                if (check == 1) {
                    try {
                        String ten = in.readUTF();
                        br = new BufferedReader(new FileReader("thisinhX.dat"));
                        do {
                            data = br.readLine() + "";
                            String[] data1 = data.split("\\$");
                            String[] data2 = data1[0].trim().split(" ");
                            String data3 = data2[data2.length - 1];
                            if (ten.equalsIgnoreCase(data3)) {
                                out.writeUTF(data);
                                out.flush();
                            }

                            if (data.equalsIgnoreCase("null")) {
                                out.writeUTF(data);
                                out.flush();
                                break;
                            }
                        } while (true);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (check == 2) {
                    //doc va gui tung nhan vien
                    try {
                        br = new BufferedReader(new FileReader("thisinhX.dat"));
                        do {
                            data = br.readLine() + "";
                            System.out.println(data);
                            out.writeUTF(data);
                            out.flush();
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
            in.close();
            out.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
