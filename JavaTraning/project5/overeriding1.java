import java.util.Scanner;

class overerding1   
{
    public static void main(String[] args) {
           overerding1 r = new overerding1();
           r.AcessGame();
    }



  void AcessGame(){   /// to calculating Factriol
          int FactNumber=0,  m=1;
    System.out.println("Enter number for geting factorial");
      Scanner scan  = new Scanner(System.in);
        // FactNumber = scan.nextInt();
       
      //  while (FactNumber >= 1) {
      //       System.out.println(FactNumber);
      //       FactNumber--;
      //  } 
      for(FactNumber=scan.nextInt(); FactNumber>=1; FactNumber--){
            m = FactNumber*m;
         System.out.print(FactNumber+"x");
          
      }
      System.out.println("="+m);

}
}