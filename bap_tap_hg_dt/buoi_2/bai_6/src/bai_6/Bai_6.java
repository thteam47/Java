/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

/**
 *
 * @author Administrator
 */
public class Bai_6 {

    /**
     * @param args the command line arguments
     */
    public static daThuc tinhTong(daThuc dt1, daThuc dt2) {
        daThuc dt3 = new daThuc();
        int n = dt1.bacDathuc;
        int m = dt2.bacDathuc;
        
        int min=(n<m)?n:m;
        int max = (n>m)?n:m;
        dt3.heSo = new float[max+1];
        dt3.setBacDathuc(max);
        int i=dt3.bacDathuc;
        for (int k =0 ; k <= min; k++) {
            dt3.heSo[i--] = dt1.heSo[dt1.bacDathuc-k] + dt2.heSo[dt2.bacDathuc-k];
        }
        if (n > m) {
            for (int k = min + 1; k <= max; k++) {
                dt3.heSo[i--] = dt1.heSo[dt1.bacDathuc-k];
            }
        } else {
            for (int k = min + 1; k <= max; k++) {
                dt3.heSo[i--] = dt2.heSo[dt2.bacDathuc-k];
            }
        }
        return dt3;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        daThuc dt1 = new daThuc();
        daThuc dt2 = new daThuc();
        System.out.println("Nhap da thuc 1");
        dt1.nhap();
        dt1.xuat();
        System.out.println("\nNhap da thuc 2");
        dt2.nhap();
        dt2.xuat();
        System.out.println("\nCong 2 da thuc");
        tinhTong(dt1, dt2).xuat();
        
    }

}
