import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends javax.servlet.http.HttpServlet{

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {

    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null)
            session.setAttribute("count", 1);
            else
            session.setAttribute("count", count+1);
            count = (Integer) session.getAttribute("count");

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1> Hello "+name+" "+surname+"!From second servlet. Your count is"+count+" </h1>");// h1 - тэг заголовка
        pw.println("<a href=\"second-jsp\">Click here to see second-jsp</a>");
        pw.println("</body>");
        pw.println("</html>");


    }
}
