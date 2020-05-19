package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class RegisController
 */
@WebServlet("/Regis")
public class RegisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBAccessor dba;
	RequestDispatcher rdp;
	//String[] colNames= {"id","password","name","age","address","email"};
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pwr = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		try {
			dba=new DBAccessor(); rdp=request.getRequestDispatcher("RegisSuccess.jsp");
			Enumeration<String> enm = request.getParameterNames(); // html로부터 직접 속성값들을 얻어올 때 사용, getAttributeNames()는 다른 servlet/jsp로부터 얻어온 속성 값을 받아올 때 사용
			// getAttributeNames : Session에 저장되어 있는 모든 모든 데이터의 이름(유일한 키 값)을 얻어옴
			String[] infos = new String[6]; String str;
			int i=0;
			while(enm.hasMoreElements()) {
				str=enm.nextElement();
				System.out.println(str);
				infos[i] = request.getParameter(str);
				request.setAttribute(str, infos[i]); i++;
			}
			dba.dbInsert(infos);
			
			//response.sendRedirect("regisSuccess.html");
			rdp.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			pwr.println("<html><body>Error page<script>alert('Error: wrong data input')</script></body></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
