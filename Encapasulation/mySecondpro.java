class mySecondpro{
    private String car="volov";
    private int number= 8;
    
    public void setCar(String car) {
        this.car = car;
    }
 /**
  * @return the car
  */
 public String getCar() {
     return car;
 }
 public void setNumber(int number)
{
 this.number =number;



} 
public int getNumber(){
    
    return number;
}

public static void main(String... ar)
    {
        mySecondpro Acess2 = new mySecondpro();
     
    System.out.println(Acess2.getCar());
     System.out.print(Acess2.getNumber());


    }

}