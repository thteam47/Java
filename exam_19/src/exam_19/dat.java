/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_19;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class dat extends muaBan{
    int check=1;
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Loai dat: ");
        System.out.println("3. A");
        System.out.println("4. B");
        System.out.println("5. C");
        System.out.print("Lua chon: ");
        Scanner scanner = new Scanner(System.in);
        check= scanner.nextInt();
        if (check==3) setDonGia(3);
        setTinhTien();
    }
}
