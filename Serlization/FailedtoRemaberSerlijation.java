import java.util.*;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

 class FailedtoRemaberSerlijation2 implements Serializable
   {
     private static final long serialVersionUID = 421234L;
     
       int x = 8;
       int y = 4;
   }        
    /**
 * InnerFailedtoRemaberSerlijation
 */
public class FailedtoRemaberSerlijation{
public static void main(String... args)
 { 
   try {
     
   
  FailedtoRemaberSerlijation2 fia = new FailedtoRemaberSerlijation2();
  ObjectOutputStream ob  = new ObjectOutputStream(new FileOutputStream("abc.text"));
  ob.writeObject(fia);
  ob.flush();
  ob.close();
    FailedtoRemaberSerlijation3 acess = new FailedtoRemaberSerlijation3();
    acess.show();
    } catch (Exception e) {
     e.printStackTrace();
    } 
 }
  
  
} 
/**
 * InnerFailedtoRemaberSerlijation
 */
class FailedtoRemaberSerlijation3 {
        public void show() throws Exception{
          
             ObjectInputStream inob = new ObjectInputStream(new FileInputStream("abc.text"));
             FailedtoRemaberSerlijation2 r =(FailedtoRemaberSerlijation2)inob.readObject();
              System.out.println(r.x+r.y);
            }
  
}
