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
public class listCauHoi {
    static List<cauHoi> list = new ArrayList<>();
    
    public static List<cauHoi> importList () {
        list.add(new cauHoi("Ban co nguoi yeu chua", "Co roi", "Chua co", "Khong co", "Gan co", "A"));
        list.add(new cauHoi("Ban co dang hen ho", "Co ", "Chua ", "Khong ", "Gan ", "A"));
        list.add(new cauHoi("Nay troi co mua khong", "Co ", "Chua ", "Khong ", "Gan ", "C"));
        list.add(new cauHoi("Hom nay ban the nao", "Vui", "Buon", "Binh thuong", "Tot", "A"));
        list.add(new cauHoi("Ban co nguoi yeu chua", "Co roi", "Chua co", "Khong co", "Gan co", "A"));
        list.add(new cauHoi("Ban co nguoi yeu chua", "Co roi", "Chua co", "Khong co", "Gan co", "A"));
        list.add(new cauHoi("Ban co nguoi yeu chua", "Co roi", "Chua co", "Khong co", "Gan co", "A"));
        list.add(new cauHoi("Ban co nguoi yeu chua", "Co roi", "Chua co", "Khong co", "Gan co", "A"));
        

        
        
        return list;
        
    }
}
