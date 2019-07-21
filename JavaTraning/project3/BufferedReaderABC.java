import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

class BufferedReaderABC {
  public static void main(String[] args) throws IOException
   {
    FileReader fred = new FileReader("ReadFile.java");
    BufferedReader r = new BufferedReader(fred);
    String z = "radheshyam";
    while (z != null) {
      z = r.readLine();
      System.out.println(z);
    }
    if (z.equals(null)) {
      r.close();
    }

  }
}