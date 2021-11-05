/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class daThuc {
    public int bacDathuc;
    public float []heSo;

    public daThuc() {
    }

    public daThuc(int bacDathuc, float[] heSo) {
        this.bacDathuc = bacDathuc;
        this.heSo = heSo;
    }

    public int getBacDathuc() {
        return bacDathuc;
    }

    public void setBacDathuc(int bacDathuc) {
        this.bacDathuc = bacDathuc;
    }

    public float[] getHeSo() {
        return heSo;
    }

    public void setHeSo(float[] heSo) {
        this.heSo = heSo;
    }

    
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so bac cua da thuc: ");
        bacDathuc = scanner.nextInt();
        heSo = new float[bacDathuc+1];
        System.out.println("Nhap cac he so cua da thuc: ");
        for (int i=0; i<=bacDathuc;i++){
            heSo[i] = scanner.nextFloat();           
        }
    }
    public void xuat(){
        for (int i=0;i<=bacDathuc;i++){
            if (i==bacDathuc){
                System.out.print( heSo[bacDathuc]);
            }else if(i==(bacDathuc-1)){
                System.out.print(heSo[bacDathuc-1] + "x"+" + ");
            }else {
                System.out.print(heSo[i] + "x^"+ (bacDathuc-i)+ " + ");
            }
        }
    }
}
