/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2udp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dang Thu Thu H
 */
public class listNha {
    List<nha> list = new ArrayList<>();
    public List<nha> importList() {        
        list.add(new nha(1,454,true));
        list.add(new nha(2,45454,false));
        list.add(new nha(3,443654,true));
        list.add(new nha(4,4454,false));
        list.add(new nha(5,44654,true));
        list.add(new nha(6,44654,true));
        list.add(new nha(7,4554,false));
   
        return list;
    }
}
