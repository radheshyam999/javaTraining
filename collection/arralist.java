import java.util.ArrayList;
import java.util.*;
public class arralist {

  public static void main(String[] args) {
    ArrayList<Integer>  arlist = new ArrayList<>();
    arlist.add(1);
    arlist.add(2);
    arlist.add(3);
    arlist.add(4);
    arlist.add(5);
    arlist.add(12);
    System.out.println(arlist);
   //Collections.
    arlist.remove(5);
    /**
    * this method used to  element  from ArraList  just  you  need to provide  index number
    */
    Collections.swap(arlist, 3, 4);
    System.out.println("geting out put after  swaping the value");
    for(Integer i:arlist){
      System.out.print(i+"\t");

  }
   System.out.println("\n");
  Collections.shuffle(arlist);
  /*
  * shuffle element withe help   suffle  method    randomaly
  *
  **/
  System.out.print(arlist);
}
/**
* ArrayList is kind of array it is not normal it is kinda  of dynamic array  so  i am  using braces that used to use genric   help for type safty  that you can store only one type  of elment like  string or Integer
 in this programe  i am using ArraList to perform some task like adding some elment and deleting  some elemrnt
*
*


*********/





}
