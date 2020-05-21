package testpack;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncoderFilter
 */
@WebFilter("/servv")
public class EncoderFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		request.setCharacterEncoding("utf-8");
		
		long begin=System.currentTimeMillis();
		// pass the request along the filter chain
		// chain을 기준으로 위 코드들이 요청필터
		chain.doFilter(request, response);
		// chain을 기준으로 아래 코드들이 응답필터 _ log를 남기거나 디버깅용??
		long end=System.currentTimeMillis();
		System.out.println("작업 시간 : "+(begin-end) + "ms");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
