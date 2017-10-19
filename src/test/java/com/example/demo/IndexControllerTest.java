package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.example.config.MyWebConfig;


public class IndexControllerTest {
	   @Value("${test.msg}")
	    private String msg;

	    @Autowired
	    private MyWebConfig myWebConfig;

	    @Test
	    public void test() throws Exception {
	        System.out.println("=中文=="+msg);
	        System.out.println("=="+myWebConfig.getName());
	    }
}
