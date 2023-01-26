package com.xworkz.series.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/series")
public class WebSeriesServlet extends HttpServlet {
	
	public WebSeriesServlet() {
	System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init...config..");
}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in WebSeriesServlet");
		System.out.println(Thread.currentThread().getName());
		
		String name=req.getParameter("webseriesName");
		String language=req.getParameter("language");
		String episodes=req.getParameter("episodes");
		String ott=req.getParameter("ott");
		String budget=req.getParameter("budget");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
        PrintWriter writer = resp.getWriter();
        writer.print("<html>");
        writer.print("<body>");
        writer.print("<h1>");
        writer.print("<span style='color:blue;'>");
        writer.print("WebSeries Name " + name + " is sent success");
        writer.print("WebSeries language " + language + " is sent success");
        writer.print("WebSeries episodes " + episodes+ " is sent success");
        writer.print("WebSeries ott " + ott + " is sent success");
        writer.print("WebSeries budget " + budget + " is sent success");
        writer.print("</h1>");
        writer.print("</body>");
        writer.print("</html>");
        resp.setContentType("text/html");
		
}
	@Override
	public void destroy() {
		System.out.println("running destroy in WebSeriesServlet..");
	
}
}

