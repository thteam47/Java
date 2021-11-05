/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_tap_tin_ke_thua;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Bai_1_tap_tin_ke_thua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<student> listSV = new ArrayList<>();
        processStudent ps = new processStudent();
        ps.create(listSV);
        if (ps.ghiFile(listSV, "sinhvien.dat")==true) {
            System.out.println("Ghi thanh cong");
        } else {
            System.out.println("Ghi that bai");
        }
        List<student> listSV1 = ps.docFile("sinhvien.dat");
        System.out.printf("%-20s%-10s","Ho Ten","Lop");
        for (student st:listSV1){
            st.xuat();
        }
    }

}
