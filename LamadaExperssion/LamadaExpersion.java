 
public class LamadaExpersion  extends Game
{
    public static void main(String... args)
        {
         LamadaExpersion  R = new LamadaExpersion();
          R.game();

        }
        @Override
             void game()
        {
         System.out.println("  i am overriden method");
        }
}

abstract class Game {
    abstract void game();

}