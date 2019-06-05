import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ext2 
      {
        
     public static void main(String[] args)throws Exception {
         String name ,password;
         int pin;
         double Age;
         Extl Acess = new Extl();
         ext2 ld = new ext2();
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter Name");
         name = scan.nextLine();
         System.out.println("Enter password");
         password = scan.nextLine();

         System.out.println("Enter Pin");
         pin = scan.nextInt();
         System.out.println("Enter age ");
         Age = scan.nextDouble();
         Acess.setUserName(name);
         Acess.setUserPassword(password);
         Acess.setUserPin(pin);
         Acess.setUserAge(Age);
         ObjectOutputStream oub = new ObjectOutputStream(new FileOutputStream("haver.text"));
         oub.writeObject(Acess);
         
         
            //new FileOutputStream(null)
            // new FileInputStream() 
         ld.show(Acess);
       
 

         scan.close();
     }
      public void show(Extl id) throws Exception
         {  
         ObjectInputStream input = new ObjectInputStream(new FileInputStream("haver.text"));
            Extl r = (Extl)input.readObject();
              
               System.out.println(r);
                

           
        //   System.out.println(id.getUserName());
        //   System.out.println(id.getUserPassword());
        //   System.out.println(id.getUserPin());
        //   System.out.println(id.getUserAge());

         }
      }