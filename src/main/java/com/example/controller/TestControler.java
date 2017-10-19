package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/jj")
public class TestControler {
   @RequestMapping(value="/index")
   String index(){
	   return "test";
   }
}
