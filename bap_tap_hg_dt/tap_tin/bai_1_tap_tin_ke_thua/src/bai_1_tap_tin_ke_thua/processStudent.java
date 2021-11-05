/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_tap_tin_ke_thua;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class processStudent {
    public void create(ArrayList<student> listSV){
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        int i = 0;
        do {
            System.out.print("Nhap thong tin sinh vien thu " + (++i) + "\n");
            student st = new student();
            st.nhap();
            listSV.add(st);
            System.out.print("Co muon nhap nua khong (1/0): ");
            check = scanner.nextInt();
        } while (check != 0);
        
    }
    public void xuatdl(ArrayList<student> listSV){
        for (student st:listSV)
        {
            st.xuat();
        }
    }
    //Ghi file
    public boolean ghiFile(ArrayList<student> dssv,String path)
    {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(dssv);
            fos.close();
            oos.close();
            return true;
        } catch (Exception e) {
        }
         return false;
    }
    public ArrayList<student> docFile(String path)
    {
        try {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Object data=ois.readObject();
            fis.close();
            ois.close(); 
            return (ArrayList<student>) data;
            
        } catch (Exception e) {
        }
        return null;
    }
}
