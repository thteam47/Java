/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai3_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<NhanVien> nv = new ArrayList();
        int check = 1;
        do {
            System.out.println("Nhập thông tin nhân viên  .");
            NhanVien nv1 = new NhanVien();
            nv1.nhap();
            nv.add(nv1);
            System.out.println("Có muốn nhập nữa không (1/0)");
            check = new Scanner(System.in).nextInt();
        } while (check != 0);
        System.out.println("Thông tin nhân viên vừa nhập :");
        System.out.printf("%-30s %-20s %-20s %-10s %-20s %-10s %-10s %-10s %-10s\n","Hoten","Ngaysinh","Diachi","Gioitinh","PhongBan",
                "HesoLuong","Thamnien","Luongcoban","Thuclinh");
        for(NhanVien xNhanVien:nv)
            {
                xNhanVien.xuat();
            }
        System.out.println("========================");
        System.out.println("GHI FILE filenv.txt");
        boolean ghi = DocGhiFile.GhiFile((ArrayList<NhanVien>) nv, "D:\\filenv.txt");
        if (ghi == true) {
            System.out.println("ghi file thành công ");
        } else {
            System.out.println("ghi file lỗi ");
        }
        System.out.println("========================");
        System.out.println("THÔNG TIN ĐỌC TỪ FILE filenv.txt");
        ArrayList<NhanVien> doc = DocGhiFile.docfile("D:\\filenv.txt");
        System.out.printf("%-30s %-20s %-20s %-10s %-20s %-10s %-10s %-10s %-10s\n","Hoten","Ngaysinh","Diachi","Gioitinh","PhongBan",
                "HesoLuong","Thamnien","Luongcoban","Thuclinh");
        for (NhanVien x : doc) {
            x.xuat();
        }
        System.out.println("========================");
        System.out.println("GHI DS VỪA ĐỌC SANG FILE NV2.txt");
        boolean ghi2 = DocGhiFile.GhiFile((ArrayList<NhanVien>) doc, "D:\\NV2.txt");
        if (ghi == true) {
            System.out.println("ghi file thành công ");
        } else {
            System.out.println("ghi file lỗi ");
        }
    }
    
}
