package io.vergil.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.vergil.springboot.demo.dao.model.CoreUser;
import io.vergil.springboot.demo.dao.model.CoreUserExample;
import io.vergil.springboot.demo.service.UserService;

@Controller("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/list")
	public String userList(Model model) {
		List<CoreUser> selectByExample = userService.selectByExample(new CoreUserExample());
		model.addAttribute("list", selectByExample);
		return "user/index";
	}
}
