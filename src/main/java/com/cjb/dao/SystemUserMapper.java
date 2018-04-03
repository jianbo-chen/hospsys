package com.cjb.dao;

import com.cjb.pojo.SystemUser;
import com.cjb.pojo.SystemUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemUserMapper {
    int countByExample(SystemUserExample example);

    int deleteByExample(SystemUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    List<SystemUser> selectByExample(SystemUserExample example);

    SystemUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByExample(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);
}