package io.vergil.springboot.demo.service;

import org.springframework.stereotype.Service;

import io.vergil.common.base.BaseServiceImpl;
import io.vergil.springboot.demo.dao.mapper.CoreUserMapper;
import io.vergil.springboot.demo.dao.model.CoreUser;
import io.vergil.springboot.demo.dao.model.CoreUserExample;

@Service
public class UserService extends BaseServiceImpl<CoreUserMapper, CoreUser, CoreUserExample> {

}
