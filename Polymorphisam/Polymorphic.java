class Polomorphic
     {     //  class level varible  
        int x =5;
        
        int y= 6;
         public static void main(String[] args) {
             new Polomorphic();
          // Polomorphic r=  new Polomorphic();
               //new Polomorphic(r);    
         }



         Polomorphic(){
         int x =9;   // data sadawing is happning here
         // if we have to remove data shadowing  so need to use  this key word //
            System.out.println("local varibale " + x);
            System.out.print("Acess class Level Variable\n X=" + this.x +" \n Y=" + this.y);

         }
     }