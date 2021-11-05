/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith1;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class SinhVienHTTT extends SinhVien{
    private String hocPhi ;

    public SinhVienHTTT(String hocPhi, String maSv, String hoTen, Date ngaySinh, String gioiTinh, float diemTb) {
        super(maSv, hoTen, ngaySinh, gioiTinh, diemTb);
        this.hocPhi = hocPhi;
    }

    public SinhVienHTTT() {
    }

    public String getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(String hocPhi) {
        this.hocPhi = hocPhi;
    }
    
    @Override
    public void  hienThi()
    {
        super.hienThi(); 
        System.out.printf(" %-10s\n",hocPhi);
    }
            
}
