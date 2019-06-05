class SynchrozationThread
{  
  public static void main(String... args)
    {
      SynchrozationThread r = new SynchrozationThread();
     threadone t1 = new threadone(r,"one");
     threadtwo t2 = new threadtwo(r,"two");
     threadthree t3 = new threadthree(r,"three");
   }


public void show()
   {
     System.out.println("hello");
  }
}

class threadone extends Thread
{   threadone(SynchrozationThread s){
     var  sync = s;
   }
  @Override
  public void run()
   {
    //super.run();
    sync.show();
  }
}
 class threadtwo extends Thread
 {    threadtwo(SynchrozationThread s){
      var  sync = s;
    }

    @Override
   public void run()
    {
    // super.run();
       sync.show();
   }
 }
class threadthree extends Thread
{
  threadthree(SynchrozationThread s)
  {
      var  sync = s;
    }
  @Override
    public void run()
     {  sync.
      //super.run();
        sync.show();
    }
}
