import java.io.File;



class CheckListofdir
{
 public static void main(String[] args) throws Exception
 {
    
    File checkFile =new File("C:\\");
   String [] s =checkFile.list();
 
   int i=0; 
    for(i=0; i<=s.length; i++){
        
  System.out.println(s[i]);
    }
 }   
}