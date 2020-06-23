package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.MemberService;
import com.spring.vo.MemberVO;

@Controller("memberController")
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/result.do", method=RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("mem") MemberVO mv, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		
		if(memberService.isValidIdf(mv.getId(), mv.getPwd())) {
			mav.setViewName("result");
		} else mav.setViewName("loginFailed");
		
		return mav;
	}
	
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String result(Model model) {
		return "login";
	}
}




