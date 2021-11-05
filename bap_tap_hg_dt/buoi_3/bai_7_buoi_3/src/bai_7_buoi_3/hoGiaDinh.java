/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7_buoi_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class hoGiaDinh {
     int soThanhVien;
    String soNha;
     ArrayList<person> listPerson = new ArrayList<>();

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public ArrayList<person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(ArrayList<person> listPerson) {
        this.listPerson = listPerson;
    }
    
    public void nhapHoGiaDinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("So thanh vien: " );
        soThanhVien = scanner.nextInt();
        System.out.print("Nhap so nha: ");
        scanner.nextLine();
        soNha = scanner.nextLine();
        
        for (int i=0; i<soThanhVien;i++ ){
            System.out.print("\nNhap thanh vien thu "+(i+1));
            person pr = new person();
            pr.nhap();
            listPerson.add(pr);         
        }
    }
    public void xuatHoGiaDinh(){
        System.out.println("So thanh vien: "+soThanhVien);
        System.out.println("So nha: "+soNha);
        for (person pr: listPerson){           
            pr.xuat();
        }
    }
}
