
package bai_thi_2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class server {
    public static  int countUoc(int n){
        int dem=0;
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                dem++;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(38);
            System.out.println("Server is running");
            DatagramPacket packet;
            String data;
            byte []byteData;
            //nhan du lieu
            byteData = new byte[2048];
            packet = new DatagramPacket(byteData, byteData.length);
            server.receive(packet);
            data = new String(packet.getData(), 0, packet.getLength());
            //xu li du lieu
            int x = Integer.parseInt(data);
            int uoc = countUoc(x);
            //gui du lieu
            byteData = new byte[2048];
            byteData = ("So uoc la: " + uoc).getBytes();
            packet = new DatagramPacket(byteData,byteData.length, packet.getAddress(), packet.getPort());
            server.send(packet);
            //dong luong
            server.close();
        } catch (Exception e) {
        }
        
    }
}
