package com.spring.account.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.account.service.AccountService;
import com.spring.account.vo.AccountVO;

public class AccountController extends MultiActionController{
	AccountService accountService;
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		
		return mav;
	}
	
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		String name=session.getAttribute("name")!=null?(String)session.getAttribute("name"):request.getParameter("name");
		if(accountService.isValidName(name)) {
			mav.setViewName("login");
			
			session.setAttribute("name", name);
		} else mav.setViewName("loginFailed");
		
		return mav;
	}
	
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate();
		
		try {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('logout');location.href='index.do'</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		
		String name=(String)session.getAttribute("name");
		int rec = Integer.parseInt(request.getParameter("recent"));
		// 여기서부터 시작 ~~~ //
		int bal = accountService.getBalanceByName(name);
		
		accountService.updateAccount(new AccountVO(name,bal,rec));
		
		try {
			PrintWriter out = response.getWriter();
			out.print("<script>alert('update Successfully!'); location.href='login.do'</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ModelAndView showAccount(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		List<AccountVO> avl = accountService.showAllData();
		
		mav.addObject("accDatas",avl);
		mav.setViewName("show");
		
		return mav;
	}
	
}
