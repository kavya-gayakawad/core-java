package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/call")
public class FastrackServlet extends HttpServlet{
	
	public FastrackServlet() {
		System.out.println("craeted."+this.getClass().getSimpleName());
		
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
	System.out.println("Running FastrackServlet in server");
}


}
