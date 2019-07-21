import java.io.FileReader;
import java.io.IOException;

class ReadFile

    {
      public static void main(String[] args) throws IOException
       {
         FileReader r = new  FileReader("CreateFile.java");  // creating  new instance for for file readr
       int x=  r.read();
       while(x != -1){    // it will run while  x  xwould not equal to -1
         x=  r.read(); // reaing data here 
           System.out.print((char) x);
       }
         r.close();
      }   

    }