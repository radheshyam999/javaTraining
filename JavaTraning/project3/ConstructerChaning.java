class ConstructerChaning
  {
    public static void main(String[] args)
     {
       new ConstructerChaning();
         
    }
    ConstructerChaning()
    {
        this(1);
     System.out.println("i am default");
    }  
    ConstructerChaning(int x)
    {
        this(10,20);
        System.out.println("i am Single perameter");
    }
    
    ConstructerChaning(int x,int y) 
    {     
        this(10, 20,30);
        System.out.println("i am  double permrter ");
    }
    
    ConstructerChaning(int x,int y,int z) 
    {
        this(10, 2L);
        System.out.println("i am three");
    }
     ConstructerChaning(int x,float z){
        System.out.println("i am  int and float");
    }
}