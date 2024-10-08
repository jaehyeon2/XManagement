package com.example.project.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value={"/", "", "/index"}, method=RequestMethod.GET)
	public String index() throws Exception {
    	
    	
		return "user/index";
	}

}