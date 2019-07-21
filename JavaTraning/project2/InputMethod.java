import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class InputMethod{
    public static void main(String[] args) throws IOException
     {
        InputMethod Acessr = new InputMethod();
        Acessr.BufferStreamReaders();  
    }

    void BufferStreamReaders() throws IOException {
     
       System.out.print("What is Your Name?..");
       String  Name = System.console().readLine();
       System.out.println(Name);
   }

}