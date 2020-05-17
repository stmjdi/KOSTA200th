package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBAccessor dba;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String uid=request.getParameter("uid");
		String pwd= request.getParameter("pwd");
		
		PrintWriter pwr = response.getWriter();
		
		try {
			dba=new DBAccessor();
			
			if(dba.findLoginInfo(uid, pwd)) {
//				pwr.println("<html><body>Login Success</body></html>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("successLogin.jsp");
				request.setAttribute("uid",request.getParameter("uid"));
				request.setAttribute("pwd",request.getParameter("pwd"));
				
				dispatcher.forward(request, response);
			}else {
				pwr.println("<html><body>Login Failed</body></html>");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
