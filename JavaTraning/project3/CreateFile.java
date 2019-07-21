import java.io.File;
import java.io.IOException;

class CreateFile
{
    public static void main(String[] args)throws IOException  
     {  int i=0;
         String []fie= new String[]{"BufferedReader.java","BufferedWriter.java"};
       // i am create here instanec of  file 
         File Createf = new File(fie[i]);
       System.out.println(Createf.exists()); 
          while(i<=fie.length){
              
     Createf.createNewFile();  // creating file here
       
          }

    
  
    }



}