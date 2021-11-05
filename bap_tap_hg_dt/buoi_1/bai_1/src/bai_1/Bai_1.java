/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_1 {

    /**
     * @param args the command line arguments Bài 1: Dùng hàm viết chương trình
     * nhập vào một ngày tháng năm. tìm ngày tháng năm kế tiếp
     */
    int check_nam(int nam) {
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    ;
    void bai122() {
    }

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        int ngay, thang, nam;
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay = scanner.nextInt();
        System.out.print("Nhap thang: ");
        thang = scanner.nextInt();
        System.out.print("Nhap nam: ");
        nam = scanner.nextInt();
        Bai_1 bai1 = new Bai_1();

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
                if (bai1.check_nam(nam) == 1) {
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
