/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class DocGhiFile {
     public static boolean GhiFile(ArrayList<NhanVien> dsnhanvien, String tenfile) {
        FileOutputStream fos = null;
        ObjectOutput obs = null;
        try {
            fos = new FileOutputStream(tenfile);
            obs = new ObjectOutputStream(fos);
            obs.writeObject(dsnhanvien);
            obs.close();
            fos.close();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static ArrayList<NhanVien> docfile(String tenfile) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(tenfile);
            ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            ois.close();
            fis.close();
            return (ArrayList<NhanVien>) data;
        } catch (Exception e) {
        }

        return null;
    }
}
