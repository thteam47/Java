/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class listSV {
    List<sinhVien> list = new ArrayList<>();
    public List<sinhVien> importList(){
        list.add(new sinhVien("Tai", "10", "at150555", "Hai Duong"));
        list.add(new sinhVien("Tung", "11", "at150255", "Hai Duong"));
        list.add(new sinhVien("Tu", "13", "at157555", "Hai Hau"));
        list.add(new sinhVien("Duc", "16", "at180555", "Hai Duong"));
        list.add(new sinhVien("Son", "18", "at158555", "Hai SOn"));
        list.add(new sinhVien("Cong", "17", "at1505565", "Hai Duong"));
        
        return list;
    }
}
