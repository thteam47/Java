/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class listNha {
    List<Nha> list = new ArrayList<>();
    public List<Nha> importList() {        
        list.add(new Nha(1,454,true));
        list.add(new Nha(2,45454,false));
        list.add(new Nha(3,443654,true));
        list.add(new Nha(4,4454,false));
        list.add(new Nha(5,44654,true));
        list.add(new Nha(6,44654,true));
        list.add(new Nha(7,4554,false));
   
        return list;
    }
}
