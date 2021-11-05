/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class mainStudent {

    static List<StudentAT> listStudentAT = new ArrayList<>();
    static List<StudentMM> listStudentMM = new ArrayList<>();
    static List<StudentCT> listStudentCT = new ArrayList<>();

    public static void main(String[] args) {
        int luachon = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap thong tin sinh vien");
            System.out.println("1. Sinh vien mat ma");
            System.out.println("2. Sinh vien an toan");
            System.out.println("3. Sinh vien CT");
            System.out.println("4. Dung");
            System.out.print("Lua chon: ");
            luachon = scanner.nextInt();
            switch (luachon) {
                case 1:
                    StudentMM st = new StudentMM();
                    st.nhapTT();
                    listStudentMM.add(st);
                    break;
                case 2:
                    StudentAT at = new StudentAT();
                    at.nhapTT();
                    listStudentAT.add(at);
                    break;
                case 3:
                    StudentCT stct = new StudentCT();
                    stct.nhapTT();
                    listStudentCT.add(stct);
                    break;

                default:
                    System.out.println("Nhap lai");
            }
        } while (luachon != 4);
        System.out.println("Danh sach sinh vien AT");
        float maxAT = 0, maxCT = 0, maxMM = 0;
        for (StudentAT studentAT : listStudentAT) {
            studentAT.hienThi();
            if (studentAT.getDiem()>maxAT)
                maxAT = studentAT.getDiem();
        }
        System.out.println("Danh sach sinh vien CT");
        for (StudentCT studentCT : listStudentCT) {
            studentCT.hienThi();
            if (studentCT.getDiem()>maxAT)
                maxAT = studentCT.getDiem();
        }
        System.out.println("Danh sach sinh vien MM");
        for (StudentMM studentMM : listStudentMM) {
            studentMM.hienThi();
            if (studentMM.getDiem()>maxAT)
                maxAT = studentMM.getDiem();
        }
        System.out.println("Danh sach sinh vien dat hoc bong");
        System.out.println("Sinh vien AT");
        for (StudentAT studentAT : listStudentAT) {
            if (studentAT.getDiem() == maxAT)
                studentAT.hienThi();
        }
        System.out.println("Sinh vien CT");
        for (StudentCT studentCT : listStudentCT) {
            if (studentCT.getDiem() == maxAT)
                studentCT.hienThi();
        }
        System.out.println("Sinh vien MM");
        for (StudentMM studentMM : listStudentMM) {
            if (studentMM.getDiem() == maxAT)
                studentMM.hienThi();
        }
    }
}
