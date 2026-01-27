//client
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


class Main{
    static void main(String[] args)throws Exception {
        DatagramSocket datagramSocket=new DatagramSocket(5000);
        byte[] buff=new byte[1024];
        DatagramPacket datagramPacket=new DatagramPacket(buff,1024);
        datagramSocket.receive(datagramPacket);

        String s=new String(datagramPacket.getData(),0,datagramPacket.getLength());
        System.out.println(s);
        datagramSocket.close();
    }
}


//server
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


class s{
    static void main(String[] args)throws Exception {
        DatagramSocket ds=new DatagramSocket();
        String msg="hi da";
        InetAddress ip=InetAddress.getByName("localhost");
        DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),ip,5000);
        ds.send(dp);
        ds.close();
    }
}
