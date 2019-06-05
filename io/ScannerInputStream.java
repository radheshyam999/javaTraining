import java.util.Scanner;

public class ScannerInputStream
        {
            
            public static void main(String[] args) {
                double op1, op2;
        String opertion;
        Scanner Input = new Scanner(System.in);
        op1 = Input.nextDouble();
        opertion = Input.next();
        op2 = Input.nextDouble();
          double cal= calculate( op1, op2,opertion);
          System.out.println(cal);
            }
            public static double calculate(double op1,double op2,String opertion){
                 
                 switch (opertion) {
                     case "+":
                         return op1+op2;
                         //break;
                    case "*":
            return op1 * op2;
                           // break;
                    case "-":
            return op1 - op2;
                           // break;
                 case "%":
            return op1 % op2;
                      //break;
                         
                 
                     default:
                         break;
                 }
                 return Double.NaN;
             }
        }