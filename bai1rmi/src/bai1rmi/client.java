package bai1rmi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class client {

    static List<sinhVien> listS = new ArrayList<>();

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        try {

            Scanner sc = new Scanner(System.in);
            int check;

            LocateRegistry.getRegistry(38);
            server test = (server) Naming.lookup("rmi://localhost:38/ok");

            do {
                System.out.println("1. Hien thi danh sach sinh vien");
                System.out.println("2. Hien thi danh sach sinh vien co hoc bong");
                System.out.println("3. Nhap diem");
                System.out.println("4. Thoat");
                check = sc.nextInt();
                if (check == 1) {
                    listS = test.listSV();
                    for (sinhVien sv : listS) {
                        System.out.println(sv.toString());
                    }
                } else if (check == 2) {
                   
                    listS = test.listSVHB();
                    if (listS != null) {
                        for (sinhVien sv : listS) {
                            System.out.println(sv.toString());
                        }
                    } else {
                        System.out.println("Khong co sinh vien co hoc bong");
                    }
                } else if (check == 3) {
                    System.out.println("Nhap ma sinh vien: ");
                    sc.nextLine();
                    String ma = sc.nextLine();
                    float diem;
                    sinhVien svv = new sinhVien();
                    if ((svv = test.checkSV(ma)) != null) {
                        if (test.checkDiem(svv) == 1) {
                            System.out.println("Nhap diem can update: ");
                            diem = sc.nextFloat();
                            System.out.println(test.updateSV( ma, diem));
                        } else {
                            System.out.println("Nhap diem bo dung: ");
                            diem = sc.nextFloat();
                            System.out.println(test.updateSV( ma, diem));
                        }

                    } else {
                        sinhVien sv = new sinhVien();

                        System.out.println("Khong co sinh vien " + ma);
                        sv.setMaSv(ma);
                        System.out.println("Hay nhap thong tin cho sinh vien " + ma);
                        System.out.println("Nhap ho ten sinh vien: ");
                        sv.setHoTen(sc.nextLine());
                        System.out.println("Nhap dia chi: ");
                        sv.setDiaChi(sc.nextLine());
                        System.out.println("Nhap gioi tinh: ");
                        sv.setGioiTinh(sc.nextLine());
                        System.out.println("Nhap diem: ");
                        sv.setDiem(sc.nextFloat());
                        System.out.println(test.addSv(sv));
                    }
                }

            } while (check != 4);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
