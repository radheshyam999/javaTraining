class NesetedClass
{
     //  static  class  //
 public static void main(String[] args) {
      
        System.out.println("printf i am   main ");
        
        //NesetedClass o = NesetedClass();
        NesetedClass.InnerNesetedClass r =new  NesetedClass.InnerNesetedClass();
    r.show();
  
   //InnerNesetedClass.show();
      
        System.out.println("printf i am   main ");
        
       // NesetedClass o = NesetedClass();
     //InnerNesetedClass r = o.InnerNesetedClass();
     //show();
   }
   
   /**
    * InnerNesetedClass
    */
    static class InnerNesetedClass {
  
       void show()
       {
            System.out.println("printf i am inner class ");
       }
   }

}