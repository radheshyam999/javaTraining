import java.util.concurrent.CopyOnWriteArrayList;
/**
 * copywrite
 */
public class copywrite {

public static void main(String[] args) {
  CopyOnWriteArrayList<String> cop = new CopyOnWriteArrayList<>();
cop.add("html");

cop.add("css");
cop.add("js");
cop.add("python");
cop.add("c");

cop.add("sql");
cop.add("cpp");

cop.add("node");

cop.add("Linux");
cop.add("windows");
cop.add("photoshop");

cop.add("coral");

cop.add("ilestrator");

arralisth1 ar = new arralisth1(cop);
arralisth2 ar2 =new arralisth2(cop);
Thread t1 = new Thread(ar);
Thread t2 = new Thread(ar2);
t1.start();
t2.start();
t1.join();
t2.join();
}
}
class arralisth1 implements Runnable{
CopyOnWriteArrayList<String> al;
arralisth1(CopyOnWriteArrayList<String> al){
  this.al = al;
}

 @Override
 public void run() {
   Iterator i = al.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    try {
      for(int num=0;num<5; num++){
        al.add("srk");
        al.add("lsdm");
        al.add("kill");
      }
    } catch(Exception exception_name) {
      exception_name.printStackTrace();
    }
 }
}
class arralisth2 implements Runnable{
  CopyOnWriteArrayList<String> al2;
arralisth2(CopyOnWriteArrayList<String> al2){
  this.al2 = al2;
}
@Override
public void run() {
Iterator i = al2.iterator();
 while(i.hasNext()){
   System.out.println(i.next());
 }
 try {
   for(int num=0;num<5; num++){
     al2.add("cricket");
     al2.add("footaball");
     al2.add("waliball");
   }
     Thread.sleep(10000);
   }
 } catch(Exception exception_name) {
   exception_name.printStackTrace();
 }
}
}
