/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_2_ql_sinh_vien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class listSV {
    List<sinhVien> list = new ArrayList<>();
    public List<sinhVien> importList() {        
        list.add(new sinhVien( "Pham Van Thai", "04/07/2000", "AT150551","Hai Duong"));
        list.add(new sinhVien( "Pham Van Tai", "05/07/2000", "AT150552","Nam Dinh"));
        list.add(new sinhVien( "Pham Van Comg", "14/07/2000", "AT150541","Hai Phong"));
        list.add(new sinhVien( "Pham Van Hung", "24/07/2000", "AT150521","Hai Duong"));
        list.add(new sinhVien( "Pham Van Chi", "06/07/2000", "AT150556","Hai Hung"));
        list.add(new sinhVien( "Pham Van Hieu", "07/07/2000", "AT150571","An Duong"));
        list.add(new sinhVien( "Pham Van Dung", "08/07/2000", "AT150501","Ha Noi"));
        list.add(new sinhVien( "Pham Van Duc", "09/07/2000", "AT150553","Hai Duong"));
        list.add(new sinhVien( "Pham Van Dat", "10/07/2000", "AT150556","Hai Duong"));
        list.add(new sinhVien( "Pham Van Tung", "11/07/2000", "AT150581","Hai Duong"));
        list.add(new sinhVien( "Pham Van Tuan", "12/07/2000", "AT150511","Hai Duong"));
        list.add(new sinhVien( "Pham Van Hai", "13/07/2000", "AT150558","Hai Duong"));
        
        return list;
    }
}
