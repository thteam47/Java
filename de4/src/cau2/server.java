/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class server {
    static List<cauHoi> list = new ArrayList<>();
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(38);
            System.out.println("Server is running");
            Socket socket = server.accept();
            
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out= new DataOutputStream(socket.getOutputStream());
            int check=0;
            do {
                list = (new listCauHoi()).importList();
                check = in.readInt();
                if (check==1) {
                    String data="";
                    String []dataDapAn = new String[3];
                    Random rd = new Random();
                    int idCH;
                    for (cauHoi ch : list) {
                        System.out.println(ch.toString());;
                    }
                    for (int i=0;i<3;i++) {
                        
                        idCH = rd.nextInt(list.size());
                        data += (list.get(idCH).toString()+"$");
                        dataDapAn[i] = list.get(idCH).getDapAnDung();
                    }
                    
                    out.writeUTF(data);
                    out.flush();
                    
                    String dataNTL = in.readUTF();
                    String []dataTL = dataNTL.split("\\$");
                    int dem=0;
                    for (int i=0;i<3;i++){
                        if (dataDapAn[i].equalsIgnoreCase(dataTL[i])){
                            dem++;
                        }
                    }
                    if (dem>=2) {
                        out.writeUTF("Thi sinh do");
                        out.flush();
                    }
                    else {
                        out.writeUTF("Thi sinh truot");
                        out.flush();
                    }
                }
            } while (check!=2);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
