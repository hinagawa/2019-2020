
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class JJs extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("login");
        String b=req.getParameter("password");

        PrintWriter pw = resp.getWriter();
        pw.print(a);

                if (a.equals(b))
                    pw.print("\n" +
                            "<html>\n" +
                            "<head>\n" +
                            "    <title>Success</title>\n" +
                            "</head>\n" +
                            "<style>\n" +
                            "    body{\n" +
                            "        background:linear-gradient(to right,#6c9448,#ffe884);\n" +
                            "    }\n" +
                            "    p{\n" +
                            "        color:white;\n" +
                            "        font-size: 100px;\n" +
                            "position: absolute;\n" +
                            "top:200px;\n" +
                            "left:700px;\n" +
                            "    }\n" +
                            "</style>\n" +
                            "<body>\n" +
                            "<div>\n" +
                            "    <p>Ok</p>\n" +
                            "</div>\n" +
                            "</body>\n" +
                            "</html>\n");

          else
             req.getRequestDispatcher("index.jsp").forward(req, resp);


    }
}

