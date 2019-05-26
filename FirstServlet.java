import javax.servlet.http.HttpServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletContext;
import java.io.PrintWriter;
import java.io.IOException;
public class FirstServlet extends HttpServlet
{
public void service(ServletRequest request,ServletResponse response)throws IOException
{
ServletContext context=getServletContext();
String sno=context.getInitParameter("sno");
String sname=context.getInitParameter("sname");
PrintWriter out=response.getWriter();
response.setContentType("text/html");
out.println("rollno"+sno+"</br>");
out.println("rollno"+sname+"</br>");
context.setAttribute("email","abcd@gmail.com");
context.setAttribute("mobno","9000876544");
}
}