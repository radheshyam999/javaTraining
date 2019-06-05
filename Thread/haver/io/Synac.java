class Synac implements Runnable
 {     Synac T;
     Synac(Synac t){
       T =t;
     }
    public static void main(String... args)
     {
        Synac t = new Synac(t);
        Runnable s1 = new Synac1(t);
        Runnable s2 = new Synac2(t);
        Runnable s3 = new Synac3(t);
           new Thread(s1);
            new Thread(s1);
             new Thread(s1);
      }

      public void run()
          {
              T.show(2);
               Thread.currentThread().setName("WhatsApp");
              for(int i =0; i<20; i++)
                {
                      System.out.print(Thread.currentThread().getState()+"\t");
                      System.out.println(Thread.currentThread().getName());
                }

             }
    //  synchronized
      public void show(int x)
      {
          for(int i=1; i<=10; i++)
            {
              System.out.println(x*i);
            }
       }
 }


 class Synac1 implements Runnable
   {
     Synac obj;
     Synac1(Synac ob)
      {
        obj = ob;
       }
      @Override
       public void run()
           {
               obj.show(5);
                Thread.currentThread().setName("WhatsApp");
               for(int i =0; i<20; i++)
                 {
                       System.out.print(Thread.currentThread().getState()+"\t");
                       System.out.println(Thread.currentThread().getName());
                 }

              }
         }
 class Synac2 implements Runnable
   {
     Synac obj;
      Synac2(Synac ob)
      {
        obj = ob;

      }
     @Override
     public void run()
       {
               obj.show(10);
          Thread.currentThread().setName("WhatsApp");
         {  for(int i =0; i<20; i++){
           System.out.print(Thread.currentThread().getState()+"\t");
           System.out.println(Thread.currentThread().getName());
         }
       }
   }
 class Synac3 implements Runnable
   {   Synac obj;
        Synac3(Synac ob)
        {
          obj = ob;
         }
          @Override
           public void run()
         {
                obj.show(15);
                Thread.currentThread().setName("WhatsApp");
              for(int i =0; i<20; i++)
                 {
                   System.out.print(Thread.currentThread().getState()+"\t");
                   System.out.println(Thread.currentThread().getName());
                 }
           }
     }
   }
