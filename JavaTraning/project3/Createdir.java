import java.io.File;

class Creatdir
    {

    public static void main(String[] args) {
       File mk = new File("java"); // creating inctnce of file 
       mk.mkdir();
       System.out.print(mk.exists());   // here i  checking that dir is avaliable or not 
    }


    }