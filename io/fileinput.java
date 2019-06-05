import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileinput
 {
  public static void main(String[] args)
   {
      fileinput Acess = new fileinput();
      try
        {
          Acess.Dataraed();   
        }
        catch (Exception e)
         {
         e.printStackTrace(); 
         } 
     
    }

 void Dataraed() throws Exception 
 {  byte b[];
     String r  ="Till now, we were using array data structure to organize the group of elements that are to be stored individually in the memory. However, Array has several advantages and disadvantages which must be known in order to decide the data structure which will be used throughout the program.Array contains following limitations:The size of array must be known in advance before using it in the program.Increasing size of the array is a time taking process. It is almost impossible to expand the size of the array at run time.All the elements in the array need to be contiguously stored in the memory. Inserting any element in the array needs shifting of all its predecessors.Linked list is the data structure which can overcome all the limitations of an array. Using linked list is useful because,It allocates the memory dynamically. All the nodes of linked list are non-contiguously stored in the memory and linked together with the help of pointers.Sizing is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.";
     FileOutputStream fout = new FileOutputStream("abc.text", true);
      DataOutputStream dout = new DataOutputStream(fout);
      FileInputStream  fin = new FileInputStream("abc.text");
      DataInputStream din  = new DataInputStream(fin);
      b = new byte[din.available()];
  
      try 
      {
            dout.writeBytes(r);   
      } 
      catch (Exception e)
        {
         e.printStackTrace();
        }
       
        for (int i = 0; i < din.available(); i++) {
             b [i] = din.readByte(); 
             System.out.print((char)b[i]);
        }
        
} 
}