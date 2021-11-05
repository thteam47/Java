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
public class listSV {
    List<sinhVien> list = new ArrayList<>();
    public List<sinhVien> importList() {        
        list.add(new sinhVien("AT150551", "Pham Van Thai", "AT15E", "ANTT", "15"));
        list.add(new sinhVien("AT150554", "Pham Van Tai", "AT15A", "CNTT", "15"));
        list.add(new sinhVien("AT150552", "Pham Van Cong", "AT15F", "CNTT", "15"));
        list.add(new sinhVien("AT150558", "Pham Van Hoc", "AT15E", "ANTT", "15"));
        list.add(new sinhVien("AT150555", "Pham Van Ha", "AT15E", "CNTT", "15"));
        list.add(new sinhVien("AT150575", "Pham Van Dung", "AT15E", "ANTT", "15"));
        list.add(new sinhVien("AT150593", "Pham Van Chien", "AT15E", "DTVT", "15"));
        list.add(new sinhVien("AT150524", "Pham Van Van", "AT15E", "CNTT", "15"));
        list.add(new sinhVien("AT150534", "Pham Van Tri", "AT15E", "ANTT", "15"));
        return list;
    }
}
