package bai1rmi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class serverImp extends UnicastRemoteObject implements server {

    public serverImp() throws RemoteException {
        super();

    }
    static List<sinhVien> list = new ArrayList<>();

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(38);
        Naming.rebind("rmi://localhost:38/ok", new serverImp());
        System.out.println("running");
        try {
            String data = "";
            FileReader fr = new FileReader("database1.txt");
            BufferedReader buff = new BufferedReader(fr);
            while ((data = buff.readLine()) != null) {
                String[] data1 = data.split("\\$");
                float d;
                sinhVien pt;
                if (data1.length == 5) {
                    d = Float.parseFloat(data1[4]);
                    pt = new sinhVien(data1[0], data1[1], data1[2], data1[3], d);
                } else {
                    pt = new sinhVien(data1[0], data1[1], data1[2], data1[3], null);
                }

                list.add(pt);
            }
        } catch (Exception e) {
        }
    }

    @Override
    public List<sinhVien> listSV() throws RemoteException {
        return list;
    }

    @Override
    public List<sinhVien> listSVHB() throws RemoteException {
        List<sinhVien> listSS= new ArrayList<>();
        for (sinhVien sv : list) {
            if (sv.getDiem() != null && sv.getDiem() >= 3) {
                listSS.add(sv);
            }
        }

        return listSS;
    }

    @Override
    public sinhVien checkSV(String maSv) throws RemoteException {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSv().equalsIgnoreCase(maSv)) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public int checkDiem(sinhVien sv) throws RemoteException {
        if (sv.getDiem() != null) {
            return 1;
        } else {
            return 0;
        }
    }

    

    @Override
    public String updateSV( String maSv, float diem) throws RemoteException {
        for (sinhVien sv : list) {
            if (sv.getMaSv().equalsIgnoreCase(maSv)) {
                sv.setDiem(diem);
                break;
            }
            
        }
        return "Bo sung thanh cong";
    }

    @Override
    public String addSv(sinhVien sv) throws RemoteException {
        list.add(sv);
        return "Them thanh cong";
    }

}
