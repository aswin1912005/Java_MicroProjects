//client
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

class Main{
    static void main(String[] args)throws IOException {
        Socket s=new Socket("localhost",5000);
        DataInputStream sc=new DataInputStream(s.getInputStream());
        String msg=sc.readUTF();
        System.out.println(msg);
    }
}


//server
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class s{
    static void main(String[] args)throws IOException {
        ServerSocket ss=new ServerSocket(5000);
        Socket socket=ss.accept();
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("Aswin MCA");
        dos.flush();
        dos.close();
    }
}
