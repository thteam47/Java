/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_file;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Person implements Serializable {

    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String gioitinh;

    public Person(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public Person() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên :");
        hoten = sc.nextLine();
        System.out.println("Nhập ngày sinh  :");
        ngaysinh = sc.nextLine();
        System.out.println("Nhập địa chỉ  :");
        diachi = sc.nextLine();
        System.out.println("Nhập gioi tinh :");
        gioitinh = sc.nextLine();

    }

    public void xuat() {
        System.out.printf("%-30s %-20s %-20s %-10s ", hoten, ngaysinh, diachi, gioitinh);
    }
}
