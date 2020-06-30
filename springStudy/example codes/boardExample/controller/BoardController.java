package com.spring.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.BoardService;
import com.spring.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardService bs;
	
	@RequestMapping("/listForm.do")
	public ModelAndView listForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("brdList",bs.showList());
		mav.setViewName("listForm");
		
		return mav;
	}
	
	@RequestMapping("/uploadForm.do")
	public String uploadForm(Model model) {
		
		return "uploadForm";
	}
	
	@RequestMapping("/upload.do")
	public ModelAndView upload(@ModelAttribute BoardVO bv) {
		ModelAndView mav = new ModelAndView();
		
		bs.uploadNewBoard(bv);
		mav.setViewName("redirect:listForm.do");
		
		return mav;
	}
	
	@RequestMapping("/detailForm.do")
	public ModelAndView detailForm(@RequestParam HashMap<String,String> hm) {
		ModelAndView mav = new ModelAndView();
		
		BoardVO brd = bs.showDetail(hm.get("title"), hm.get("username"));
		
		mav.addObject("brd",brd);
		mav.setViewName("detailForm");
		
		return mav;
	}
	
}
