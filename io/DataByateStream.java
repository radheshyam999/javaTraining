import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataByateStream 
{
    public static void main(String... args) throws Exception
         {   FileOutputStream Fin = new FileOutputStream("game.text",true);
             DataOutputStream dout = new DataOutputStream(Fin);
             DataInputStream din = new DataInputStream(System.in);
             String s =" ";
             while (!s.equals("stop"))
              {
                s=din.readLine(); 
                System.out.println(s);
                dout.writeUTF(s);  
               // dout.writeBytes(s);
               
                dout.flush();
             }
          din.close();
          dout.close();
        
        }
}