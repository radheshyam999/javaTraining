import java.util.Scanner;

class StartCoding 
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
       StartCoding Acess = new StartCoding();
         int x=0;
        System.out.println("Pleas Enter A number ");
         x = takeInput.nextInt();
         Factor(Acess.x);
         
     takeInput.close();
    }
   static void Factor(int y){
       if (y > 0) 
       {
          y = Factor(y-1); 
          y = y+y;
       }

       else
       {
           y = 1;
       }
    System.out.println(y);   
  }
  
}