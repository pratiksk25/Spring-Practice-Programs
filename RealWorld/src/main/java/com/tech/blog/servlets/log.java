package com.tech.blog.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;


@WebServlet("/log")
public class log extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public log() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet LoginServlet</title>");
			out.println("</head>");
			out.println("<body>");
			//login
			//	fetch username and password from request
			
			String userEmail = request.getParameter("email");
			String userPassword = request.getParameter("password");
			
			UserDao dao = new UserDao(ConnectionProvider.getConnection());
			
			User u = dao.getUserByEmailAndPassword(userEmail, userPassword);
			
			if(u == null)
			{
				out.println("Invalid details. Try Again...");
			}
			else
			{
				HttpSession s = request.getSession();
				s.setAttribute("currentUser", u);
				response.sendRedirect("profile.jsp");
			}
		
			out.println("</body>");
			out.println("</html>");
			
		}
		
	}

}
