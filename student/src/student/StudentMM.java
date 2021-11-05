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
public class StudentMM extends Student {

    String chuyenKhoa;

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    public void setChuyenKhoa(String chuyenKhoa) {
        this.chuyenKhoa = chuyenKhoa;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuyen khoa: ");
        this.chuyenKhoa = scanner.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("%-20s\n", getChuyenKhoa());
    }
}
