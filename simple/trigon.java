import java.util.*;
import java.io.*;
import java.util.Scanner;
public class trigon{
    /**
    *this programm all about trigonmetry function i trying to implement to  convertion
    * of radion to degree and radion degree also i need to find value of degree in this programe
    * =>take input
    * =>check that if it gretter than 360 or not
    *=>if it is greater than  take module value%360
    *
    *****/
    int radian;
    public static void main(String... args) {
         Scanner TakeInput = new Scanner(System.in);
          int option;
          trigon acess = new trigon();
          while(true){
                System.out.println("in which you want to change radian/degree");
                System.out.println("1 \t radian");
                System.out.println("2 \t degree");
                System.out.println("3 \t Exit");
                option = TakeInput.nextInt();
                switch(option){
                      case 1:
                            acess.degree();
                       break;
                       case 2:
                            acess.radian();
                        break;
                        case 3:
                            System.exit(0);
                        break;
                        default:
                            System.out.println("pleas choose those option");
                            trigon.main("55545","265");
                        break;
                      }
              }
   }
   int isg(int radian){

          trigon acess = new trigon();
          radian = radian % 360;
          acess.isL(radian);
          return 0;
    }
   int isL(int radian){
             if(radian <=90) {
                System.out.println("this is first qudrant");
               }
             else if (radian > 90 || radian <=180) {
                System.out.println("this is in second class");
               }
             else if (radian > 180 || radian <= 270) {
                 System.out.println("this is in third qudrant");
               }
              else if(radian > 180 || radian <=360){
                  System.out.println("this is in fourth qudrant");
               }
               return 0;
   }
   int radian(){
             trigon acess = new trigon();
             Scanner TakeInput = new Scanner(System.in);
             System.out.print("Eneter A value in degree \t");
             int value = TakeInput.nextInt();
             if(value < 360) {
                    acess.isL(value);
                 }
             else{
                    acess.isg(value);
                  }
             return 0;
   }
   int degree(){
              Scanner TakeInput = new Scanner(System.in);
              System.out.print("Eneter A value in radian \t");
              String radian = TakeInput.nextLine();
              return 0;
    }
}
