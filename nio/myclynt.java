import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

 class myclynt
    { DataInputStream di;
        DataOutputStream dout;

        Socket s;
        ServerSocket ss;
      public myclynt()
        {  try {
            
        
            s =new Socket("localhost",10);
            

           // s = ss.accept();
           System.out.println(s);
            //System.out.println(s);

           di = new DataInputStream(s.getInputStream());
           dout  = new  DataOutputStream(s.getOutputStream());
           chatServer();
           } catch (Exception e) {
           e.printStackTrace();
        }    
        }
    public static void main(String... args) {
       try {
           new myclynt();
       } catch (Exception e) {
          e.printStackTrace();
       } 
    }
    public void chatServer() throws IOException
    {   String  s2;
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        do{
        s2 = reader.readLine();
        dout.writeUTF(s2);
        dout.flush();
        } while(!s2.equals("stop"));
    }
    
    } 