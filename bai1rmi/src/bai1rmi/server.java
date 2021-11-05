
package bai1rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface server extends Remote {

    public List<sinhVien>  listSV() throws RemoteException; // láy danh sách sinh viên
    public List<sinhVien>  listSVHB() throws RemoteException; // láy danh sách sinh viên có học bổng
    public sinhVien checkSV(String maSv) throws RemoteException; // kiểm tra có sinh viên hay không, có trả về sinh viên đó, không có trả về null
    public String updateSV( String maSv, float diem) throws RemoteException; // cập nhật điểm cho sinh viên
    public int checkDiem(sinhVien sv) throws RemoteException; //kiểm tra sinh viên đã có điểm hay chưa, có trả về 1, chưa có trả về 0
    public String  addSv( sinhVien sv) throws RemoteException; // thêm sinh viên khi không tìm thấy sinh viên
}
