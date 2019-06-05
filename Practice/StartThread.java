 class StartThread 
{
    public static void main(String... args)
     {
            thread1 th1 = new thread1("ronaldo");    /** Creating instance thread1  and passing  string argument to definnig name*/  
            thread2 th2 = new thread2("shkira");
            thread3 th3 = new thread3("broklenserner");
            th1.start();    /**started thread here  */
            th2.start();
            th3.start();
            try {
              th1.join(100);
            th3.join();
            th2.join();  
            } catch (Exception e) {
              e.printStackTrace();
            }
           


            System.out.println(Thread.currentThread().getName() + " ia ma baout to dei ");
     }
     
//     public void run(){
      
//   }
}
class thread1 extends Thread
{  thread1(String Name)
    {
      super(Name);

    }
  public void run()
  {   int i=1;
    while (i >= 1) 
      {
          System.out.println(Thread.currentThread().getName());
           Thread.currentThread().setName("one");
          try {
              Thread.sleep(1000);
               System.out.println(Thread.currentThread().getName() + " \t i changed Your Name");
              }    
              catch (Exception e) {
              e.printStackTrace();
             }
             i++;
          if (i > 10) 
              {
                System.out.print("i am about to die \t" + Thread.currentThread().getName());
                break;
              }    
     }    //  While loop is closing here 
  }
}
 class thread2 extends Thread{
thread2(String Name){
    super(Name);
}
    public void run() {
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

class thread3 extends Thread
{   thread3(String Name)
    {
        super(Name);
    }

    public void run() {
        int i = 1;
        while (i >= 1) {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("three");
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
