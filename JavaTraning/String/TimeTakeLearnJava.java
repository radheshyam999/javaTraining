import java.util.Scanner;;

class TimeTakeLearnJava
{
    public static void main(String[] args) {
      TimeTakeLearnJava AcessMethod = new TimeTakeLearnJava();
      AcessMethod.IntroDuceYourself();  
    }
    void IntroDuceYourself(){
        Scanner scan = new Scanner(System.in);
        TimeTakeLearnJava AcessFunction = new TimeTakeLearnJava();
        
        
        System.out.println("What do You do? To Imporve your programe skill");
              System.out.print("1\t  Write code ");
              System.out.println("2\t  study book");
              System.out.print("3\t  Doing course from  institute ");
               System.out.println("4\t  other");
               int value = scan.nextInt();
                
              switch (value) {
                 case 1:
                         AcessFunction.Writecode();
                      break;
                 case 2:
                        StudyBook();
                     break;
                 case 3:
                        DoingFormInstitute();
                     break;
                case 4:
                        other();
                     break;
                    
                 
              }

    }

    void Writecode(){
        System.out.println("how Many hour do spend to write code ?");
          System.out.print("2\t  Hour");
          System.out.println("3\t  Hour");
          System.out.println("4\t  Hour");
          System.out.println("6\t  Hour");
          System.out.println("5\t other  ");
    }
   void  StudyBook(){
      System.out.println("How many Hour  do you Study Book?");
        
   }
}