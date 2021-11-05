

public class NhanVien {
	private int maNV;
	private String ho;
	private String ten;
	private boolean phai;
	private int tuoi;
	private double luong;
	public NhanVien(int maNV,String ho,String ten,boolean phai,int tuoi,double luong) {
		super();
		this.maNV = maNV;
		this.ho = ho;
		this.ten = ten;
		this.phai = phai;
		this.tuoi = tuoi;
		this.luong = luong;
	}
	public NhanVien(int maNV) {
		this(maNV,"","",true,0,0);
	}
	public NhanVien() {
		this(0);
	}
	public int hashCode() {
		final int prime=31;
		int result=1;
		result = prime*result+maNV;
		return result;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		NhanVien other=(NhanVien) obj;
		if(maNV!=other.maNV)
			return false;
		return true;
	}
	public String toString() {
		return maNV+";"+ho+";"+ten+";"+phai+";"+tuoi+";"+luong;
	}
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public boolean isPhai() {
		return phai;
	}
	public void setPhai(boolean phai) {
		this.phai = phai;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
}

