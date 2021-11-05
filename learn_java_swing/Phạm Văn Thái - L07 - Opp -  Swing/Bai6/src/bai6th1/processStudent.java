/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6th1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class processStudent extends Students{
    public void creatlist(ArrayList<Students>l )
            {int check =0;
                do {    Students ts =new  Students();
                ts.nhap();
                l.add(ts);
                    System.out.println("co nhap nua khong 0/1");
                    check=new Scanner(System.in).nextInt();
                } while (check!=0);
            }
     public static boolean GhiFile(ArrayList<Students> dsst, String tenfile) {
        FileOutputStream fos = null;
        ObjectOutput obs = null;
        try {
            fos = new FileOutputStream(tenfile);
            obs = new ObjectOutputStream(fos);
            obs.writeObject(dsst);
            obs.close();
            fos.close();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static ArrayList<Students> docfile(String tenfile) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(tenfile);
            ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            ois.close();
            fis.close();
            return (ArrayList<Students>) data;
        } catch (Exception e) {
        }

        return null;
    }
}
