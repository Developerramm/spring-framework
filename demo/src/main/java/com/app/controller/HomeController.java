package com.app.controller;



import java.util.Date;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		Date date = new Date();
		ModelAndView modelAndView = new ModelAndView("home","currentDate",date);
		return modelAndView;
	}

}
