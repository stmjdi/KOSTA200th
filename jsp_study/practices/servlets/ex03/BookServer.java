package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.util.*;
import java.io.*;
import com.kosta.visitors.*;
import java.sql.*;

/**
 * Servlet implementation class BookServer
 */
@WebServlet("/BookServer")
public class BookServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookDAO bd;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		bd=new BookDAO();
		Enumeration<String> enm = request.getParameterNames();
		
		PrintWriter pwr = response.getWriter();
		
		String[] strs = new String[5]; int i=0;
		while(enm.hasMoreElements()) {
			strs[i++]=request.getParameter(enm.nextElement());
		}
		try {
			bd.insert(strs);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/guestBook.jsp");

			request.setAttribute("fromServer", bd.select());
			dispatcher.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
