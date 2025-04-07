import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class XSSExampleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String name = request.getParameter("name"); // No input sanitization
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>Welcome " + name + "</body></html>");
    }
}
