class Run extends whereWeNeedToRun 
{
    public static void main(String[] args) 
    {
       // System.out.print("i am grand son ");
        Run r = new Run();
        r.Learnoverriding();
       
        
    }

    void Learnoverriding() {
        
        //super.Learnoverriding();
 //System.out.println(((Programmer)this).x);
 ((Programmer)this).Learnoverriding();
    }
}

class whereWeNeedToRun extends DeadGamer
  {
     void Learnoverriding() {
        System.out.print("i am son ");
    }
  }
  class DeadGamer extends Programmer
  {
      void Learnoverriding() {
        System.out.print("i am second parent ");
         // super.Learnoverriding();
    }
  }
 class Programmer 
 {  int x= 10;
      void Learnoverriding(){
          System.out.print("i am firset parent ");
      }
 }