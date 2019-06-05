class IamStringThree
{
public static void main(String[] args)
 {
   byte g[]= {65,68,67,89,23,25};    //  it will convert this number to  string
   String str = new String(g);
   System.out.println(str);
   String str1 = new String(g, 0,2);
   System.out.println(str1);
}
}
