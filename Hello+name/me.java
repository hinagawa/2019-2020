import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;



    public class My extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
        {
            String name=req.getParameter("name");
            PrintWriter writer =resp.getWriter();
            if(name!=null)
                writer.print("Hello "+name+"!");

            else
                writer.print("Hello anonimous!");
            writer.close();

        }
    }


