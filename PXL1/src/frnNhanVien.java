import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frnNhanVien extends JFrame implements ActionListener,MouseListener{
	private DanhSachNhanVien dao;
	private List<NhanVien> list;
	private JTable table;
	private JTextField txtMaNV,txtHo,txtTen,txtTuoi,txtLuong,txtTim;
	private JRadioButton radNu;
	private JButton btnThem,btnXoa,btnXoaTrang,btnLuu;
	private DefaultTableModel tableModel;
	private static final String FILENAME="dulieu.txt";
	public frnNhanVien(DanhSachNhanVien dao) {
		setTitle("^0^");
		setSize(700,450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		
		JPanel pnlNorth;
		add(pnlNorth= new JPanel(), BorderLayout.NORTH);
		JLabel lblTieuDe;
		pnlNorth.add(lblTieuDe= new JLabel("THONG TIN NHAN VIEN"));
		lblTieuDe.setFont(new Font("Arial", Font.BOLD, 20));
		lblTieuDe.setForeground(Color.blue);
		Box b= Box.createVerticalBox();
		Box b1,b2,b3,b4,b5;
		JLabel lblHo,lblMaNV,lblTuoi,lblLuong, lblPhai;
		b.add(b1 =Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b1.add(lblMaNV= new JLabel("Ma nhan vien: "));
		b1.add(txtMaNV= new JTextField());
		

		b.add(b2=Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b2.add(lblHo= new JLabel("Ho: "));
		b2.add(txtHo= new JTextField());

		b2.add(new JLabel("Ten nhan vien: "));
		b2.add(txtTen= new JTextField());
		

		b.add(b3=Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));

		b3.add(lblTuoi= new JLabel("Tuoi: "));
		b3.add(txtTuoi= new JTextField());

		b3.add(lblPhai= new JLabel("Phai: "));
		b3.add(radNu= new JRadioButton("Nu"));
		
		b.add(b4=Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		
		b4.add(lblLuong= new JLabel("Tien luong: "));
		b4.add(txtLuong= new JTextField());
		lblHo.setPreferredSize(lblMaNV.getPreferredSize());
		lblPhai.setPreferredSize(lblMaNV.getPreferredSize());

		lblLuong.setPreferredSize(lblMaNV.getPreferredSize());
		lblTuoi.setPreferredSize(lblMaNV.getPreferredSize());
		
		b.add(b5=Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		String [] headers="MaNV;Ho;Ten;Phai;Tuoi;Luong;".split(";");
		tableModel =new DefaultTableModel(headers,0);
		JScrollPane scroll= new JScrollPane();
		scroll.setViewportView(table = new JTable(tableModel));
		table.setRowHeight(25);
		table.setAutoCreateRowSorter(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		b5.add(scroll);
		add(b, BorderLayout.CENTER);
		JSplitPane split= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		add(split, BorderLayout.SOUTH);
		JPanel pnlLeft, pnlRight;
		split.add(pnlLeft= new JPanel());
		split.add(pnlRight= new JPanel());
		pnlLeft.add(new JLabel("Nhap ma so can tim: "));
		pnlLeft.add(txtTim= new JTextField(10));
		pnlLeft.add(new JButton("Tim"));		
		pnlRight.add(btnThem= new JButton("Them"));
		pnlRight.add(btnXoaTrang= new JButton("Xoa Trang"));
		pnlRight.add(btnXoa= new JButton("Xoa"));
		pnlRight.add(btnLuu=new JButton("Luu"));
		LoadDatabase();
		btnThem.addActionListener(this);
		btnXoa.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		btnLuu.addActionListener(this);
		table.addMouseListener(this);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o= e.getSource();
		if(o.equals(btnThem))
			themActions();
		if(o.equals(btnXoa))
			xoaActions();
		if(o.equals(btnXoaTrang))
			xoaTrangActions();	
		if(o.equals(btnLuu))
			luuActions(dao.getList());
	}
	private void xoaTrangActions() {
		txtMaNV.setText("");
		txtHo.setText("");
		txtTen.setText("");
		txtTuoi.setText("");
		txtTim.setText("");
		txtLuong.setText("");
		radNu.setSelected(false);
		txtMaNV.requestFocus();
		
	}
	private void themActions() {
		try {
			int maNV= Integer.parseInt(txtMaNV.getText());
			String ho= txtHo.getText();
			String ten= txtTen.getText();
			boolean phai= (radNu.isSelected()) ? true : false ;
			int tuoi = Integer.parseInt(txtTuoi.getText());
			double luong= Double.parseDouble(txtLuong.getText());
			NhanVien nv = new NhanVien(maNV, ho, ten, phai, tuoi, luong);
			if(dao.themNhanVien(nv)) {
				String[] row= {Integer.toString(maNV),ho,ten,Boolean.toString(phai),Integer.toString(tuoi),luong+""};
				tableModel.addRow(row);
				xoaTrangActions();
			}
			else {
				JOptionPane.showMessageDialog(null, "Trung ma nhan vien.");
				txtMaNV.selectAll();
				txtMaNV.requestFocus();
			}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Loi nhap du lieu.");
			return;
		}
	}
	private void xoaActions(){
		int row= table.getSelectedRow();
		if(row!=-1) {
			int maNV= Integer.parseInt((String)table.getModel().getValueAt(row, 0));
			int hoiNhac=JOptionPane.showConfirmDialog(this, "Chac chan xoa khong","Chu y",JOptionPane.YES_NO_OPTION);
			if(hoiNhac==JOptionPane.YES_OPTION) {
				if(dao.xoaNhanVien(maNV)) {
					tableModel.removeRow(row);
				}
			}
			
		}
	}
	void LoadDatabase() {
		BufferedReader br=null;
		dao=new DanhSachNhanVien();
		try {
			if(new File(FILENAME).exists()) {
				br=new BufferedReader (new FileReader(FILENAME));
				br.readLine();
			
			
				while(br.ready()){
					String line = br.readLine();
					if(line !=null&& !line.trim().equals("")) {
						String[]a= line.split(";");
						NhanVien nv= new NhanVien(Integer.parseInt(a[0]),a[1],a[2],Boolean.parseBoolean(a[3]), Integer.parseInt(a[4]),Double.parseDouble(a[5]));
						dao.themNhanVien(nv);
						tableModel.addRow(a);
					}
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	void luuActions(ArrayList<NhanVien> dsnv) {
		BufferedWriter bw;
		try{
			bw=new BufferedWriter(new FileWriter(FILENAME));
			bw.write("MaNV;Ho;Ten;Phai;Tuoi;TienLuong\n");
			for(NhanVien nv: dsnv) {
				bw.write(nv.toString()+"\n");
			}
			bw.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row= table.getSelectedRow();
		txtMaNV.setText(table.getValueAt(row, 0).toString());
		txtHo.setText(table.getValueAt(row, 1).toString());
		txtTen.setText(table.getValueAt(row, 2).toString());
		radNu.setSelected(false);
		if(table.getValueAt(row, 3).toString().equalsIgnoreCase("true"));
			radNu.setSelected(true);
		txtTuoi.setText(table.getValueAt(row, 4).toString());
		txtLuong.setText(table.getValueAt(row, 5).toString());
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

