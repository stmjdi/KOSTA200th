package com.spring.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.dao.MemberDAO;
import com.spring.vo.MemberVO;

public class MemberController extends MultiActionController{
	MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("inputForm");
		
		return mav;
	}
	
	public ModelAndView show(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("loginFailed");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		List<MemberVO> memList = memberDAO.showInfo();
		for(int i=0;i<memList.size();i++) {
			if(memList.get(i).getId().equals(id) && memList.get(i).getPwd().equals(pwd)) {
				mav.addObject("id", id);
				mav.addObject("pwd", pwd);
				HttpSession sessionHttp = request.getSession();
				sessionHttp.setAttribute("id", id);
				mav.setViewName("result");
			}
		}
		
		return mav;
	}
	
	public ModelAndView regisForm(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("regisForm");
		return mav;
	}
	
	public void regis(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String id = request.getParameter("regisid");
		String pwd = request.getParameter("regispwd");
		
		System.out.println(memberDAO.regisMember(new MemberVO(id,pwd)) + " inserted");
		
		response.sendRedirect("login.do");
	}
	
	public ModelAndView leaveForm(HttpServletRequest requeset, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("leaveForm");
		return mav;
	}
	
	public void dropOut(HttpServletRequest request, HttpServletResponse response) throws Exception{
		HttpSession sessionHttp = request.getSession();
		
		String id = (String)sessionHttp.getAttribute("id");
		String pwd = request.getParameter("delpwd");
		
		List<MemberVO> l = memberDAO.showInfo();
		for(int i=0;i<l.size();i++) {
			if(l.get(i).getId().equals(id) && l.get(i).getPwd().equals(pwd)) {
				
				System.out.println(memberDAO.leaveMember(id)+" deleted");
				sessionHttp.invalidate();
				response.sendRedirect("login.do");
				return;
			}
		}
		
		response.sendRedirect("regisFail.do"); // need to modify
	}
	
	public ModelAndView regisFail(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("regisFail");
		return mav;
	}
}





