import java.util.Scanner;

 class HowToCheckBackSlash
{
//     public static void main(String[] args) 
//     {
//       
//         System.out.println("what is your path ");
//           
//            System.out.println(path);

//            int x = path.indexOf("\\");
//            while(){
//              x = path.indexOf("\\");
//              System.out.println( path.replace("\\", "\"));
//             path.toLowerCase();
//            }
         
//     }
// }



public static void main(String args[]){  
        Scanner r = new Scanner(System.in);
        String path = r.nextLine();
 
       path=path.replace("\\", "\\\\"); 
//replaces all occurrences of a to e  
System.out.println(path);  
Json
}
}