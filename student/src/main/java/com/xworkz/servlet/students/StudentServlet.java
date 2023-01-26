package com.xworkz.servlet.students;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/college")
public class StudentServlet extends HttpServlet {
	
	public StudentServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init...config..");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in StudentServlet...");
		System.out.println(Thread.currentThread().getName());
		String name = req.getParameter("studentName");
		String lastName = req.getParameter("lastName");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		String collegeName = req.getParameter("collegeName");
		String sem = req.getParameter("sem");
		String studentId = req.getParameter("Id");
		String marks = req.getParameter("marks");
		String percentage = req.getParameter("percentage");
		String grade = req.getParameter("grade");
		String dateOfBirth = req.getParameter("dateOfBirth");
		String aadharNo = req.getParameter("aadharNo");
		String bloodGroup = req.getParameter("bloodGroup");
		String mobileNo = req.getParameter("mobileNo");
		String emailId = req.getParameter("emailId");
		String pinCode = req.getParameter("pinCode");
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(collegeName);
		System.out.println(sem);
		System.out.println(studentId);
		System.out.println(marks);
		System.out.println(percentage);
		System.out.println(grade);
		System.out.println(dateOfBirth);
		System.out.println(aadharNo);
		System.out.println(bloodGroup);
		System.out.println(mobileNo);
		System.out.println(emailId);
		System.out.println(pinCode);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red;'>");
		writer.print("Student Name " + name+ " is sent success");
		writer.print("Student LastName " + lastName + " is sent success");
		writer.print("Student Age " + age + " is sent success");
		writer.print("Student Gender " + gender + " is sent success");
		writer.print("Student City " + city + " is sent success");
		writer.print("Student State " + state + " is sent success");
		writer.print("Student Country " + country+ " is sent success");
		writer.print("Student CollegeName " + collegeName + " is sent success");
		writer.print("Student Sem " + sem + " is sent success");
		writer.print("Student StudentId " + studentId + " is sent success");
		writer.print("Student Marks" + marks + " is sent success");
		writer.print("Student Percentage " + percentage + " is sent success");
		writer.print("Student Grade " + grade + " is sent success");
		writer.print("Student DateOfBirth " + dateOfBirth + " is sent success");
		writer.print("Student AadharNo " + aadharNo+ " is sent success");
		writer.print("Student BloodGroup " + bloodGroup + " is sent success");
		writer.print("Student MobileNo " + mobileNo + " is sent success");
		writer.print("Student EmailId " + emailId+ " is sent success");
		writer.print("Student PinCode " + pinCode + " is sent success");
		
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
		
	}
	@Override
	public void destroy() {
		System.out.println("running destroy in StudentServlet");

		
	}
	
	   
		
		
		
		
	}
	

