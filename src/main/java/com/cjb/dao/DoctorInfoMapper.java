package com.cjb.dao;

import com.cjb.pojo.DoctorInfo;
import com.cjb.pojo.DoctorInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorInfoMapper {
    int countByExample(DoctorInfoExample example);

    int deleteByExample(DoctorInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoctorInfo record);

    int insertSelective(DoctorInfo record);

    List<DoctorInfo> selectByExample(DoctorInfoExample example);

    DoctorInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoctorInfo record, @Param("example") DoctorInfoExample example);

    int updateByExample(@Param("record") DoctorInfo record, @Param("example") DoctorInfoExample example);

    int updateByPrimaryKeySelective(DoctorInfo record);

    int updateByPrimaryKey(DoctorInfo record);
}