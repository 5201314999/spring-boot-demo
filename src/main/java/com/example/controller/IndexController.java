package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/config")
public class IndexController {
	
/*	@Value("${test.msg}")
    private String msg;*/
   	
   	Logger logger=LoggerFactory.getLogger(this.getClass());
	@RequestMapping(value = "/index",produces = "text/plain;charset=UTF-8")
	public String index() {
		//myWebConfig.setName("jiongrong");
	    //System.out.println(msg+"|||"+myWebConfig.getName());
	   // return "The Way 1 : " + msg;
		logger.warn("dev   war 测试");
		logger.error("dev  error 测试");
		return "hello word by jiongrong";
	}

    @Autowired
    private org.springframework.core.env.Environment env;

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index2() {
     /*   System.out.println(env.getProperty("test.msg"));
        return "The Way 2 : " + env.getProperty("test.msg");*/
    	return "hello word by jiongrong";
	}
}
