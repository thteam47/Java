/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class tamGiac {
    private float a,b,c;

    public tamGiac() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a= scanner.nextFloat();
        System.out.print("Nhap b: ");
        b= scanner.nextFloat();
        System.out.print("Nhap c: ");
        c= scanner.nextFloat();
        
    }
    public float tinhChiVi(){
        return (a+b+c);
    }
    public double tinhDienTich(){
        float p= (a+b+c)/2;
        
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public void kiemTraTamGiac(){
        if ((a+b)>c && (a+c)>b && (b+c)>a) {
        System.out.printf("\nla tam giac");
        if (a==b||a==c||b==c) {
            if (a!=c||b!=c||a!=b) {
                if ((a*a+b*b)==c*c||(a*a+c*c)==b*b||(c*c+b*b)==a*a)
                    System.out.printf("\nla tam giac vuong can");
                else
                    System.out.printf("\nla tam giac can");
            } else
                System.out.printf("\nla tam giac deu");
        } else if ((a*a+b*b)==c*c||(a*a+c*c)==b*b||(c*c+b*b)==a*a)
            System.out.printf("\nla tam giac vuong");
        else
            System.out.printf("\nla tam giac thuong");
        
        System.out.printf("\nchu vi = %.2f, dien tinh = %.2f. \n",tinhChiVi(),tinhDienTich());
    } else
        System.out.printf("\nkhong la tam giac");
    }
    
    public void xuat(){
        System.out.println("Do dai 3 canh tam giac la: "+a +" "+ b+" "+ c);
        kiemTraTamGiac();
    }
    
}
