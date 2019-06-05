import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class custS2 implements Serializable
      { 
    private static final long serialVersionUID = 8370422436806031886L;
          
        String name = "Radheshyam";
        transient  String Pin = "12453";
        private  void  writeObject(ObjectOutputStream ob) throws Exception
           {    
                ob.defaultWriteObject();
                String g = "123"+Pin;
                ob.writeObject(g);
               

           }
   private void readObject(ObjectInputStream input) throws Exception
           { 
                input.defaultReadObject();
                String s = (String) input.readObject();
                Pin = s.substring(3);
           }
 
      }
      