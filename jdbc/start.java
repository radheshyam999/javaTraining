import java.sql.*;
 class start {
  public static void main(String[] args) {
     try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htmljdbc","root","2431923r");
        Statement st = con.createStatement();
        ResultSet data = st.executeQuery("select * from persons");
        //System.out.print(data);
        while(data.next())  {
        System.out.println(data.getInt(1)+"  "+data.getString(2)+"  "+data.getString(3));
          }

          DatabaseMetaData dbmd = con.getMetaData();
          System.out.println("catlog :" + dbmd.getCatalogs());
          System.out.println(" URL IS "+dbmd.getURL());
          System.out.println("URL "+dbmd.getClass());
          System.out.println(" getSchemas"+dbmd.getSchemas());
          System.out.println(" colmns"+dbmd.getMaxColumnsInTable());
          System.out.println("System" + dbmd.getSystemFunctions());
          System.out.println(dbmd.getSQLKeywords());
          st.executeUpdate("DROP TABLE cust_tbl");
      con.close();
      }
catch(Exception exception_name) {
       exception_name.printStackTrace();
     }

  }
}
