package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.config.MyWebConfig;

@RestController
@SpringBootApplication
@ComponentScan(basePackages={"com.example"})  
public class SpringBootDemoApplication {
	
	org.slf4j.Logger log=LoggerFactory.getLogger(SpringBootDemoApplication.class);
	
	@Value("${test.msg}")
    private String msg;
	
	@Autowired
	private MyWebConfig myWebConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	  String index(){
		log.error("测试logback");
        return "Hello Spring Boot!"+msg+myWebConfig.getName();
    } 
}
