package act.it.oop.ndhieu.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hieunguyen
 */
public class UploadDataTable_EX2 extends javax.swing.JFrame {
    // Khoi tao mot doi tuong ArrayList moi (list) de luu tru cac doi tuong sinh vien doc duoc tu tep Sinhvien.dat (da hoc ArrayList)
    ArrayList<Student> list = new ArrayList<Student>();
    
    public UploadDataTable_EX2() {
        initComponents();
        readFile();
        uploadDataTable();
    }

    public void readFile() {
        /* Buoc dau tien, chung ta tao tep Sinhvien.dat gom danh sach cac sinh vien voi dinh dang luu tru nhu yeu cau (toi thieu 2 sinh vien)
           Vi du: Nguyen Duc Hieu$23/7/1987$Bac Giang$AT026688$nguyenduchieu247@gmailcom$8.6
                  Nguyen Hanh Linh$09/2/1995$Ha Dong$AT026868$nguyenhanhlinh@gmailcom$8.0
                  Nguyen Linh Khanh$02/2/2019$Ha Noi$AT028686$nguyenlinhkhanh@gmailcom$10.0
        */
        
        // Tiep theo, doc du lieu tu tep Sinhvien.dat theo dong
        
        try {
            FileReader fr = new FileReader("Sinhvien.dat");
            BufferedReader br = new BufferedReader(fr);
            // Doc dong dau tien, su dung phuong thuc readline()
            String data = br.readLine(); 
            while(data != null) // Khi nao doc het tat ca cac dong trong tep Sinhvien.dat thi thoat khoi vong lap while
            {
                // Tach du lieu dua tren ky tu $ bang cach su dung phuong thuc split("\\$") roi gan cho mot mang arr chua cac doi tuong String
                String[] arr = data.split("\\$");
                // Khoi tao mot doi tuong Student moi de lay du lieu trong mang arr
                Student sv = new Student();
                // Gan gia tri tung phan tu trong mang arr cho cac thuoc tinh cua sv theo thu tu luu tru trong tep Sinhvien.dat
                sv.setName(arr[0]);
                sv.setDateOfBirth(arr[1]);
                sv.setHometown(arr[2]);
                sv.setId(arr[3]);
                sv.setEmail(arr[4]);
                sv.setGpa(Float.parseFloat(arr[5])); // Do thuoc tinh gpa kieu float nen chung ta phai ep kieu (phan tu arr[5] kieu String ep kieu ve float)
                // Them doi tuong sv nay vao list 
                list.add(sv);
                // Doc dong tiep theo trong tep Sinhvien.dat, neu dong tiep theo khong co du lieu thi thoat khoi vong lap while (do data=null)
                data = br.readLine(); 
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Luu y can phai goi phuong thuc nay trong constructor UploadDataTable_EX2()
    }
    
    public void uploadDataTable() {
        /* Sau do, ta thiet lap du lieu cho table bang cach su dung phuong thuc DefaultTableModel(Vector data, Vector columnNames)
           Cach su dung Vector tuong tu nhu cach su dung ArrayList
        */
        
        // Khoi tao tham so columnNames, chinh la ten cac cot trong bang
        Vector columnNames = new Vector();
        columnNames.add("Name");
        columnNames.add("Date of birth");
        columnNames.add("Hometown");
        columnNames.add("ID");
        columnNames.add("Email");
        columnNames.add("GPA");
        
        // Khoi tao tham so data, chinh la du lieu cac hang cua bang. Luu y can phai tuong ung voi thu tu cac cot trong bang 
        Vector data = new Vector();
        for(int i = 0; i < list.size(); i++)
        {
            Vector rowData = new Vector();
            rowData.add(list.get(i).getName());
            rowData.add(list.get(i).getDateOfBirth());
            rowData.add(list.get(i).getHometown());
            rowData.add(list.get(i).getId());
            rowData.add(list.get(i).getEmail());
            rowData.add(list.get(i).getGpa());
            data.add(rowData);
        }
        
        // Khoi tao bang
        TableModel dataModel = new DefaultTableModel(data, columnNames);
        table.setModel(dataModel);
        // Luu y can phai goi phuong thuc nay trong constructor UploadDataTable_EX2()
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadDataTable_EX2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

    // Các em nên đọc tham khảo code trước, tự viết lại và chạy thử từng đoạn code để hiểu logic chương trình