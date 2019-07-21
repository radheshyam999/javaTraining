
/* package codechef; // don't place package name! */

import java.util.*;



import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main (String[] args) throws ArrayIndexOutOfBoundsException 
	{  Scanner r = new Scanner(System.in);
        // your code goes here
        int i;
		int x[] = new int[5];
		for (i=0; i<x.length; i++){
		      x[i] = r.nextInt();
            System.out.println(i);    
            
        }
        
        
            if (x[i] <= 2) {
            System.out.println(x[2]);

             }
            if (x[0] <= 0) {
            System.out.println(x[1]);
              }
           if (x[4] <= 3) {
            System.out.println(x[4]);
            }
          else
           {
            System.out.println(x[2]);
            }


            
	}
}
