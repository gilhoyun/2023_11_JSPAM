package com.koreaIT.java.am;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home/gugudan")
public class gugudanServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        String inputDan = request.getParameter("dan");
        String inputLimit = request.getParameter("limit"); 
        
        if(inputDan == null) {
        	inputDan = "1";
        }

        int dan = Integer.parseInt(inputDan);
        int limit = Integer.parseInt(inputLimit);

        response.getWriter().append(String.format(" == %d ==<br />", dan));

        for (int i = 1; i <= limit; i++) {
            response.getWriter().append(String.format("%d * %d = %d<br />", dan, i, dan * i));
        }
    }
}