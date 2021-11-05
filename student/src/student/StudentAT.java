/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentAT extends Student{
    String chuyenNganh;

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuyen nganh: ");
        this.chuyenNganh = scanner.nextLine();
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("%-20s\n",getChuyenNganh());
    }
}
