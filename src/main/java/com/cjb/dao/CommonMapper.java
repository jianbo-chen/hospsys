package com.cjb.dao;

import com.cjb.pojo.Common;
import com.cjb.pojo.CommonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonMapper {
    int countByExample(CommonExample example);

    int deleteByExample(CommonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Common record);

    int insertSelective(Common record);

    List<Common> selectByExample(CommonExample example);

    Common selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Common record, @Param("example") CommonExample example);

    int updateByExample(@Param("record") Common record, @Param("example") CommonExample example);

    int updateByPrimaryKeySelective(Common record);

    int updateByPrimaryKey(Common record);
}