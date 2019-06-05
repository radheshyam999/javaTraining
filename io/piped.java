import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class piped 
{  
   
   public static void main(String[] args) throws Exception { 
      PipedOutputStream output = new PipedOutputStream(/*new FileOutputStream("haver.text")*/);
      PipedInputStream input = new PipedInputStream(/*new FileInputStream("haver.text")*/);
      //  piped  p = new piped (); 
       
      output.connect(input);
       Thread t1 = new Thread(){
  
      @Override
      public void run()
       {  for (int i= 65;  i < 91; i++) {
          try {
                  output.write(i);
                  Thread.sleep(1000);
          } catch (Exception e) {
            e.printStackTrace();
          }
           
       }
      
       }
   };
     Thread t2  = new  Thread(){
         @Override
      public void run()
       {   
           try 
           {  Thread.sleep(1000);
               //int available = input.available();
               for (int i = 65; i < 91; i++) {
             
              System.out.println((char)i);
       } 
      }catch (Exception e)
        {
         e.printStackTrace();
         }
         
       }
     };


   t1.start();
   t2.start();
}   
}