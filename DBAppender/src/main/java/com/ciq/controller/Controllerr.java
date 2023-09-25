package com.ciq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllerr {
	public static final Logger log=LoggerFactory.getLogger(Controllerr.class);

	@GetMapping("/hi")
	@ResponseBody
	public String hello() {
		log.info("user logged");
		return "welcome to logger";
		
	}
}
