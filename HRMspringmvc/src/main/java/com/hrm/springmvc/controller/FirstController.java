package com.hrm.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping(value="/")
	public String init(HttpServletRequest request,HttpServletResponse response) {
	String viewpage="Home";
	return viewpage;
	}

}
