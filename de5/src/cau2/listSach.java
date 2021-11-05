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
public class listSach {
    List<sach> list = new ArrayList<>();
    public List<sach> importList() {
        list.add(new sach("htc123", "Ngu van", "Giao duc", 100, 20));
        list.add(new sach("htc124", "Toan", "Kim dong", 200, 50));
        list.add(new sach("htc125", "Sinh hoc", "Giao duc", 100, 20));
        list.add(new sach("htc126", "Cong nghe", "Kim dong", 10, 2));
        list.add(new sach("htc127", "Cong dan", "Giao duc", 57, 9));
        list.add(new sach("htc128", "Vat li", "Co ban", 100, 20));
        list.add(new sach("htc129", "Hoa hoc", "Giao duc", 100, 20));
        list.add(new sach("htc113", "Ngu van", "Giao duc", 100, 20));
        list.add(new sach("htc163", "Ngu van", "Giao duc", 100, 20));
        list.add(new sach("htc193", "Ngu van", "Giao duc", 100, 20));
        list.add(new sach("htc133", "Ngu van", "Giao duc", 100, 20));
        return list;
    }
}
