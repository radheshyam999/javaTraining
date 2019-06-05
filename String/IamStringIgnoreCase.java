class IamStringIgnoreCase
{
   public static void main(String... args)
     {
         String s =  "String Imutable";
         String s2  = "string Imutable";
         String s3 =  "Integer Imutable";
         int resul= s2.compareTo(s);
         System.out.println(resul);
         resul =  s2.compareTo(s3);
         System.out.println(resul);
         resul = s.compareToIgnoreCase(s2);   // this woulsd be 0 beuse it is true  //

         System.out.println(resul);
         resul = s2.compareToIgnoreCase(s3);
         System.out.println(resul);
      }
}
