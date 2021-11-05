/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_10_buoi_3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class sinhVien {
    String soBaoDanh;
    String diaChi;
    float diemUuTien;
    String hoTen;
    String toHopMon;
    String khoi;

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getDiemUuTien() {
        return diemUuTien;
    }

    public void setDiemUuTien(float diemUuTien) {
        this.diemUuTien = diemUuTien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getToHopMon() {
        return toHopMon;
    }

    public void setToHopMon(String toHopMon) {
        this.toHopMon = toHopMon;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }
    public void nhap(){
        int check;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap so bao danh: ");
        soBaoDanh = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap diem uu tien: ");
        diemUuTien = scanner.nextFloat();
        System.out.println("Khoi thi: ");
        System.out.println("1. Khoi A");
        System.out.println("2. Khoi B");
        System.out.println("3. Khoi C");
        System.out.print("Lua chon: ");
        check = scanner.nextInt();
        if (check==1){
            setKhoi("A");
            setToHopMon("Toan, Ly, Hoa");
        }
        else if (check==2){
            setKhoi("B");
            setToHopMon("Toan, Hoa, Sinh");
        }
        else {
            setKhoi("C");
            setToHopMon("Van, Su, Dia");
        }

        
    }
    public void xuat(){
        System.out.printf("\n%-10s%-20s%-20s%-20.1f%-10s%-20s",soBaoDanh,hoTen,diaChi,diemUuTien,khoi,toHopMon);
    }
}
