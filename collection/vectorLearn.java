import java.util.*;
import java.util.Vector;
public class vectorLearn
{
    public static void main(String[] args)
     {
      Vector<Integer> vect = new Vector<>();
      /**
*vector is  same as ArrayList there is  some minor deffrence  vector is Synchroniged  same time  ArrayList is not Synchroniged
      **/

      vect.add(1);
      vect.add(2);
      vect.add(3);
      vect.add(4);
      vect.add(5);
      vect.add(6);
      Collections.swap(vect,0,5);
      System.out.println(vect);
     }
}
