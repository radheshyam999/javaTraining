import  java.sql.*;
import java.util.*;
public class GameHml{

            public static void main(String[] args) {
            Scanner TakeInput = new Scanner(System.in);
            System.out.print("UserName :");
            String UserName = TakeInput.nextLine();
            System.out.print("Password");
            String Password = TakeInput.nextLine();

            GameHml letConn = new GameHml();
            Connection fcon = letConn.connectMysql(UserName,Password);
            System.out.println(fcon);

        }


Connection connectMysql(String UserName,String Password){
            Connection con = null;
            try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/htmljdbc",UserName,Password);
            DatabaseMetaData dbmd=con.getMetaData();
            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

          }
          catch(Exception e){
            e.printStackTrace();
          }
return con;
        }


}
