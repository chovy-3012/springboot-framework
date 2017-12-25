package io.vergil.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vergil.springboot.demo.dao.mapper.CoreUserMapper;
import io.vergil.springboot.demo.dao.model.CoreUser;
import io.vergil.springboot.demo.dao.model.CoreUserExample;

@RestController
public class TestController {
	@Autowired
	private CoreUserMapper coreUserMapper;

	@RequestMapping("/test")
	public String test() {
		List<CoreUser> selectByExample = coreUserMapper.selectByExample(new CoreUserExample());
		return selectByExample.toString();
	}
}
