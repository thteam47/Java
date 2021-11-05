/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class date {

    private int ngay, thang, nam;

    public date() {
    }

    public date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    int check_nam(int nam) {
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay = scanner.nextInt();
        System.out.print("Nhap thang: ");
        thang = scanner.nextInt();
        System.out.print("Nhap nam: ");
        nam = scanner.nextInt();
    }

    public void xuat() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngayHienTai = Integer.toString(ngay) + "/" + Integer.toString(thang) + "/" + Integer.toString(nam);
        Date date = dateFormat.parse(ngayHienTai);
        System.out.println("Ngay thang nam hien tai la: " + dateFormat.format(date));
    }

    public void ngayKeTiep() throws ParseException {
        int x=0;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                x = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                x = 30;
                break;
            case 2: {
                if (check_nam(nam) == 1) {
                    x = 29;
                } else {
                    x = 28;
                }
            }
            break;
        }
        if (ngay == x) {
            if (thang == 12) {
                ngay = 1;
                thang = 1;
                nam++;
            } else {
                ngay = 1;;
                thang++;
            }
        } else {
            ngay++;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngayKeTiep = Integer.toString(ngay) + "/"+ Integer.toString(thang) + "/"+Integer.toString(nam);
        Date date = dateFormat.parse(ngayKeTiep);
        System.out.println("Ngay thang nam ke tiep la: "+ dateFormat.format(date));
    }
}
