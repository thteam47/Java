/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_thi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class listPhong {
    List<phongTro> list = new ArrayList<>();
    public List<phongTro> importList() {        
        list.add(new phongTro(1, "Vip", "Ha Noi", "Trong"));
        list.add(new phongTro(2, "Thuong", "Ha Noi", "Khong"));
        list.add(new phongTro(3, "Vip", "Ha Noi", "Khong"));
        list.add(new phongTro(4, "Thuong", "Ha Noi", "Trong"));
        list.add(new phongTro(5, "Vip", "Ha Noi", "Khong"));
        list.add(new phongTro(6, "Cao Cap", "Ha Noi", "Trong"));
        list.add(new phongTro(7, "Cao cap", "Ha Noi", "Khong"));
        list.add(new phongTro(8, "Vip", "Ha Noi", "Trong"));
        list.add(new phongTro(9, "Thuong", "Ha Noi", "Khong"));
        
        return list;
    }
}
