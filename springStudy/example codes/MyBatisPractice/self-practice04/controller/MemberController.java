package com.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.MemberService;
import com.spring.vo.MemberVO;

@Controller("memberController")
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/result.do", method=RequestMethod.GET)
	public ModelAndView result(@ModelAttribute("mem") MemberVO mv, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		
		if(memberService.isValidIdf(mv.getId(), mv.getPwd())) {
			mav.setViewName("result");
		} else mav.setViewName("loginFailed");
		
		return mav;
	}
	
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/regisForm.do", method=RequestMethod.GET)
	public String regisForm(Model model) {
		return "regisForm";
	}
	
	@RequestMapping(value="/regis.do", method=RequestMethod.GET)
	public void register(@RequestParam Map<String,String>mp, HttpServletRequest request, HttpServletResponse response) {		
		try {
			PrintWriter out = response.getWriter();
			if (memberService.regisMember(mp.get("regid"), mp.get("regpwd"))) {
				out.print("<script>alert('Register Success'); location.href='login.do'</script>");
			} else {
				out.print("<script>alert('already used ID');location.href='regisForm.do'</script>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


