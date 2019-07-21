package io;
public class letplaywithThread {

  public static void main(String[] args) {
    letplaywithThread1 t1= new letplaywithThread1("r");
    letplaywithThread2 t2= new letplaywithThread2("s");
    letplaywithThread3 t3= new letplaywithThread3("t");
    t1.start();
    t2.start();
    t3.start();

  }
}


class letplaywithThread1 extends Thread {
 letplaywithThread1(String s){
   super(s);
 }



    @Override
   public void run(){
     while (true) {
       System.out.println("i am in run with infinte while 1");
       try {
         Thread.sleep(2000);
       } catch(Exception e) {
         e.printStackTrace();
       }
       letplaywithThread1.show();
     }

   }

   public static void show(){
     System.out.println("i am show");
   }
}

class letplaywithThread2 extends Thread {
 letplaywithThread2(String s){
   super(s);
 }



    @Override
   public void run(){
     while (true) {
       System.out.println("i am in run with infinte while 2");
       try {
         Thread.sleep(2000);
       } catch(Exception e) {
         e.printStackTrace();
       }
       letplaywithThread1.show();
     }

   }

   public static void show(){
     System.out.println("i am show");
   }
}

 class letplaywithThread3 extends Thread {
 letplaywithThread3(String s){
   super(s);
 }



    @Override
   public void run()
   {
     while (true) {
       System.out.println("i am in run with infinte while 3");
       try {
         Thread.sleep(2000);
       } catch(Exception e) {
         e.printStackTrace();
       }

       letplaywithThread1.show();
      // System.out.print(Thread.CurruntThread().getName());
     }

   }

   public static void show(){
     System.out.println("i am show");
   }
}
