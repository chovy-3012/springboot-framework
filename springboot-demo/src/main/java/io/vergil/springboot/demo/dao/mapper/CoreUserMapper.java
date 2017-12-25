package io.vergil.springboot.demo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import io.vergil.springboot.demo.dao.model.CoreUser;
import io.vergil.springboot.demo.dao.model.CoreUserExample;

public interface CoreUserMapper {
	int countByExample(CoreUserExample example);

	int deleteByExample(CoreUserExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(CoreUser record);

	int insertSelective(CoreUser record);

	List<CoreUser> selectByExample(CoreUserExample example);

	CoreUser selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

	int updateByExample(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

	int updateByPrimaryKeySelective(CoreUser record);

	int updateByPrimaryKey(CoreUser record);
}