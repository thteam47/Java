/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

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
            Socket socket = new Socket("localhost", 38);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            int check = 1;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("1. Hien thi danh sach hang hoa");
                System.out.println("2. Them hang hoa");
                System.out.println("3. Mua hang");
                System.out.println("4. Thong ke hang hoa");
                System.out.println("5. Thoat");
                System.out.println("Lua chon: ");
                check = scanner.nextInt();
                switch (check){
                    case 1: 
                        out.writeInt(check);
                        out.flush();
                        String data ="";
                        System.out.println("Danh sach hang hoa");
                        while ((data=in.readUTF()).equalsIgnoreCase("null")==false) {                            
                            System.out.println(data);
                           
                        }
                        break;
                    case 2: 
                        out.writeInt(check);
                        out.flush();
                        System.out.println("Hay them mat hang: ");
                        System.out.println("Them ten hang: ");
                        scanner.nextLine();
                        out.writeUTF(scanner.nextLine());
                        out.flush();
                        System.out.println("Gia ban: ");
                        out.writeFloat(scanner.nextFloat());
                        out.flush();
                        System.out.println("So luong: ");
                        int sl =scanner.nextInt();
                        out.writeInt(sl);
                        out.flush();
                        System.out.println(in.readUTF());
                        break;
                    case 3: 
                        out.writeInt(check);
                        out.flush();
                        System.out.println("Nhap ten mat hang can mua: ");
                        scanner.nextLine();
                        out.writeUTF(scanner.nextLine());
                        out.flush();
                        if (in.readInt()==1) {
                            System.out.println("Nhap so luong can mua: ");
                            out.writeInt(scanner.nextInt());
                            out.flush();
                            if (in.readInt()==1){
                                System.out.println("Mua thanh cong");
                            }
                            else{
                                System.out.println("So luong qua lon. Nhap lai");
                            }
                        }
                        else{
                            System.out.println("Khong co mat hang nay");
                        }
                        break;
                    case 4: 
                        out.writeInt(check);
                        out.flush();
                        
                        String data1 ="";
                        System.out.println("Danh sach hang hoa");
                        while ((data1=in.readUTF()).equalsIgnoreCase("null")==false) {                            
                            System.out.println(data1);
                           
                        }
                        System.out.println("Danh sach hang da mua: ");
                        while ((data1=in.readUTF()).equalsIgnoreCase("null")==false) {                            
                            System.out.println(data1);
                           
                        }
                        break;
                        
                    case 5: 
                        out.writeInt(check);
                        out.flush();
                        break;
                    default:
                        System.out.println("Nhap lai lua chon");
                        break;
                }
            } while (check!=5);

        } catch (Exception e) {
        }
    }
}
