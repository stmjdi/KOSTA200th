package kosta.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServer
 */
@WebServlet("/login5")
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String uid = request.getParameter("user_id");
		String pwd = request.getParameter("user_pw");
		String uadd = request.getParameter("user_address");
		
		PrintWriter pwr = response.getWriter();
		
		pwr.println("<html><head><meta charset='utf-8'><title>server page</title></head>");
		pwr.println("<body>ID: "+uid+"<br>");
		pwr.println("Password: "+pwd+"<br>");
		pwr.println("Address: "+uadd+"<br>");
		pwr.println("</body></html>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
