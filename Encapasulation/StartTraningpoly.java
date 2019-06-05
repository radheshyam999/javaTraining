class StartTraningpoly
{
  private String Name="Radheshyam";
  private int Pin = 1234;
  
  public String getName() {
      return Name;
  }
  public int getPin(){    // geting  value of pin  here 

      return Pin;
  }
  void ShowPoly()
  {  String x = getName();      ///   assgning  name x varibale 
     int pin = getPin(); 
    System.out.print( "Name is \t" + x + "\n Pin is \t" + pin );
  }



  public static void main(String...args)
  {  String l;
    
      StartTraningpoly r = new StartTraningpoly();
        
        
        
       r.ShowPoly();
  }
}
