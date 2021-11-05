
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    ArrayList<NhanVien> ds=new ArrayList<>();
    DefaultTableModel model;
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        model=(DefaultTableModel) nvtable.getModel();
        nvtable.setAutoResizeMode(nvtable.AUTO_RESIZE_ALL_COLUMNS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gioitinh = new javax.swing.JComboBox<>();
        txtdiachi = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtphongban = new javax.swing.JTextField();
        txtthamnien = new javax.swing.JTextField();
        txthesl = new javax.swing.JTextField();
        txtluongcb = new javax.swing.JTextField();
        THEM = new javax.swing.JButton();
        NHAPLAI = new javax.swing.JButton();
        LuuFile = new javax.swing.JButton();
        DocFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nvtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhân Viên ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Họ Tên ");

        txthoten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ngay Sinh");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Địa Chỉ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Giới Tinh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Thâm Niên");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Hệ Số Lương");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Lương Cơ Bản");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Phòng Ban ");

        gioitinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam ", "Nu", "Khac" }));

        txtdiachi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtngaysinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtphongban.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtthamnien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtthamnien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthamnienActionPerformed(evt);
            }
        });

        txthesl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txthesl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtheslActionPerformed(evt);
            }
        });

        txtluongcb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtluongcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtluongcbActionPerformed(evt);
            }
        });

        THEM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        THEM.setText("THÊM");
        THEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THEMActionPerformed(evt);
            }
        });

        NHAPLAI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NHAPLAI.setText("NHẬP LẠI ");
        NHAPLAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NHAPLAIActionPerformed(evt);
            }
        });

        LuuFile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LuuFile.setText("LƯU FILE ");
        LuuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuFileActionPerformed(evt);
            }
        });

        DocFile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocFile.setText("ĐỌC FILE");
        DocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocFileActionPerformed(evt);
            }
        });

        nvtable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nvtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ho Ten", "Ngay Sinh", "Dia chi", "Gioi Tinh", "Phong Ban", "Tham Nien", "He So Luong", "Luong Co Ban"
            }
        ));
        jScrollPane1.setViewportView(nvtable);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("THOAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gioitinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtphongban, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtthamnien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthesl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtluongcb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NHAPLAI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(THEM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LuuFile, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DocFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel1)))
                        .addGap(0, 239, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(THEM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NHAPLAI)
                        .addGap(30, 30, 30)
                        .addComponent(LuuFile)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtphongban, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtthamnien, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthesl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtluongcb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(DocFile)
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtthamnienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthamnienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtthamnienActionPerformed

    private void txtheslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtheslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtheslActionPerformed

    private void txtluongcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtluongcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtluongcbActionPerformed

    private void THEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THEMActionPerformed
        NhanVien nv=new NhanVien();
        nv.setHoten(txthoten.getText()); 
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try {
            nv.setNgaysinh(sdf.parse(txtngaysinh.getText()));
        } catch (Exception e) {
        }
        nv.setDiachi(txtdiachi.getText());
        nv.setGioitinh(gioitinh.getSelectedItem().toString());
        nv.setPhongban(txtphongban.getText());
        nv.setThammien(Integer.parseInt(txtthamnien.getText()));
        nv.setHsluong(Integer.parseInt(txthesl.getText()));
        nv.setLuongcb(Float.parseFloat(txtluongcb.getText()));
        ds.add(nv);
        JOptionPane.showMessageDialog(rootPane, "Them thanh cong");
    }//GEN-LAST:event_THEMActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NHAPLAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NHAPLAIActionPerformed
                txthoten.setText("");
        txtngaysinh.setText("");
        txtdiachi.setText("");
        gioitinh.setSelectedItem("nam");
        txtphongban.setText("");
        txtthamnien.setText("");
        txthesl.setText("");
        txtluongcb.setText("");
JOptionPane.showMessageDialog(rootPane, "Moi Nhap Lai ");// TODO add your handling code here:
    }//GEN-LAST:event_NHAPLAIActionPerformed

    private void LuuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuFileActionPerformed
try {
            FileOutputStream fos=new FileOutputStream("nhanvien.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(ds);
            
            JOptionPane.showMessageDialog(rootPane, "Luu Thanh Cong Vao File nhanvien.dat");
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_LuuFileActionPerformed

    private void DocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocFileActionPerformed

        FileInputStream fis = null;
        ObjectInputStream ois = null;
                    Object dsObject = null;

        try {
            fis = new FileInputStream("nhanvien.dat");
            ois = new ObjectInputStream(fis);
            dsObject = ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
        }   
        model.setRowCount(0);
        for (NhanVien info : (ArrayList<NhanVien>) dsObject) {
            model.addRow(new Object[]{
   info.getHoten(), info.getNgaysinh(), info.getDiachi(), info.getGioitinh(),info.getPhongban(),info.getThammien(),info.getHsluong(),info.getLuongcb()
            });
        }// TODO add your handling code here:
    }//GEN-LAST:event_DocFileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DocFile;
    private javax.swing.JButton LuuFile;
    private javax.swing.JButton NHAPLAI;
    private javax.swing.JButton THEM;
    private javax.swing.JComboBox<String> gioitinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nvtable;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthesl;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtluongcb;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtphongban;
    private javax.swing.JTextField txtthamnien;
    // End of variables declaration//GEN-END:variables
}
