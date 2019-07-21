 
 class overerding extends overerding1
{
    public static void main(String[] args) {
        System.out.println("null");
      
      overerding r = new overerding();  // i have created new object  to 
      r.lcm();
      r.AcessGam();

    }
    void lcm(){
        
        System.out.println("hey i am lcm ");
        overerding1 r = new overerding();    //  i have created objecetd for overriding 
       // r.AcessGame();
        overerding l = (overerding) r; // it s downcasting here
        //l.display();
        super.AcessGame();
        // l.AcessGame();
    }
    
    void AcessGame() {
      System.out.println("where are you ding");
     
    }


    void display(){
        System.out.println("what is displaying");
    }
}

class overerding1 extends overerding2{
    void AcessGame() {
        System.out.println("parrent class  111");
       // overerding1 r = new overerding1();
        //r.AcessGam();
    }
}

class overerding2 {
    void AcessGame() {
        int x = 8;
        System.out.println(" hey i am overiding 222");
    }
}

class overerding3 {
    void AcessGame() {
        int x = 8;
        System.out.println(" hey i am overiding 333");
    }
}

class overerding4 {
    void AcessGame() {
        int x = 8;
        System.out.println(" hey i am overiding 4444");
    }
}

class overerding5 {
    void AcessGame() {       // i want to  call this method 
        int x = 8;
        System.out.println(" hey i am overiding 5555");
    }
}
