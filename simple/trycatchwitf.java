import java.util.Scanner;

class trycatchwitf
   {
       public static void main(String[] args) {
           int jh;
           trycatchwitf rf = new trycatchwitf();
           jh = rf.lsdm();
           System.out.println(jh);
       } 

    int lsdm()
    
    {  int x =0;
        Scanner r = new Scanner(System.in);
        try {
           System.out.println("Pleas Enter number  "); 
             x = r.nextInt();
             r.close();
        } catch (Exception e) {
            System.out.println(x + 20);
            return x+20;
        
        }
        finally{
       return 50+x;
        }

    }

   }

   