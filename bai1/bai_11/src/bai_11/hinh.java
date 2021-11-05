/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_11;

/**
 *
 * @author Administrator
 */
public class hinh {
    float chieuDai;
    float chieuRong;
    float chuVi;
    float dienTich;
    
    public void showChuVi (){
        System.out.println("Chu vi la: "+ chuVi );
        
    }
    public void showDienTich (){
        System.out.println("Dien tich la: "+ dienTich );
        
    }
    public void tinhChuVi(){
        this.chuVi = (chieuDai+chieuRong)*2;
    }
    public void tinhDienTich(){
        dienTich = chieuDai*chieuRong;
    }
    public void show(){
        
        for(int i=0; i<Math.round(chieuRong);i++){
            for (int j=0; j<Math.round(chieuDai);j++){ 
                System.out.print("*" +"  ");
                
            }
            System.out.println("");
        }
    }
}
