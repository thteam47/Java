/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docthiSinhMon;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 567);

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            int check = 1;
            String data = "";
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("1. Tim thi sinh");
                System.out.println("2. Hien thi danh sach thi sinh");
                System.out.println("3. Thoat");
                System.out.print("Lua chon: ");
                check = sc.nextInt();
                if (check == 1) {
                    out.writeInt(check);
                    out.flush();
                    System.out.println("Nhap ten thi sinh can tim: ");
                    sc.nextLine();
                    String ten = sc.nextLine();
                    out.writeUTF(ten);
                    out.flush();

                    int i = 1;
                    do {
                        data = in.readUTF();
                        if (data.equalsIgnoreCase("null")) {
                            if (i == 1) {
                                System.out.println("Khong co thi sinh " + ten);
                            }
                            break;

                        }
                        String[] data1 = data.split("\\$");
                        System.out.println((i++) + ". Ho ten: " + data1[0] + ", So CMND: " + data1[1] + ", Dia chi: " + data1[2] + ", Nam Sinh: " + data1[3] + ", Diem mon 1: " + data1[4] + ", Diem mon 2: " + data1[5] + ", Diem mon 3: " + data1[6]);
                    } while (true);
                } else if (check == 2) {
                     out.writeInt(check);
                    out.flush();
                    //gui lua chon
                    
                    int i = 1;
                    do {                        
                        data = in.readUTF();
                        if (data.equalsIgnoreCase("null")) {
                            break;
                        }
                        String[] data1 = data.split("\\$");
                        System.out.println((i++) + ". Ho ten: " + data1[0] + ", So CMND: " + data1[1] + ", Dia chi: " + data1[2] + ", Nam Sinh: " + data1[3] + ", Diem mon 1: " + data1[4] + ", Diem mon 2: " + data1[5] + ", Diem mon 3: " + data1[6]);

                    } while (true);
                } else if (check == 3) {
                    out.writeInt(check);
                    out.flush();
                }
            } while (check != 3);
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
