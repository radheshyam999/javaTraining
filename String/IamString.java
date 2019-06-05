class IamString
{
  public static void main(String[] args) {
   IamString r =  new IamString();
   r.show();
  }




  void show()
  {
      String s = new String("hello world");
       ///System.out.print("hello".length());
       String s1 = s.intern();
       String s2 = new String("hello world");
       String s3 = s2.intern();
       if(s1==s2)
       {
         System.out.print("we are equal");
       }
       else
       {
          System.out.println("we are not equal");
       }
  }
}
