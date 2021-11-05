package act.it.oop.ndhieu.ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author hieunguyen
 */

// Dinh nghia class Student theo yeu cau
public class Student {
    // Khai bao cac thanh vien du lieu cua lop Student
    private String name;
    private String dateOfBirth;
    private String hometown;
    private String id;
    private String email;
    private float gpa; // grade point average -> diem tong ket

    // Viet phuong thuc khoi tao mac dinh cho lop Student
    public Student() {
        
    }
    // Viet phuong thuc khoi tao co tham so cho lop Student
    public Student(String name, String dateOfBirth, String hometown, String id, String email, float gpa) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.hometown = hometown;
        this.id = id;
        this.email = email;
        this.gpa = gpa;
    }

    // Cac phuong thuc setter cua lop Student
    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getHometown() {
        return hometown;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public float getGpa() {
        return gpa;
    }
    
    // Viet phuong thuc hien thi thong tin cho lop Student
    public void displayInfo() {
        System.out.println("Ho va ten: " + name);
        System.out.println("Ngay sinh: " + dateOfBirth);
        System.out.println("Que quan: " + hometown);
        System.out.println("Ma sinh vien: " + id);
        System.out.println("Email: " + email);
        System.out.println("Diem tong ket: " + gpa + "\n");
    }
    
    @Override
    public String toString() {
        return (name + "\t\t" + dateOfBirth + "\t" + hometown + "\t" + id + "\t" + email + "\t" + gpa + "\n");
    }
}
