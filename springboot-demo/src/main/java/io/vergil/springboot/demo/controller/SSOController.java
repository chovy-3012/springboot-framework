package io.vergil.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.vergil.common.base.BaseResult;

@Controller
public class SSOController {

	@RequestMapping("login")
	@ResponseBody
	public Object login(String username, String password) {
		return new BaseResult(200, "123", "123");
	}

	@RequestMapping("go")
	public String go() {
		return "";
	}
}
