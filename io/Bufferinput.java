import java.io.BufferedInputStream;
import java.io.File;

public class Bufferinput
{
public static void main(String[] args) {
    Bufferinput acess = new Bufferinput();
    try{
    acess.ReadWritedata();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
void ReadWritedata() throws Exception
{    byte b[];
    File f = new File("abc.text");
    BufferedInputStream  bf = new BufferedInputStream(f);
     b = new byte[bf.available()];
     for (int i = 0; i <bf.available(); i++) {
       b[i] = bf.read();
       System.out.println(b[i]);

     }
 
}
}