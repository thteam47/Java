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
public class listHang {
    List<MatHang> list = new ArrayList<>();
    
    public List<MatHang> importList(){
        list.add(new MatHang("1213", "Dau an", 100000, 35));
        list.add(new MatHang("1243", "Nuoc nam", 200000, 12));
        list.add(new MatHang("1214", "Bot giat", 500000, 24));
        list.add(new MatHang("1215", "Coc", 400000, 25));
        list.add(new MatHang("1216", "Sua", 10000, 3144215));
        list.add(new MatHang("1217", "Ti vi", 10000440, 125125));
        list.add(new MatHang("1218", "May tinh", 10024000, 3245));
        list.add(new MatHang("1219", "Den", 1000, 45235235));
        list.add(new MatHang("1222", "Nguoi yeu", 4325235, 1));
        return list;
    }
}
