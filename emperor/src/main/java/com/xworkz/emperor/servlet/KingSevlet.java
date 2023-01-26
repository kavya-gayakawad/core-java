package com.xworkz.emperor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/prince")
public class KingSevlet extends HttpServlet {
	
	public KingSevlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init...config..");
}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in KingServlet");
		System.out.println(Thread.currentThread().getName());
		
		String name = req.getParameter("kingName");
		String region = req.getParameter("region");
		String queens = req.getParameter("noOfQueens");
		String dateOfBirth = req. getParameter("dateOfBirth");
		String dateOfDeath = req.getParameter("dateOfDeath");
				
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(dateOfBirth);
		System.out.println(dateOfDeath);
		
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("King Name "+ name + " is sent success");
		writer.print("King region "+ region + " is sent success");
		writer.print("King noOfQueens "+ queens + " is sent success");
		writer.print("King dateOfBirth "+ dateOfBirth + " is sent success");
		writer.print("King dateOfDeath "+ dateOfDeath + " is sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
	}
	@Override
	public void destroy() {
		System.out.println("running destroy in KingServlet..");
		




		
		
		

		
		
}
}



