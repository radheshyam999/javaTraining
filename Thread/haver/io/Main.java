public class Main{
   public static void main(String... args)
    {
   // this is thread  for  first class  to learn

     Threadone t1  = new  Threadone("i am thread one ");
    Threadtwo t2 =  new Threadtwo("i am thread two ");
    t1.setPriority(10);
    t2.setPriority(2);
    t1.start();
    t2.start();
    // t1.setPriority(2);
    // t2.setPriority(10);
     System.out.print(t1.getPriority());
     System.out.println(t2.getPriority());
    }
}
class Threadone extends Thread
{
   Threadone(String s)
    {
        super(s);       //  i am calling her parrent class  cnstrucuter

    }
   @Override
   public void run() {
    // super.run();
    for(int i =0; i<10; i++)
    {
      System.out.println(Threadone.currentThread().getName());
   try {
       Threadone.sleep(2000);
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
  System.out.println("dead" + Threadone.currentThread().getId());
   }
}



 class Threadtwo extends Thread
  {
    Threadtwo (String s)
    {
        super(s);
    }
    @Override
    public void run() {
      //super.run();
      for(int i =0; i<10; i++)
      {
          System.out.println(Threadtwo.currentThread().getName());
      }
      System.out.println("dead" +Threadtwo.currentThread().getId());
    }

  }
