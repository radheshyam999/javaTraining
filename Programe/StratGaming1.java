import java.util.*;
import java.io.*;
import java.math.*;
 
class StartGaming1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a,b,n, i;
        int s3[] = new double[10];
        int t=in.nextInt();
        for( i = 0; i < t; i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
          s3[i] =(int) (a*(Math.pow(2, i))*b);
      for (i = 0; i < 10; i++) {
        int s4[] = new double[10];
        s4[i] = (int) (s3[i] + s4[i - 1]);
        System.out.print(s4[i]);
      }
        }
       
         
        

        in.close();
    }
}






   
