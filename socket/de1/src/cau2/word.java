/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author Admin
 */
public class word {
    String en;
    String vn;
    String dich;

    public word() {
    }

    public word(String en, String vn, String dich) {
        this.en = en;
        this.vn = vn;
        this.dich = dich;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getDich() {
        return dich;
    }

    public void setDich(String dich) {
        this.dich = dich;
    }
    
}
