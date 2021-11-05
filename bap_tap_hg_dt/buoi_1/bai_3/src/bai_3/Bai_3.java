/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai_3 {

    /**
     * @param args the command line arguments
     */
    static int check_ki_tu(char x) {
        if (x >= 'a' && x <= 'z') {
            return 1;
        } else if (x >= 'A' && x <= 'Z') {
            return 2;
        } else if (x >= '0' && x <= '9') {
            return 3;
        } else if (x == ' ') {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        System.out.print("Nhap chuoi: ");
        chuoi = scanner.nextLine();        
        int chuHoa = 0,chuThuong=0, so = 0, db = 0, ktrang =0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (check_ki_tu(chuoi.charAt(i)) == 1) {
                chuThuong++;
            }
            else if (check_ki_tu(chuoi.charAt(i)) == 2) {
                chuHoa++;
            }else if (check_ki_tu(chuoi.charAt(i)) == 3) {
                so++;
            }else if (check_ki_tu(chuoi.charAt(i)) == 4) {
                ktrang++;
            }
            else {
                db++;
            }
        }
        System.out.printf("\nXau co %d chu hoa, %d chu thuong, %d chu so, %d khoang trang, %d ki tu dac biet\n", chuHoa,chuThuong, so, ktrang,db);
    }

}
