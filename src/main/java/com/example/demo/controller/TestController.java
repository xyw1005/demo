package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author XiaoWu
 * @date   2019.05.06 11:58
 */
@Controller
public class TestController {
	@RequestMapping("/index")
	@ResponseBody
	public String queryUser() {
		return "hello world!";
	}
}
