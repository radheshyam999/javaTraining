import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class coustS1 implements Serializable
   {     
       private static final long serialVersionUID = 1309513343049176306L;  
       public static void main(String[] args)
          {
            System.out.println("main");
            custS2 cu = new custS2();
             try{
            ObjectOutputStream getwei = new ObjectOutputStream(new FileOutputStream("html.html"));
             ObjectInputStream  getInput = new ObjectInputStream(new FileInputStream("html.html"));
               getwei.writeObject(cu);   //   i am  object of  custS2 // 

               custS2 acess  = (custS2)getInput.readObject();   // reading object  down custing  that object 
               System.out.println(acess);
               System.out.println("Name Is "+ acess.name);   // Acess ing those value what do know //..
               System.out.println("Pin is " + acess.Pin);
             }
             catch(Exception e)
                {
                 e.printStackTrace();
                }
          }
   }