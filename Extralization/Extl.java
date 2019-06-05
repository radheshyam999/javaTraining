import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


public class Extl implements Externalizable
    {  
   private static final long serialVersionUID = 4390689528381779028L;  
        private String UserName;
          private String UserPassword;
          private int UserPin;
          private double UserAge;
              public void setUserName(String name){this.UserName = name;}  // seter  

              public String getUserName(){ return this.UserName; }   ///geter 

              public void setUserPassword(String pass){ this.UserPassword = pass;}// seter

              public String getUserPassword(){ return this.UserPassword; }/// geter

              public void setUserPin(int pin){ this.UserPin = pin; } // seter

              public int getUserPin(){ return this.UserPin; }/// geter

              public void setUserAge(double age){ this.UserAge = age; } // seter

              public double getUserAge(){ return this.UserAge; }/// geter

          
         @Override
         public void writeExternal(ObjectOutput out) throws IOException {
           out.writeObject(this.UserName);
           out.writeObject(this.UserPassword);
           out.writeInt(this.UserPin);
           out.writeDouble(this.UserAge); 


           
        } 
        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
           this.UserName = (String)in.readObject();
           this.UserPassword= (String)in.readObject();
           this.UserPin = (int)in.readInt();
           this.UserAge =(double)in.readDouble();

        }

        @Override
        public String toString(){
              String s = "userName \t"+this.UserName +"\n";
               s += "UserPassword \t"+ this.UserPassword + "\n";
               s += "User Pin \t" +this.UserPin + "\n";
               s += "userAge\t"+ this.UserAge +"\n";
         return s;
        }
    }