import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class UsingPrintStream
{
public static void main(String[] args)
   {
       UsingPrintStream Acess = new UsingPrintStream();
       try{
       Acess.WriteData();
       }
       catch(Exception e)
         {
              e.printStackTrace();
         }
   }
 void WriteData() throws Exception
    {   byte b[];
       FileOutputStream fout = new FileOutputStream("ls.tex");
        PrintStream p = new PrintStream(fout);
        FileInputStream fin = new FileInputStream("abc.text");
        DataInputStream din = new DataInputStream(fin);
        b = new byte[din.available()];
        for (int i = 0; i < din.available(); i++)
          {
            b[i] =  din.readByte();   
          }

         String s = new String(b);



    
    p.println(s);

    }
 
}