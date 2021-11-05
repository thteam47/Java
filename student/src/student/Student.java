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
public class Student {
    String hoTen;
    int tuoi;
    float diem;
    String gioiTinh;
    String queQuan;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void nhapTT(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien");
        System.out.println("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap diem: ");
        this.diem = scanner.nextFloat();
        
        System.out.println("Nhap tuoi: ");
        this.tuoi = scanner.nextInt();
        System.out.println("Nhap gioi tinh: ");
        scanner.nextLine();
        this.gioiTinh = scanner.nextLine();
        System.out.println("Nhap que quan: ");
        this.queQuan = scanner.nextLine();
        
    }
    public void hienThi(){
        System.out.printf("%-20s%-10.1f%-10d%-10s%-20s",getHoTen(),getDiem(),getTuoi(),getGioiTinh(),getQueQuan());
    }
}
