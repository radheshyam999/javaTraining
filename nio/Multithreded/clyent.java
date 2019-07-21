import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class  clyent
{  Socket s;
    DataInputStream din;
    DataOutputStream dout;

   public clyent(){
       try {
             s = new Socket("192.168.42.100",10);
             din = new DataInputStream(s.getInputStream());
             dout = new DataOutputStream(s.getOutputStream());  
             ChatWithPepole();
       } catch (Exception e) {
          e.printStackTrace(); 
       }

       
    }
    public void ChatWithPepole() throws IOException
       {
        my m = new my(din);
        Thread t1 = new Thread(m);
        t1.start();
       
        BufferedReader Read =new BufferedReader(new InputStreamReader(System.in));
        String Iam;
        do{
            Iam = Read.readLine();
            dout.writeUTF(Iam);
            dout.flush();
        }while (!Iam.equals("stop"));
    }
    public static void main(String[] args) {
       new clyent(); 
    }
}
class my implements Runnable{
    DataInputStream din;
   public my(DataInputStream din){
       this.din =din;


   }
 
  @Override
   public void run() {
      String sL="";
      do {
          try {
             sL = din.readUTF(); 
             System.out.println(sL);
          } catch (Exception e) {
              
          }
          
      } while (sL.equals("stop"));

   }
} 