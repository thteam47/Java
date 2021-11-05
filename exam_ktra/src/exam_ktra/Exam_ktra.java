/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_ktra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exam_ktra {
    
     public static void nhapListnha(){
            Scanner scanner = new Scanner(System.in);
    int check;

        ArrayList<nha> listNha = new ArrayList<nha>();
        int i=1;
        
        do{
            System.out.println("Nhap thong tin nha "+ (i++));
            nha nha1 = new nha();
            nha1.nhap();
             nha1.nhapnha();
              nha1.tinhNha();
              nha1.xuat();
              listNha.add(nha1);
              System.out.print("Co nhap nua khong (1/0): ");
              check = scanner.nextInt();
              
        }while(check!=0);
         listNha.forEach((item)-> {
        item.xuat();
        });
    }
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        
    }
    
}
