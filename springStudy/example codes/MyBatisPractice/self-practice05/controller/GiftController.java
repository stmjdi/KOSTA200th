package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.GiftService;
import com.spring.vo.GiftVO;

@Controller
@RequestMapping("/gift")
public class GiftController {
	
	@Autowired
	GiftService giftService;
	
	@RequestMapping(value="/index.do", method=RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping(value="show.do", method=RequestMethod.GET)
	public ModelAndView showList() {
		ModelAndView mav = new ModelAndView();
		
		List<GiftVO> lst = giftService.showAll();
		mav.addObject("list",lst);
		mav.setViewName("show");
		
		return mav;
	}
}
