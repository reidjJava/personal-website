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
                "  <style>\n" +
                "    body {\n" +
                "      background: #c7b39b url(images/fon.png);\n" +
                "    }\n" +
                "  </style>" +
                " <p>\n" +
                " <a href=\"https://vk.com/reidj\"><img src=images/vk.png height=\"100\" style=\"position:absolute; left: 880px; top: 450px;\"></a>\n" +
                " </p>\n" +
                " <p>\n" +
                " <a href=\"https://steamcommunity.com/id/soezsorry/\"><img src=images/steam.png height=\"67\" style=\"position:absolute; left: 1010px; top: 466px;\"></a>\n" +
                " </p>\n" +
                " <p>\n" +
                " <a href=\"https://github.com/Reidj3/\"><img src=images/github.png height=\"75\" style=\"position:absolute; left: 835px; top: 466px;\"></a>\n" +
                " </p>\n" +
                " </body>\n" +
                "</html>" +
                "");
    }
}
