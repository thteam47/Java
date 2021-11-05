/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6th1;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Bai6Th1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Students>ds=new ArrayList<>();
        processStudent pr=new processStudent();
        pr.creatlist(ds);
        boolean ghi = processStudent.GhiFile((ArrayList<Students>) ds, "filehs.txt");
        if (ghi == true) {
            System.out.println("ghi file thành công ");
        } else {
            System.out.println("ghi file lỗi ");
        }
        System.out.println("========================");
        System.out.println("THÔNG TIN ĐỌC TỪ FILE filekh.txt");
        ArrayList<Students> doc = processStudent.docfile("filehs.txt");
        System.out.printf("%-30s %-10s\n", "Ho Ten", "Tuoi");
        for (Students x : doc) {
            x.xuat();
        }
    }
    
    
}
