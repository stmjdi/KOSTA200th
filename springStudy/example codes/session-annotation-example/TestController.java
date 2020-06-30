package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
@SessionAttributes({"uid"})
public class TestController {
	
	@RequestMapping("/goTest.do")
	public String goTest(Model model) {
		
		return "test1Form";
	}
	
	@RequestMapping("/test2Form.do")
	public String go2Test(@RequestParam("uid") String uid, Model model) {
		model.addAttribute("uid",uid);
		return "test2Form";
	}
	
	@RequestMapping("/test3Form.do")
	public String go3Test(Model model) {
		return "test3Form";
	}
	
	@RequestMapping("/inval.do")
	public ModelAndView inval(SessionStatus sessionStatus) {
		ModelAndView mav = new ModelAndView();
		sessionStatus.setComplete();
		mav.setViewName("redirect:goTest.do");
		
		return mav;
	}
	
	@RequestMapping("/lastCheck.do")
	public String lastCheck(@SessionAttribute String uid, Model model) { // session key name과 변수 이름이 일치해야함!
		if("ssssuu".equals(uid)) return "lastCheck";
		else return "redirect:inval.do";
	}
}
