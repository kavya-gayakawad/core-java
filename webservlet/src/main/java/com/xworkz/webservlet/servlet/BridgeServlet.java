package com.xworkz.webservlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/call")
public class BridgeServlet extends HttpServlet {
	
	public BridgeServlet() {
		System.out.println("created."+this.getClass().getSimpleName());
	}
	//@Override
	//public void init(ServletConfig config) throws ServletException {
	//	System.out.println("running init of BridgeServlet...");
		//init properties of servlet
	//}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get from bridge");
		String data="displaying data as get";
		PrintWriter writer =resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post from bridge");
		String data="car race, then !! curd rice !!, egg rice";
		PrintWriter writer =resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("put from bridge");
		String data="displaying doPut method";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		
	}
		
    @Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("delete from bridge");
		String data="displaying doDelete method";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
    }
		

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println("running doPatch Method");
    	String data="displaying doPatch method";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		

    }
    @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println("running doTrace Method");
    	String data="displaying doTrace method";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		
}
    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println("running doOptions Method");
    	String data="displaying doOptions method";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		
}
}

	



