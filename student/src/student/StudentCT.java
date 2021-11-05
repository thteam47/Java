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
public class StudentCT extends Student{
    String monWeb;

    public String getMonWeb() {
        return monWeb;
    }

    public void setMonWeb(String monWeb) {
        this.monWeb = monWeb;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mon web: ");
        this.monWeb = scanner.nextLine();
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("%-20s\n",getMonWeb());
    }


}
