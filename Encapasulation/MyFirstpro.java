import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Exception;
import java.util.Scanner;

import java.io.InputStreamReader;

class myFirstpro {
    private String UserName = "root"; // private variable initiliz
    private String Password = "12345"; // private variable
    private int Pin = 4156; // private variable initiliz

    /**
     * @return the userName
     */
    public String getUserName() // I am geting // private value here
    {
        return UserName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        UserName = userName;

    }

    /**
     * @return the password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        Password = password;
    }

    
    public static void main(String... gameofthorndontsee) throws Exception {

        myFirstpro Acess = new myFirstpro();
        Acess.Enapsulation(Acess);
    } // main function end here

    void Enapsulation(myFirstpro Acess) throws Exception { // i used cural braces for seperate from main function/

        String UserName;
        String Password;
      //  int value;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); // i am geting input from user
        System.out.println("What is your user name ?");
        UserName = read.readLine();
        if (UserName.equals(Acess.getUserName())){
            System.out.println(" What is your password ");
            Password = read.readLine();
            if (Password.equals(Acess.getPassword())) {
                  System.out.println("your going to login?");
            } 
            else {
                System.out.print("wrong Password");
                System.out.println("pleas do that process again ");
                Acess.Enapsulation(Acess);
            }
        }
        else{
           System.out.print(" failed ");
           System.out.println("pleas do that process again ");
           Acess.Enapsulation(Acess);
        }
    }
}
      /*  if (UserName.equals(Acess.getUserName())) {
            System.out.print(" how do want login ..");
            System.out.print("1 \t Password");
            System.out.println("2 \t Pin");
            System.out.println(Acess.getPassword());

            value = read.read();
               if(value==Acess.getPin()){
                   Acess.LoginByPassword(Acess, read);
               }
               else{
                   Acess.LoginByPassword(Acess, read);
                  Acess.LoginByPin(Acess, read);
               }




            switch (value) {
            case 1:
                Acess.LoginByPassword(Acess, read);
                break;
            case 2:
                Acess.LoginByPin(Acess, read);
                break;
            }
        } else {

               System.out.println("Pleas Eneter  proper number");
        }

       

   }

    void LoginByPassword(myFirstpro Acess, BufferedReader read) throws IOException {
        String Password;
        System.out.println("What is your Password?");
        Password = read.readLine();
        if (Password.equals(Acess.getPassword())) {
            System.out.println("You Are  going to login");

        } else {

        }

    }

    void LoginByPin(myFirstpro Acess, BufferedReader read) throws Exception {
        int Pin;
        System.out.println("What is your Pin?");
        Pin = read.read();
        if (Pin ==Acess.getPin()) {
            System.out.println("You Are  going to login");

        } else {

        }
    }

}
}*/
   // ther  some kind Excepation i am grting // 
   