import java.io.Serializable;

public class Ser implements Serializable
{ 
  transient protected int x, y;    // tarnsient basical used for  secruity propose  if you are  using transint keyword than you wil able to acess your  intial value 
    public static void main(String[] args) {
         System.out.println("I am ser");
         
    }
}