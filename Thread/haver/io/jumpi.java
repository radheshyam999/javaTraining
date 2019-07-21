public class javai implements Runnable
 {
  public static void main(String... F)
   {
       Runnable t1 =  new javai();
       Runnable t2 =  new Threadone();
       Runnable t3 =  new Threadtwo();
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        //new Thread(t).start();
   }


   @Override
   public void run()
   {
      for(int i =0; i<10; i++)
      {     //Thread r = new Thread();
            Thread.currentThread().setName("radheshyam");
            //Thread.currentThread().setPriority(10);
            System.out.println(" i failed \t" + Thread.currentThread().getName());

            try {
            //  Thread.currentThread().sleep(2000);
            } catch(Exception exception_name) {
              exception_name.printStackTrace();
            }
      }
      System.out.println(" i am Dead");
   }

 }
  class  Threadone  implements Runnable
  {

    @Override
    public void run()
    {
       for(int i =0; i<10; i++)

       {    Thread.currentThread().setPriority(10);
         Thread.currentThread().setName("dev");
             System.out.println(" i failed \t" + Thread.currentThread().getName());
             try {
               //Thread.currentThread().sleep(2000);
             } catch(Exception exception_name) {
               exception_name.printStackTrace();
             }

       }
       System.out.println(" i am Dead");
    }


  }

     class Threadtwo implements Runnable
     {
       @Override
       public void run()
       {
          for(int i =0; i<10; i++)
          {   Thread.currentThread().setName("fty");
                System.out.println(" i failed \t" + Thread.currentThread().getName());


                try {
                //  Thread.currentThread().sleep(2000);
                } catch(Exception exception_name) {
                  exception_name.printStackTrace();
                }
          }
          //Thread r = new Thread()
          //r.start();
          System.out.println(" i am Dead2");
       }
     }
