import java.util.Scanner;

class trycatch
{
    public static void main(String[] args) {
      trycatch r = new trycatch();
      r.tridct();
    }
    void tridct()
    { int x =4;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("pleas enter value to ");
             x= scan.nextInt();
            
            scan.close();
        } catch (Exception e) {
           System.out.println(e);
            System.out.println(x);
           System.exit(x);
        }
        finally{    /// finally block every time   excuite
            System.out.println(x);
            System.out.println("i am wporking");
        }
    }
}