class FunctionOverLoding{
    int x =20;
    public static void main(String[] args) {
       System.out.println("first cudrent");   
       FunctionOverLoding r = new FunctionOverLoding();
       System.out.println(r);
       r.StartGaming(10);
    }
    void StartGaming(int x){
        
            System.out.println("Anotre function" + x+this.x+this);
            

   
         
    }



}


