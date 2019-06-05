class Startpoly
{     ///  consuster calling them selve  for that we have to use    this() keword
    public static void main(String...arg)
    {
        System.out.print("Hey i am main  ");
         Startpoly r = new Startpoly();
         r.callCouns();
    }
       void callCouns()
       {

       new Startpoly();
  
  
    }
  
   Startpoly(){
       this(1);
    System.out.println("Do want to die today  ");

   }
   Startpoly(int x){
     this(2,2,3);
    System.out.println("Hey i m int i dont want to die ");
   }


   Startpoly(int x, int y, int l ){
         this(2,"ch");
       System.out.println("Hey i am int int int  i Want to die ");
   }
   Startpoly(int x , String v){
     
        System.out.println("int float  died ");
   }


}