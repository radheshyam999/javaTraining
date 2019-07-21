package io;
public  class letplaywithThread2 extends Thread {
 letplaywithThread2(String s){
   super(s)
 }



    @Override
   public void run(){
     while (true) {
       System.out.println("i am in run with infinte while");
       letplaywithThread1.show();
     }

   }

   public static void show(){
     System.out.println("i am show");
   }
}
