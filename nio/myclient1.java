import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class myclient1
   { 
    Socket s;
    DataInputStream din;
    DataOutputStream dout;

    
    public myclient1(){
try {
    s = new Socket("127.0.0.1",10);
    System.out.println(s);
    din = DataInputStream(s.getInputStream());
    dout  =DataOutputStream(s.getOutputStream());
    
} catch (Exception e) {
    
}
   }
       public static void main(String[] args) {
           
       }
       public void ChatServer() throws IOException 
       {
         String  game;           
           BufferedReader br  =  new BufferedReader(new InputStreamReade(System.in));
           do{  
           game = br.readLine();
           System.out.println(game);
           dout.writeUTF(game);
           dout.flush();
           System.out.println("server massegae" + din.readUTF());
           }while(!game.equals("stop"));
            }
   }