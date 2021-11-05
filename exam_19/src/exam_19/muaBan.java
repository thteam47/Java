/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_19;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class muaBan {
    int stt;
    String diaChi;
    String ngayGiaoDich;
    float dienTich;
    float donGia;
    float tinhTien;

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(int luaChon) {
        if (luaChon==2) this.donGia*=0.9f;
        else if (luaChon==3) this.donGia*= 1.5f;
    }

    public float getTinhTien() {
        return tinhTien;
    }

    public void setTinhTien() {
        this.tinhTien = this.donGia*this.dienTich;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dia chi: ");
        this.diaChi = scanner.nextLine();
        System.out.print("Ngay giao dich: ");
        this.ngayGiaoDich = scanner.nextLine();
        System.out.print("Don gia: ");
        this.donGia = Float.parseFloat(scanner.nextLine());
        System.out.print("Dien tich: ");
        this.dienTich = Float.parseFloat(scanner.nextLine());
    }
    public void xuat(){
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Ngay giao dich: "+ngayGiaoDich);
        System.out.println("Don gia: "+donGia);
        System.out.println("Dien tich: "+dienTich);
    }
}
