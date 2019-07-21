import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
public class startlink {
public static void main(String[] args) {
  String name,fullname;
  Scanner Takeinput = new Scanner(System.in);
  LinkedList<emp> link = new LinkedList<>();
  while(true){
   name = Takeinput.nextLine();
  fullname = Takeinput.nextLine();

if(name.equalsIgnoreCase("exit")) {
  if(link.isEmpty()) {
    System.out.println("emapty");
  }
  else {
    for(emp e:link){
      System.out.print(e.name +e.fullname+"\t");
    }
  }

  System.exit(0);

}
else{

  System.out.println("size is"+link.size());
  link.add(new emp(name, fullname));
}
}
}
}
class emp{
  public String name;
  public String fullname;
  emp(String name,String fullnme)
    {
     this.name = name;
     this.fullname =fullnme;
    }
}
