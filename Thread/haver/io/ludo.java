public class ludo implements Runnable{

  public static void main(String[] args) {
    ludo LUDO = new ludo();
     mit MIT = new mit();
     iit IIT = new iit();
     nit NIT = new nit();
     new Thread(MIT).start();
     new Thread(IIT).start();
     new Thread(NIT).start();
     new Thread(LUDO).start();
    }

    @Override
    public void run(){
     for (Integer i = 0; i < 20; i++) {
       try {
         Thread.sleep(100);
         System.out.println("i am in ludo");
       } catch(Exception exception_name) {
         System.out.println(exception_name);
       }
     }

    }





}
class mit implements Runnable {
  @Override
  public void run(){
    for (Integer i = 0; i <10; i++) {
      try {
        System.out.print(Thread.currentThread().getName());
        Thread.sleep(100);
      } catch(Exception exception_name) {
      System.out.println(  exception_name);
      }

    }
    System.out.println("");
  }


}
class iit implements Runnable{
  @Override
  public void run(){
    for (Integer i = 0; i <15; i++) {
      try {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(100);
      } catch(Exception exception_name) {
      System.out.println(  exception_name);
      }
    }
    System.out.println("");
  }
}
 class nit implements Runnable {
   @Override
   public void run(){
     for (Integer i = 0; i <20; i++) {
       try {
         System.out.println(Thread.currentThread().getName());
         Thread.sleep(100);
       } catch(Exception exception_name) {
          System.out.println( exception_name);
       }

     }
     System.out.println("");
   }

}
