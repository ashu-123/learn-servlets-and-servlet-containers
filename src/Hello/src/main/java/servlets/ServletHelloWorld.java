package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;


import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import java.util.Locale;

@WebServlet("/hi")
public class ServletHelloWorld extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
					response.getWriter().println("Hello World!");
	}

}
