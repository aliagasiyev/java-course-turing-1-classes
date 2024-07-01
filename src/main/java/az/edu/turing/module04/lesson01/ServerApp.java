package az.edu.turing.module04.lesson01;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9000);
        System.out.println("Starting server");

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        context.addServlet(new ServletHolder(new InfoServlet()), "/");
        context.addServlet(new ServletHolder(new InfoServlet()), "/me");
        context.addServlet(new ServletHolder(new InfoServlet()), "/greetings?name");


        System.out.println("Server started");
        server.start();
        server.join();
    }
}
