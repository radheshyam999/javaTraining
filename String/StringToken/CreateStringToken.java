import static java.io.StreamTokenizer.TT_EOF;
import static java.io.StreamTokenizer.TT_EOL;
import static java.io.StreamTokenizer.TT_NUMBER;
import static java.io.StreamTokenizer.TT_WORD;
import java.io.StreamTokenizer;
import java.io.IOException;
import java.io.StringReader;
public class CreateStringToken
{
  public static void main(String[] args) {
    String lsdm =" 6 58566565 26656565656 6565656 66566 65656 instance of StringTokenizer behaves in one of two ways, depending on whether it was created with the returnTokens flag having the value true or false ";  
   StringReader r = new StringReader(lsdm);
   StreamTokenizer token =  new StreamTokenizer(r);
   
   try {
       while (token.nextToken() !=TT_EOF) {
           switch (token.ttype) {
               case TT_WORD:
                   System.out.println(token.sval);

                   break;
            case TT_NUMBER:
                    System.out.println(token.sval +" /t I am number :");
            break;
               
           }
       }
   } catch (Exception e) {
       e.printStackTrace();
   }


}
}