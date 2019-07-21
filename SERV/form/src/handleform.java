import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
import java.io.*;
// @WebServlet("/handleform")
public class handleform extends HttpServlet{

    @Override
    public void service(HttpServletRequest req,HttpServletResponse res){
     PrintWriter out;
    // String Name,Email,phoneNUmber,password;
        try {
          res.setContentType("text/html");
        String  Name = req.getParameter("Name");
        String  Email = req.getParameter("Email");
        String  phoneNumber = req.getParameter("MobNumber");
        String  password =  req.getParameter("password");

           out  = res.getWriter();
            out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Servlet TestUpdateDBServlet</title>");
             out.println("</head>");
             out.println("<body>");
             out.println("<h1> your Name is: "+Name+"</h1>");
             out.println("<h1> your Email is: "+ Email +"</h1>");
             out.println("<h1> your Number is: " + phoneNumber + "</h1>");
            out.println("<h1> your Name is: "+password+"</h1>");
             out.println("</body>");
            out.println("</html>");
        } catch(Exception exception_name) {
          exception_name.printStackTrace();
        }

    }

}
