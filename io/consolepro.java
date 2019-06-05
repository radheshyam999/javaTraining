import java.io.*;
class consolepro 
       {
           public static void main(String[] args)
            {
               try {
                  consolepro.show(); 
               } catch (Exception e) {
                  e.printStackTrace();
               }
                
           }
           static void show() throws IOException
           {
               Console c = System.console();
               System.out.print("Enter something");
               String s2  =c.readLine("enter some name %char",5);
               c.printf("%s enter password",s2);
               char ch[]=c.readPassword();
               char ch1[]= c.readPassword("Enter password", ("%char"),5);
               for (char x : ch) {
                 System.out.print(x);  
               }
               for (char y : ch1) {
                 System.out.print(y);   
               }
               Reader r = c.reader();
               int x= r.read();
System.out.println(x);
PrintWriter print = c.writer();
print.println(s2);
           }
       }