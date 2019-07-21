import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;


public class server
{   ArrayList AL = new ArrayList();   
    ServerSocket ss;
    Socket s;
    DataInputStream din;
    DataOutputStream dout;
       public server(){
           try {
                ss = new ServerSocket(10);
                // System.out.println(ss);
                while (true) {
                 s = ss.accept();
                 System.out.print("Conneceted" + s+"\n");   
                 AL.add(s);
                 Runnable r = new MyThread(s,AL);
                 Thread T = new Thread(r);
                 T.start();
                }
               
           } catch (Exception e) {
             e.printStackTrace(); 
           }
          
        }

    public static void main(String[] args) {
        new server();
    }
}
class MyThread implements Runnable{
    Socket s;
    ArrayList AL;
MyThread(Socket s,ArrayList AL){
   this.s = s;
   this.AL = AL;
}
   @Override   // have to overide interface Methad That is  public void run();
   public void run(){
    String s12;
    try {
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());
        do{
               
        s12 = din.readUTF();
        System.out.println(s12);
        if (!s12.equals("stop")) {
            TellEveryOne(s12);
        } else {
        
         dout.writeUTF(s12);
         dout.flush();
         AL.remove(s);   
        } }while(!s12.equals("stop"));

    } catch (Exception e) {
        e.printStackTrace();
    }


   
   }



public void TellEveryOne(String s12){
Iterator i =  AL.iterator();
 DataOutputStream dout;
while (i.hasNext()) {
    try {
        Socket sc = (Socket)i.next();
        dout = new DataOutputStream(sc.getOutputStream());
        dout.writeUTF(s12);
         
        dout.flush();

    } catch (Exception e) {
        
    }
    
}
}
}  // valueof()