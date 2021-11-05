
package bai_12;

import java.util.ArrayList;
import java.util.Scanner;
public class Bai_12 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
                int m=1;

        // TODO code application logic here
        ArrayList<nhanVien> listNhanVien = new ArrayList<>();
        int check=1;
        int i=1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap thong tin nhan vien "+ (i++));
            nhanVien nv = new nhanVien();
        nv.nhap();
        nv.nhap1();
        
        listNhanVien.add(nv);
              System.out.print("Co nhap nua khong (1/0): ");
              check = scanner.nextInt();
              
        }while(check!=0);
        listNhanVien.forEach((item)->{
            item.xuat();
            item.xuat1();
        });
        ArrayList<giaoVien> listGiaoVien = new ArrayList<>();
        check=1;
        i=1;
        do{
            System.out.println("");
            System.out.println("Nhap thong tin giao vien "+ (i++));
            giaoVien gv = new giaoVien();
            gv.nhap();
            gv.nhap2();
        
        listGiaoVien.add(gv);
              System.out.print("Co nhap nua khong (1/0): ");
              check = scanner.nextInt();
              
        }while(check!=0);
        listGiaoVien.forEach((item)->{
            item.xuat();
            item.xuat2();
        });
    }
    
}
