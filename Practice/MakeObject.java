public class MakeObject
{
    public static void main(String... args)
     {
         MakeObject Acess =   new MakeObject();
         Acess.show();      
     }

     MakeObject show()
     { 
   
       System.out.println("hey i am working object ");


      return new MakeObject();
     } 

}