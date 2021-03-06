package com.spring.controller;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.BoardVO;
import com.spring.service.BoardService;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	@Inject
	private BoardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "board/board";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception{
		logger.info("register get...!!");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(BoardVO board, Model model) throws Exception{
		logger.info("register post...!!");
		logger.info(board.toString());
		
		service.regist(board);
		model.addAttribute("result", "success");
		
//		return "board/success";
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		logger.info("show all list.....");
	}
	
}
