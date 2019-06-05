import java.util.Scanner;

public class StartLearningOverLoding
      {

       // private int x;

    public static void main(String... args)
     {    int number;
        StartLearningOverLoding Acess = new StartLearningOverLoding();
         Scanner TakeInput = new Scanner(System.in);  
         System.out.println("how many number you wnat to Enter ");
           number = TakeInput.nextInt();

           if (number < 3 && number > -1) 
           {
                if(number ==0 )
                 {
                    Acess.show();
                 } 
                else if (number ==1)
                 {
                  Acess.show(10);  
                 }
                else if (number == 2)
                 {
                  Acess.show(2,3);  
                 }
           }  

            else{
    System.out.println("pleas Enter  number less then 2 and greter tan -1");

                  }

     }

    int show() {
 System.out.print("i dont have prameter");
        return 0;
    }

    int show(int x) {
        System.out.print("i do have prameter 1");
        //this.x = x;
        return 0;
        }
        
        int show(int x,int y)
         {
         System.out.print("i do have prameter 2");
        // this.x = x;
        return 0;
        }
      }