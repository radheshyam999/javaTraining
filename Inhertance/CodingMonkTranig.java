class CodingMonkTraning extends CodingMonkTraning1
{
    public static void main(String[] args) {
      CodingMonkTraning r = new CodingMonkTraning();
      r.StartGaming();  
    }
    void StartGaming(){
    lsd();   //  i am diricitly  calling method  form another anoter class 
    }
}


class CodingMonkTraning1
{

    void lsd(){
        System.out.println("What is your hurt Sayaing");
    }
}