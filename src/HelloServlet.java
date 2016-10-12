import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Администратор on 12.10.2016.
 */

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.write("<html>");
        pw.write("<head>");
        pw.write("<title>HelloServlet</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>HelloServlet</h1>");
        pw.write("</body>");
        pw.write("</html>");
    }
}
