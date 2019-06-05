


/**
 * NestLocal2
 */
public class NestLocal {
    public static void main(String[] args) {

        NestLocal2 r = new NestLocal2();
         r.show();
    }

}

class NestLocal2 {
    
//s.display();
    void show() {
       InnerNestLocal2 mti = new InnerNestLocal2();
        System.out.println("i am out  side  of function");
        class InnerNestLocal2 {
            int x = 5;

          void  display() 
             {
                System.out.println("i am under function nested class ");

            }

        }
    }

}

   

// }