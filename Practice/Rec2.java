import java.util.Scanner;

class Rec2
{
    public static void main(String[] args) {
        Scanner TakeInput = new Scanner(System.in);
        Rec2  Acess = new Rec2();
    System.out.println("Pleas Enter Number ");
    int x = TakeInput.nextInt();
      double y = Acess.Show(x);
      System.out.println(y);

    }



double Show(int value)
{ double result;
    if(value==0) return 1;
  result = Show( value-1)*value;
return result;
}
}