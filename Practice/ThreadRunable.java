class ThreadRunable implements Runnable
 {
    public static void main(String... args)
      {
          Runnable t1  = new threadone(); 
          Runnable t2 = new threadtwo();
          Runnable t3 = new threadthree();
          Runnable t4 = new ThreadRunable();
         Thread r1= new Thread(t1);
          Thread r2 = new Thread(t2);
          Thread r3 = new Thread(t3);
          Thread r4 = new Thread(t4);
         r1.start();
         r2.start();
          r3.start();   
          r4.start();
      }


      public void run() {
        int i = 1;
        while (i >= 1) {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("Main");
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " \t i changed Your Name");
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
            if (i > 10) {
                System.out.print("i am about to die \t" + Thread.currentThread().getName());
                break;
            }
        } // While loop is closing here
    }
 }

 class threadone implements Runnable
   {
       @Override
    public void run()
      {
        int i = 1;
        while (i >= 1) {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("one");
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " \t i changed Your Name");
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
            if (i > 10) {
                System.out.print("i am about to die \t" + Thread.currentThread().getName());
                break;
            }
        } // While loop is closing here
      }
   }
 
class threadtwo implements Runnable
    {
       @Override
    public void run() 
       {
        int i = 1;
        while (i >= 1) {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("two");
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " \t i changed Your Name");
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
            if (i > 10) {
                System.out.print("i am about to die \t" + Thread.currentThread().getName());
                break;
            }
        } // While loop is closing here
       }
    }

class threadthree implements Runnable
  {      @Override
         public void run()
           {
             int i = 1;
        while (i >= 1) {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("Three");
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " \t i changed Your Name");
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
            if (i > 10) {
                System.out.print("i am about to die \t" + Thread.currentThread().getName());
                break;
            }
        } // While loop is closing here
           }  
  }