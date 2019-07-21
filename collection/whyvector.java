import java.util.HashMap;;
//import  java.java.util.*;
import java.util.Scanner;
public class whyvector{
   Scanner Takeinput;
   String Name,age;
   HashMap <String,String> ha;
      whyvector(){
        ha = new HashMap<>();
       Takeinput= new Scanner(System.in);
        // System.out.printf("Enter your Name");
         //Takeinput.readLine();
         String Name,age;
         System.out.printf("Enter your Name... \t");
         Name = Takeinput.nextLine();
         System.out.printf("\n");
         System.out.printf("Enter your Age");
         age = Takeinput.nextLine();
         this.Name = Name;
         this.age  = age;
         Integer a = Integer.valueOf(age);
         if(a < 18 )
          {
              System.out.println("your not able to vote");

          }
         else{
             ha.put("Name", Name);
             ha.put("Age",age);
             System.out.println(ha);

         }
      }
  public static void main(String... args)
    {
        new whyvector();







   }
}
// class one implements Runnable{
//   public void show(){
//
//   }
//   @Override
//   public void run(){
//
//   }
// }
// class two implements Runnable {
//   int area()
//    {
//
//    }
//   @Override
//   public void run(){
//
//   }
// }
