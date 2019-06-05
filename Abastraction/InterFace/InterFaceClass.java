//package sdk_II_sdk;

///import java.io.*;
interface r {
  int y = 6; // in interface all varivable are final so you have to initlize it on
             // declarrition tiome //

  abstract void learn(int x);
}

class InterFaceClass implements r {
  public void learn(int x) {
    x = 9;
    System.out.print(x);
  }
  public static void main(String... args) {

    InterFaceClass Acess = new InterFaceClass();
    Acess.learn(y);
  }

 

}
