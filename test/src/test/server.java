/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Adminw
 */
public class server {
    static  boolean status = false;
    
    public static void setStatus() {
        status = true;
    }
    public static void main(String[] args) {
        setStatus();
    }
}
