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
public class SinhVienMatMa extends SinhVien{
      private String donvi;
      private String luong ;

    public SinhVienMatMa(String donvi, String luong, String maSv, String hoTen, Date ngaySinh, String gioiTinh, float diemTb) {
        super(maSv, hoTen, ngaySinh, gioiTinh, diemTb);
        this.donvi = donvi;
        this.luong = luong;
    }

    public SinhVienMatMa() {
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }
      @Override
      public void hienThi()
      {
          super.hienThi();
          System.out.printf(" %-10s %-10s\n",donvi, luong);
      }
}
