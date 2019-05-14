package com.nam;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Servlet42")
public class Servlet42 extends HttpServlet {

    private String responseTemplate = "" +
            "<html>\n" +
            "<body>\n" +
            "<h4>RTFM!</h4>\n" +
            "</body>" +
            "</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        this.process(req, resp, "get");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        this.process(req, resp, "post");
    }

    private void process(HttpServletRequest req, HttpServletResponse resp, String param) throws IOException{
        resp.setStatus(200);
        //resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write(responseTemplate + param);
        //PrintWriter pw = resp.getWriter();
        //pw.println("<h1>Hello, world 42!</h1>");
    }
}
