package com.jzfw.dao;

import com.jzfw.bean.CertificationApply;
import com.jzfw.bean.CertificationApplyExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CertificationApplyMapper {
   long countByExample(CertificationApplyExample example);

   int deleteByExample(CertificationApplyExample example);

   int deleteByPrimaryKey(Long id);

   int insert(CertificationApply record);

   int insertSelective(CertificationApply record);

   List<CertificationApply> selectByExample(CertificationApplyExample example);

   CertificationApply selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") CertificationApply record, @Param("example") CertificationApplyExample example);

   int updateByExample(@Param("record") CertificationApply record, @Param("example") CertificationApplyExample example);

   int updateByPrimaryKeySelective(CertificationApply record);

   int updateByPrimaryKey(CertificationApply record);
}
