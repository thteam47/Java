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
    List<hangHoa> list = new ArrayList<>();
    public List<hangHoa> importList() {
        list.add(new hangHoa("Sua", 3252, 234,"Con hang"));
        list.add(new hangHoa("Dau an", 32, 234,"Con hang"));
        list.add(new hangHoa("Banh", 3253,  0,"Het hang"));
        list.add(new hangHoa("Keo", 633, 23,"Con hang"));
        list.add(new hangHoa("Vai", 638, 35,"Con hang"));
        return list;
    }
 }
