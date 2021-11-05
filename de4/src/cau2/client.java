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
            int check = 0;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Ban da san sang chua");
                System.out.println("1. Bat dau");
                System.out.println("2. Thoat");
                check = sc.nextInt();
                if (check == 1) {
                    out.writeInt(check);
                    out.flush();
                    //nhan cau hoi
                    
                    String data = in.readUTF();
                    String []dataCH = data.split("\\$");
                    for (int i=0;i<3;i++){
                        System.out.println("Cau hoi "+ (i+1)+": "+dataCH[i]);
                    }
                    sc.nextLine();
                    String dataTL = "";
                    for (int i=1; i<=3;i++){
                        System.out.println("Dap an cau hoi "+i);
                        dataTL += (sc.nextLine()+"$");
                    }
                    out.writeUTF(dataTL);
                    out.flush();
                    
                    //nhan ket qua
                    System.out.println(in.readUTF());
                }
                else if (check==2) {
                    out.writeInt(check);
                    out.flush();
                    
                }
            } while (check != 2);
        } catch (Exception e) {
        }
    }
}
