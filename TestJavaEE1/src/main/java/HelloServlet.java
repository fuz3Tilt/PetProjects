import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        //httpServletResponse.sendRedirect("https://ya.ru");
        PrintWriter pw = httpServletResponse.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1> hs</h1>");// h1 - тэг заголовка
        pw.println("<a href=\"https://ya.ru\">Click here to see yandex</a>");
        pw.println("</body>");
        pw.println("</html>");
        //RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/second-jsp/test");
        //requestDispatcher.forward(httpServletRequest, httpServletResponse);
        //всё что выше, выдаёт содержимое указанного по юрл файла, но при это не меняет изначальный юрл
        //буд-то ответ был получен от сервлета(в данном случае), хотя это не так.
    }
}