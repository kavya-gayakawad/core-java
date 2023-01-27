package com.xworkz.product.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/free")
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("created " +this.getClass().getSimpleName());
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init in server");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in server");
		//System.out.println(Thread.currentThread().getName());
		
		String userName=req.getParameter("userName");
		String userEmail=req.getParameter("userEmail");
		String userMobileNo=req.getParameter("userMobileNo");
		String comments=req.getParameter("comments");
		//Long convertedMobile = Long.parseLong("userMobileNo");
	
		
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userMobileNo);
		System.out.println(comments);
		
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		
		if(userName.length()>3 && userEmail.length()>5 && comments.length() > 5 && userMobileNo.length()==10) {
		writer.print("<span style='color:blue'>");
		writer.print("Sign in  successfully");
		writer.print("</span>");
		}
		else {
		writer.print("<span style='color:red'>");
		writer.print("failed to sign in");
		writer.print("</span>");
			
		}
		
		writer.print("</h1>");
		writer.print("<a href=\"index.html\">Home page</a>");
		writer.print("<br>");
		
	    writer.print("<a href=\"contact.html\">sign up for contact</a>");
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
		
		
		//writer.print("Email " + userEmail +" is sent successfully");
		//writer.print("MobileNo " + userMobileNo +" is sent successfully");
		//writer.print("Comments" + comments +" is sent successfully");
		//writer.print("</span>");
		//writer.print("</h1>");
		//writer.print("</body>");
		//writer.print("</html>");
		//resp.setContentType("text/plain");
		
		
	}
	
	
}
