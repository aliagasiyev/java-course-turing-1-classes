package az.edu.turing.module04.lesson01;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");

        String path = req.getServletPath();
        String responseMessage;

        if (path.equals("/")) {
            responseMessage = "Hello World\n";
        } else if (path.equals("/me")) {
            responseMessage = "Name Surname\n";
        } else if (path.equals("/greetings")) {
            String name = req.getParameter("name");
            if (name == null) {
                responseMessage = "Greetings!\n";
            } else {
                responseMessage = "Greetings, ";
            }
        } else {
            responseMessage = "Unknown path\n";
        }

        resp.getWriter().write(responseMessage);
    }
}
