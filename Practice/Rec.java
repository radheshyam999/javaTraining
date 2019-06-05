class Rec
  {   /** here using Recursion  */
   public static void main(String... st)
    {
   int game; 
   Rec AcessMethod = new Rec();
    game = AcessMethod.show(8);
      System.out.println(game);
   
   
    }
		   
    int  show(int x)
    {
  int rt;
       
  System.out.println("i am going recursion  ");
      if(x == 1) return 1;    
    rt = show(x-1) * x;
         
      
  
  
      return rt;
  
  
  
  
 


      
        

    }


  }
