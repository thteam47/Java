/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_5_ql_sach;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class listSach {
    List<sach> list = new ArrayList<>();
    public List<sach> importList() {        
        list.add(new sach("1414", "Tieng viet", "Kim dong", 100, 80));
        list.add(new sach("3254", "Toan", "Nhan dan", 1234, 125));
        list.add(new sach("235", "Tieng anh", "English", 36346, 235));
        list.add(new sach("436", "Cong dan", "Kim dong", 4374, 235));
        list.add(new sach("26", "Vat ly", "Kim dong", 23634, 235));
        list.add(new sach("236", "Hoa hoc", "Thai Anh", 5958, 25));
        list.add(new sach("26", "Sinh hoc", "Giao duc", 45858, 2525));       
        return list;
    }
}
