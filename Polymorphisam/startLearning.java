
import java.io.IOException;    
 
import java.util.Scanner;

class startlearning 
{
    public static void main(String[] args) throws IOException
    {   int Value;
       // BufferedReader readData =  new BufferedReader(new InputStreamReader(System.in));    // if you want get  input by buffer reqader
       Scanner readData = new Scanner(System.in);   //   taking input here  imported class java.util.Scanner
         startlearning AcessData = new startlearning();     /// instansited bjec here 
        System.out.println("which method do you want to run");
       
        System.out.println("1 "+"\t void show() \t "+"     \t "+"\t^");
       
        System.out.println("2 " + "\t void show(int x) \t"+"\t^");
       
        System.out.println("3 " + "\t void show(int x float y) \t"+"^");
        
        System.out.println("4 " + "\t void show(int x ,char y) \t"+"^");
        
        System.out.println("5 " + "\t void show(int x,string y) \t"+"^");
        
        System.out.println(">>>>>>>>>>>>=====================================>>>>>>>>");
        
        System.out.println(">>>>>>>>>>>>=====================================>>>>>>>>");
        
        System.out.println(">>>>>>>>>>>>=====================================>>>>>>>>");
        
        System.out.println(">>>>>>>>>>>>=====================================>>>>>>>>");
        
        System.out.println(">>>>>>>>>>>>=====================================>>>>>>>>");
        
        Value = readData.nextInt();
        
        switch (Value) {
           
            case 1:
                
            AcessData.show();  
               
            break;
         case 2:
             
                AcessData.show(Value);
           
              break;
         case 3:
           
             AcessData.show(Value, Value);
          
             break;
       case 4:
      
       AcessData.show(Value, 0);

            break;
        case 5:
          
        AcessData.show(Value, null);
            
          break;
            
          default:

            System.out.println("error");
               
            break;
        }
        readData.close();
    }

    void show()
    {
        System.out.println("i am without prameter");
    }
    void show(int x)
    {
      System.out.println("THERE IS ONE PRAMETER" + x);
    }
     void show(int x,float y)
   {
        System.out.println("THERE IS ONE ON FLOAT " + x + y);
    }
    int show( int x,char y)
    {
        System.out.println("THERE IS ONE ON CHAR "+ x+ y);
      
        return 0;   
    }
    int show(int x ,String y)
    {
        System.out.println(" THERE IS ONE ON STRING "+ x  + y);
    
        return 0;   
    }
}
