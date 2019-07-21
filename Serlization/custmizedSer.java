import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 * custmizedSer
 */
public class custmizedSer implements Serializable {
    /****
     *  this  class all about how to do customized serlization for that we have to overide objecetWrite() method
     * 
     * 
     * 
     */


  private String Name;
   transient Strinig Password;
  public custmizedSer()
    { 
      Scanner scanInput = new Scanner(System.in);
      System.out.print("Enete name \t");
      Name =  scanInput.nextLine();
      System.out.print("Enter password \t");
      Password =  scanInput.nextLine();


    }

    
}

class custmizedSer2 {
    public static void main(String[] args) {
        
    }
    
   @Override
public void WritObject(ObjectOutputStream os) throws Exception {
    
         custmizedSer cus = new custmizedSer();
         
            //ObjectOutputStream oib = new ObjectOutputStream(new FileOutputStream("gametolog.json"));
             os.defaultWriteObject();
             String sr = "r"+cus.Password;
             os.writeObject(sr);
    
       
    }
    
 @Override 
 public void readObjecet(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String df = (String)is.readObject();
         System.out.print(df.substring(1));     
 }



}







