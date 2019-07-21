import java.util.Scanner;

class MyFirstClass{
    static String CName="google";
    int salery=1000;
    String name;
    public static void main(String... args) {
        MyFirstClass refid = new MyFirstClass();
     System.out.println(refid.salery);
     System.out.println(CName);
     
        //refid.polyform(CName, "String");   
    }
        void WhatYouWantCreat(String NameOfShape){
            Scanner input =new Scanner(System.in);
               System.out.println("what do you want to creat");
               NameOfShape = input.nextLine();
               
             


          }


    void polyform(String lsd, String name) {
        System.out.println(lsd);
        System.out.println(name);
    }

    void polyform(int x,int y){
           System.out.println(x);
           System.out.println(y);

         
    }
}

