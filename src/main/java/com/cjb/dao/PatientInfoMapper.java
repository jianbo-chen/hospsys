package com.cjb.dao;

import com.cjb.pojo.PatientInfo;
import com.cjb.pojo.PatientInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientInfoMapper {
    int countByExample(PatientInfoExample example);

    int deleteByExample(PatientInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatientInfo record);

    int insertSelective(PatientInfo record);

    List<PatientInfo> selectByExample(PatientInfoExample example);

    PatientInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatientInfo record, @Param("example") PatientInfoExample example);

    int updateByExample(@Param("record") PatientInfo record, @Param("example") PatientInfoExample example);

    int updateByPrimaryKeySelective(PatientInfo record);

    int updateByPrimaryKey(PatientInfo record);
}