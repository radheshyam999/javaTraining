class NesteNonStat
{
    public static void main(String[] args) {
         // non static inner class 
        NesteNonStat r = new NesteNonStat();
        NesteNonStat.InnerNesteNonStat s= r.new InnerNesteNonStat();
        s.show();
    }

/**
 * InnerNesteNonStat
 */
public class InnerNesteNonStat {
     void  show (){
    System.out.println("Innner class");
      }   
    
}

}