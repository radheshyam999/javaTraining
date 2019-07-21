import java.util.ArrayList;
import java.util.*;
public class learnCollection
 {
   public static void main(String[] args) {
     ArrayList<String> list  = new ArrayList<>();
     list.add("india");
     list.add("us");
     list.add("chine");
     list.add("pakistan");
     Collections.sort(list);


     for(String v: list) {
         System.out.println(v);
     }
      System.out.println(" ");
      Collections.reverse(list);
      for(String v: list) {
          System.out.println(v);
      }
   }

 }
