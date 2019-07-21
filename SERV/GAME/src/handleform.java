import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 @WebServlet("/handleform")
class handleform extends HttpServlet{

    @Override
    public void service(ServletRequest req,ServletResponse res){
     PrintWriter out;
     String Name,Email,phoneNUmber,password;
        try {
          Name = req.getParameter("fname");
          Email = req.getParameter("Email");
          phoneNUmber = req.getParameter("MobNumber");
          password =  req.getParameter("password");
           out  = res.getWriter();
           out.println("<html><body>");
          out.println("Name:" + Name +" \n"+ "Email: " + Email +"\n");
          out.println("</body></html>");
        } catch(Exception exception_name) {
          exception_name.printStackTrace();
        }

    }

}
