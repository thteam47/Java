/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_ktra;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class muaBan {
    String diaChi;
    String ngayGiaoDich;
    float donGia;
    float dienTich;
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

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
    
    public void sumTien(){
        this.tinhTien = this.dienTich*this.donGia;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dia chi: ");
        this.diaChi = scanner.nextLine();
        System.out.print("Ngay giao dich: ");
        this.ngayGiaoDich = scanner.nextLine();
        System.out.print("Don gia: ");
        this.donGia = scanner.nextFloat();
        System.out.print("Dien tich: ");
        this.dienTich = scanner.nextFloat();
    }
    public void xuat(){
        System.out.println("Tien: "+this.tinhTien);
    }
}
