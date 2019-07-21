import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class myserver {
ServerSocket ss;
Socket s;
DataInputStream din;
DataOutputStream dout ; 
 public  myserver(){
     try { 
        ss  = new ServerSocket(10);
        s = ss.accept();
        System.out.println(s);
        System.out.println("let conneceted ");
        din = new DataInputStream(s.getInputStream());
        dout  = new  DataOutputStream(s.getOutputStream());
       chatserver();

     } catch (Exception e) {
        e.printStackTrace();
     }

   }




    public static void main(String... args) {
        new myserver();
    }
    public void chatserver() throws IOException
    {
      String str;
      do{
         str = din.readUTF();
           System.out.println(str);
           dout.writeUTF(str);
           dout.flush();
          }while(!str.equals("stop"));

   }
}