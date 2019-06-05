import java.util.Scanner;

class PolyMorphism1
  {    // constructer overloding  here //
      //var x,y;
     public static void main(String[] args)
        {
            Scanner r = new Scanner(System.in);
            System.out.println("Pleas Enter two value");
            var x =r.nextInt();
            var y  = r.nextInt();
            new PolyMorphism1(x,y);
            r.close();  
            
            // System.out.println("1\t Nothing \n 2 \t int \n 3 \t float \n 4 \t String \n 5 char \n 6 \t double \n 7 \t int float \n 8\tint String ");
            // switch (x) {
            //     case 1:
                    
            //         break;
            //     case 2:
            // x = r.nextInt();
            // y = r.nextLine();
            //        break;
            //     case 3:

            //        break;
            //     case 4:

            //          break;
            //     case 5:

            //          break;
            //     case 6:

            //         break;
            //     case 7:

            //       break;
            //      case 8:

            //     break;
            
            //      default:
            //         break;
            // }
            
           // x =r.nextLine();
            // y =r.nextLine();
        }
  PolyMorphism1(){System.out.print("Defaualt");}
  PolyMorphism1(int x){System.out.println("hey i am int ");}
  PolyMorphism1(float x){System.out.println("hey i am float");}
  PolyMorphism1(String x) {System.out.println("hey  i am String ");}
  PolyMorphism1(char x) {System.out.println("hey  i am char ");}
  PolyMorphism1( double x) {System.out.println("i am double");}
  PolyMorphism1(int x , double  y){System.out.println("i am  int double");}
  PolyMorphism1( int x , String y) {System.out.println(x + "" + y);}

      
  }