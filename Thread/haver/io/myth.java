import java.util.*;
public class myth implements Runnable{
  public myth() {

  }
       @Override
       public void run(){
         myth acess = new myth();
         System.out.println(acess);
         acess.show();
         for (Integer i = 0; i < 20; i++) {
                 System.out.println("run first");
         }
        }

       public static void main(String[] args) {
       myth Acess = new myth();
       myth1 a =  new myth1();
       Thread t1 = new Thread(Acess);
       Thread t2 = new Thread(a);

       t1.start();

       t2.start();




       }
       public void show(){
         System.out.println("i am show");
       }
}



class myth1 implements Runnable{

       @Override
       public void run(){
         myth acess = new myth();
         System.out.println(acess);
         acess.show();
         for (Integer i = 0; i < 20; i++) {
                 System.out.println("run  second");
         }
        }

       public static void main(String[] args) {
       myth Acess = new myth();




       }
       public void show(){
         System.out.println("i am show");
       }
}
