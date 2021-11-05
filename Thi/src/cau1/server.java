/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author Admin
 */
public class server {
    public static void main(String[] args) {
        try {
            String dataReceive = "Chỉ số điện tiêu thụ: 150";
            String []data = dataReceive.split(":");
            int soDien = Integer.parseInt(data[1].trim());
            float tien =0;
            if (soDien>=0 && soDien <=50){
                tien = soDien*1.7f;
            }
            else if (soDien>50 && soDien <=100){
                tien = soDien*2.0f;
            } else {
                tien = soDien*2.5f;
            }
            
        } catch (Exception e) {
        }
    }
}
