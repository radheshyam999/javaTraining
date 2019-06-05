import java.util.*;
public class ThisInhertanc extends kltm
{
  ThisInhertanc()
  {
    super(6);
  }
  public static void main(String[] args) {
        ThisInhertanc r =  new ThisInhertanc();
        r.game();
        r.show();

  }
  void show()
  {
    System.out.print("show");

  }
}
class kltm
{
  kltm(int x)
  {
     System.out.print(x + " i am constucuter  kltm \n");
  }
  void game()
   {
        System.out.print("i am game");

   }
}
