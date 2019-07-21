import java.util.*;
import java.util.Scanner;
class IamString

{
   public static void main(String[] args) 
   {
     IamString r = new IamString();
     r.GetData();
   }
   int  GetAcess(int x)
   {
      System.out.println("What is Your Dream " +x);
      return x;
   }
   void GetData()
   {
    Scanner scan = new Scanner(System.in);
    int z = scan.nextInt();
    String k = "lsd";
    String l ="ksd";

    IamString s = new IamString();
    if (k.equals(l)) {
        System.out.println("i am true ");
    }
    else {
        System.out.println("i am false ");
    }
    System.out.println(scan); // here i am print the refernece variabele 
    s.GetAcess(z);
    
    

   }
   

}
