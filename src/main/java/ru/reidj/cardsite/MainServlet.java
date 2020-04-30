package ru.reidj.cardsite;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("" +
                "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta charset=utf-8>\n" +
                "  <title>Reidj</title>\n" +
                " </head>\n" +
                " <body>\n" +
                " </body>\n" +
                "</html>" +
                "");
    }
}
