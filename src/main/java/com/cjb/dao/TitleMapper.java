package com.cjb.dao;

import com.cjb.pojo.Title;
import com.cjb.pojo.TitleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TitleMapper {
    int countByExample(TitleExample example);

    int deleteByExample(TitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    Title selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByExample(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}