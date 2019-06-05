import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Serlization implements Serializable
{
     public static final long serialVersionUID =5000248003314368126L;
     public static void main(String[] args)
         {  Serlization  red= new Serlization();
             Ser s = new Ser();
            s.x=7;
            s.y=9;  
             
        try{
             ObjectOutputStream ObjIn = new ObjectOutputStream(new FileOutputStream("abc.text"));
             ObjIn.writeObject(s);
             red.show();
        }
         catch (Exception e)
            {
            e.printStackTrace();
           }
            System.out.println("I am Main");
           
        }


         void show() throws Exception
           {  Ser gh; int l=0;

            try {
              ObjectInputStream ob = new ObjectInputStream(new FileInputStream("abc.text"));
             
                gh = (Ser) ob.readObject();
              // System.out.println(gh.x);
               gh.x+=gh.y;
               
                System.out.println(gh.x>>0);

            } catch (Exception e) {
              e.printStackTrace();
            }
              
      
           }
}