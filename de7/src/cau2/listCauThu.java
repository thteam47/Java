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
public class listCauThu {
    List<cauThu> list = new ArrayList<>();
    public List<cauThu> importList(){
        list.add(new cauThu("123", "Phuong", 1997, "Tien dao", 30));
        list.add(new cauThu("1234", "Hung", 1997, "Tien ve", 30));
        list.add(new cauThu("1243", "Toan", 1997, "Tien dao", 30));
        list.add(new cauThu("1323", "Cong", 1997, "Hau ve", 30));
        list.add(new cauThu("1253", "Van", 1997, "Thu mon", 30));
        return list;
    }
}
