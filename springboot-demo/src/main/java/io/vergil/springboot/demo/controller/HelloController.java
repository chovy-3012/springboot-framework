package io.vergil.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
public class HelloController {

	// thymleaf
	@RequestMapping("/hello")
	public String test(Model model) {
		model.addAttribute("hello", "thymleaf");
		return "hello";
	}

	// swagger
	@ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
	@RequestMapping(value = "swagger2")
	@ResponseBody
	public String swagger2(String id) {
		return "swagger";
	}
}
