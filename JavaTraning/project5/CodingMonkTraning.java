import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CodingMonkTraning{

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double   x = meal_cost*tax_percent/100;
        System.out.println(x);
        double y = meal_cost*tip_percent/100;
        System.out.println(x);
        y = x+y+meal_cost;
        System.out.println(meal_cost);
        System.out.println((int) y);
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
