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
public class listWord {
    List<word> list = new ArrayList<>();
    public List<word> importList(){
        list.add(new word("i", "toi", "ban than"));
        list.add(new word("love", "yeu", "yeu thuong"));
        list.add(new word("you", "ban", "ban be"));
        list.add(new word("i", "toi", "ban than"));
        list.add(new word("i", "toi", "ban than"));
        list.add(new word("i", "toi", "ban than"));
        
        return list;
    }
}
