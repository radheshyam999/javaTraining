import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class myserver1
{ ServerSocket ss;
   Socket s;
    DataInputStream din;
    DataOutputStream dout;

   public myserver1(){
     try {
       
    
 ss = new ServerSocket(10);
    s=ss.accept();//
    System.out.println(s);
    //s = Socket("127.0.0.1");
     din = new DataInputStream(s.getInputStream());
     dout  = new  DataOutputStream(s.getOutputStream());
     chatServer();
    } catch (Exception e) {
      e.printStackTrace();
    }
   }
    public static void main(String... args) {
        new myserver1();
    }
    public void chatServer() throws IOException
   { 
      BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
         String str,s1; 
         
         System.out.println(str);
         do{
            str  =din.readUTF();
            s1 = br.readLine();

            dout.writeUTF(str);
            dout.flush();
         } while(!str.equals("stop"));
        
       }


}