import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

class PrinstreamStartRedriction
{
    public static void main(String... args) throws Exception
       {
          FileOutputStream fin =  new FileOutputStream("ls.tex",true);
          PrintStream ps = new PrintStream(fin);
          var fout1 = new FileOutputStream("lsdm.tex",true);
          PrintStream ps1 = new PrintStream(fout1);
          PrintStream ps2 = System.out;
          System.setOut(ps);
          System.out.println("html");
          System.out.println("css");
          System.out.println("JavaScript");
          System.out.println("php");
          System.setErr(ps1);
          System.out.println("errrrrr    r");
          System.out.println("Radheshyam");
          System.out.println("lsdmthml");
          System.setOut(ps1);
          System.out.println(",sma 1545456546");
          System.out.println("s.s,mdmnm,snd");
          System.out.println("kidjlksjlk");
          System.out.println("lsdmtekm");
          System.setOut(ps2);
          System.out.println("slkmdkmdkljlk");


       }
}
