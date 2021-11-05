/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class thiSinh implements Comparable<thiSinh>{
    private String maSv;
    private String hoTen;
    private float diemToan, diemLy, diemHoa;

    public thiSinh() {
    }

    public thiSinh(String maSv, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap ma sinh vien: ");
        maSv = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Diem Toan: ");
        diemToan = scanner.nextFloat();
        System.out.print("Diem Ly: ");
        diemLy = scanner.nextFloat();
        System.out.print("Diem Hoa: ");
        diemHoa = scanner.nextFloat();
    }

    public void xuat() {
        System.out.printf("\n%-15s%-20s%-10.1f%-10.1f%-10.1f%-10f", maSv, hoTen, diemToan, diemLy, diemHoa,tinhTongDiem());
    }
    public float tinhTongDiem(){
    return (diemHoa+diemLy+diemToan);
    }

    @Override
    public int compareTo(thiSinh other) {
        return this.hoTen.compareTo(other.hoTen);
    }
    
    
}
