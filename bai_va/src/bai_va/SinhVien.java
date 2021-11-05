/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_va;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    public   String hoTen;
	 public   String masv;
	 public   float ktlt,ltcsdl,oop,hqtcsdl;
		public String getHoTen() {
			return hoTen;
		}
		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}
		public String getMasv() {
			return masv;
		}
		public void setMasv(String masv) {
			this.masv = masv;
		}
		public float getKtlt() {
			return ktlt;
		}
		public void setKtlt(float ktlt) {
			this.ktlt = ktlt;
		}
		public float getLtcsdl() {
			return ltcsdl;
		}
		public void setLtcsdl(float ltcsdl) {
			this.ltcsdl = ltcsdl;
		}
		public float getOop() {
			return oop;
		}
		public void setOop(float oop) {
			this.oop = oop;
		}
		public float getHqtcsdl() {
			return hqtcsdl;
		}
		public void setHqtcsdl(float hqtcsdl) {
			this.hqtcsdl = hqtcsdl;
		}
 public void nhap() {
	Scanner sc =new Scanner(System.in);
	System.out.println("nhap vao ten sinh vien");
	this.hoTen = sc.nextLine();
	System.out.println("nhap vao ma so sinh vien");
	this.masv = sc.nextLine();
	System.out.println("nhap vao diem mon ktlt ");
	this.ktlt = sc.nextFloat();
	System.out.println("nhap vao diem mon ltcsdl ");
	this.ltcsdl = sc.nextFloat();
	System.out.println("nhap vao diem mon hqtcsdl ");
	this.hqtcsdl = sc.nextFloat();
	System.out.println("nhap vao diem mon oop ");
	this.oop = sc.nextFloat();
	}
	public void xuat() {
		System.out.println("HoTen:  "+this.hoTen + "    "+"masosv:  "+ this.masv +"   "+"diem ktlt:  " +this.ktlt+"   "+
	"diem ltcsdl:   "+this.ltcsdl+"     "+"diem hqtcsdl:  "+this.hqtcsdl+"     "+"diem oop:  "+this.oop);
		
		
	}
}
