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
public class cauHoi {
    String tenCauhoi;
    String dapAnA;
    String dapAnB;
    String dapAnC;
    String dapAnD;
    String dapAnDung;

    public cauHoi() {
    }

    public cauHoi(String tenCauhoi, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnDung) {
        this.tenCauhoi = tenCauhoi;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnDung = dapAnDung;
    }

    public String getTenCauhoi() {
        return tenCauhoi;
    }

    public void setTenCauhoi(String tenCauhoi) {
        this.tenCauhoi = tenCauhoi;
    }

    public String getDapAnA() {
        return dapAnA;
    }

    public void setDapAnA(String dapAnA) {
        this.dapAnA = dapAnA;
    }

    public String getDapAnB() {
        return dapAnB;
    }

    public void setDapAnB(String dapAnB) {
        this.dapAnB = dapAnB;
    }

    public String getDapAnC() {
        return dapAnC;
    }

    public void setDapAnC(String dapAnC) {
        this.dapAnC = dapAnC;
    }

    public String getDapAnD() {
        return dapAnD;
    }

    public void setDapAnD(String dapAnD) {
        this.dapAnD = dapAnD;
    }

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    @Override
    public String toString() {
        return tenCauhoi +"\nA. "+dapAnA+"\nB. "+dapAnB+"\nC. "+dapAnC+"\nD. "+dapAnD;
    }

    
    
    
}
