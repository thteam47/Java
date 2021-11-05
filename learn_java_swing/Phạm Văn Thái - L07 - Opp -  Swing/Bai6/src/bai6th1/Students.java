/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6th1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Students implements Serializable{
    protected String hoten ;
    protected String tuoi;

    public Students(String hoten, String tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    public Students() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
    public void nhap()
            {
                Scanner sc =new Scanner(System.in);
                System.out.println("Nhap ho ten ");
                hoten=sc.nextLine();
                System.out.println("nhap tuoi ");
                tuoi=sc.nextLine();
            }
    public void xuat(){
        System.out.printf("%-30s %-10s\n",hoten,tuoi);
    }
}
