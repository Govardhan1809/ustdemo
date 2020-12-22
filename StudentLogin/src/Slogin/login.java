package Slogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class login extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("userName");
		String pass = request.getParameter("userPassword");
		
		if(user.equals("Govardhan") && pass.equals("Go")) {
			pw.println("Login is Success.....");}
		
		else {
			pw.println("alert('Invalid Username or Password');");
			pw.println("Login is Failed.....");
		pw.close();
		}

}}
