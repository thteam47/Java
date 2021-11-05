package act.it.oop.ndhieu.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author hieunguyen
 */
public class FormEnterInfo extends javax.swing.JFrame {
    // Buoc dau tien (muc a.) chung ta keo tha cac component trong the Palette vao frame co san de tao form nhap thong tin sinh vien
    // Khoi tao mot doi tuong Student moi de luu tru thong tin hop le nguoi dung nhap vao form
    Student sv = new Student();

    public FormEnterInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        lName = new javax.swing.JLabel();
        lDateOfBirth = new javax.swing.JLabel();
        lHometown = new javax.swing.JLabel();
        l_ID = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        l_GPA = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfDateOfBirth = new javax.swing.JTextField();
        tfHometown = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfGPA = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bReset = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter new students details");

        lName.setText("Name:");

        lDateOfBirth.setText("Date of birth:");

        lHometown.setText("Hometown:");

        l_ID.setText("ID:");

        lEmail.setText("Email:");

        l_GPA.setText("GPA:");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lHometown)
                    .addComponent(lName)
                    .addComponent(lDateOfBirth)
                    .addComponent(l_ID)
                    .addComponent(lEmail)
                    .addComponent(l_GPA))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfName)
                    .addComponent(tfDateOfBirth)
                    .addComponent(tfHometown)
                    .addComponent(tfID)
                    .addComponent(tfEmail)
                    .addComponent(tfGPA, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(bAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bReset))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lDateOfBirth, lEmail, lHometown, lName, l_GPA, l_ID});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lName)
                                                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addComponent(lDateOfBirth))
                                            .addComponent(tfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addComponent(lHometown))
                                    .addComponent(tfHometown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(l_ID))
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(lEmail))
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_GPA)
                    .addComponent(tfGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bSave)
                    .addComponent(bReset))
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lDateOfBirth, lEmail, lHometown, lName, l_GPA, l_ID});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    public boolean check(){
        /* Ham validate() de kiem tra xem thong tin nguoi dung nhap vao form co hop le hay khong
           Co 3 truong hop khong mong muon: 1. Con truong de trong nguoi dung chua nhap thong tin
                                            2. Nhap gia tri khong phai so thuc cho truong GPA
                                            3. Nhap ngay sinh khong hop le cho truong Date of Birth
         */

        /* Doan ma ben duoi dung de kiem tra xem nguoi dung co de trong truong nao khong (gia dinh ca 6 truong deu la truong bat buoc)
           Phuong thuc getText() de lay xau nguoi dung nhap vao truong tuong ung
         */
        if ((tfName.getText().equals("")) || (tfDateOfBirth.getText().equals("")) || (tfHometown.getText().equals(""))
                || (tfID.getText().equals("")) || (tfEmail.getText().equals("")) || (tfGPA.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Nhap thong tin cho truong de trong!", "Error", ERROR_MESSAGE);
            return false;
        } else {
        // Doan ma ben duoi dung de kiem tra xem nguoi dung co nhap so thuc cho truong GPA hay khong
            try {
                Float.parseFloat(tfGPA.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Nhap so thuc cho truong GPA!", "Error", ERROR_MESSAGE);
                return false;
            }
        }
        // Doan ma ben duoi dung de kiem tra xem ngay sinh nguoi dung nhap vao co hop le hay khong
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); // Dinh dang ngay sinh
        df.setLenient(false); // Phuong thuc setLenient(false) dung de tat che do nhay ngay va cho phep hien thi thong bao loi neu ngay sinh nguoi dung nhap vao khong hop le (tham khao Java Doc)
        try {
            df.parse(tfDateOfBirth.getText()); // Phuong thuc parse(String) dung de chuyen doi mot doi tuong String thanh mot doi tuong kieu Date
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ngay sinh khong hop le!", "Error", ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // Viet code xu ly su kien khi nguoi dung click vao nut "Add"
        
        // if duoi de lay thong tin hop le nguoi dung nhap vao form (ham check() tra ve true)
        if(check()) {
            sv.setName(tfName.getText());
            sv.setHometown(tfHometown.getText());
            sv.setId(tfID.getText());
            sv.setEmail(tfEmail.getText());
            sv.setGpa(Float.parseFloat(tfGPA.getText())); // Chuyen doi gia tri String (phuong thuc getText() tra ve) thanh mot gia tri kieu float
            sv.setDateOfBirth((tfDateOfBirth.getText()));
            // Hien thi thong tin hop le nguoi dung nhap vao form len console
            sv.displayInfo();
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        // Viet code xu ly su kien khi nguoi dung click vao nut ""Save"
        
        File file = new File("student.dat");
        if(check()) {
            try {
            file.createNewFile();
            FileWriter fw = new FileWriter("student.dat");
            PrintWriter pw = new PrintWriter(fw); // Su dung API PrintWriter de ghi doi tuong (BufferedWriter chu yeu duoc dung de ghi doi tuong String, mang ky tu hoac du lieu nguyen thuy)
            pw.print(sv); // Ghi doi tuong sv vao tep student.dat bang cach su dung phuong thuc print(Object)
            /* Note: Phai override phuong thuc toString() trong lop Student thanh thong tin cua doi tuong sv ma chung ta muon ghi vao file student.dat
                     Neu khong, mac dinh ten_lop_day_du@hashcode se duoc ghi vao file student.dat
            */
            pw.close();
            JOptionPane.showMessageDialog(this, "Ghi vao tep student.dat thanh cong!", "Notification", INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else JOptionPane.showMessageDialog(this, "Ghi vao tep student.dat that bai!", "Notification", INFORMATION_MESSAGE);
        // Mo tep student.dat duoc luu trong thu muc chua project de kiem tra
    }//GEN-LAST:event_bSaveActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // Viet code xu ly su kien khi nguoi dung click vao nut ""Reset"
        
        // Su dung phuong thuc setText("") de dat tat ca cac truong thanh rong
        tfName.setText("");
        tfDateOfBirth.setText("");
        tfHometown.setText("");
        tfID.setText("");
        tfEmail.setText("");
        tfGPA.setText("");
    }//GEN-LAST:event_bResetActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEnterInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSave;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel lDateOfBirth;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lHometown;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel l_GPA;
    private javax.swing.JLabel l_ID;
    private javax.swing.JTextField tfDateOfBirth;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfGPA;
    private javax.swing.JTextField tfHometown;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
    
    // Các em nên đọc tham khảo code trước, tự viết lại và chạy thử từng đoạn code để hiểu logic chương trình
