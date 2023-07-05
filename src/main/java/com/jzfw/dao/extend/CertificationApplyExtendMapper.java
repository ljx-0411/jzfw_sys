package com.jzfw.dao.extend;

import com.jzfw.bean.CertificationApply;
import java.util.List;

public interface CertificationApplyExtendMapper {
   List<CertificationApply> pageQuery(int page, int pageSize, String status, Long userId, Long beginTime, Long endTime);

   long count(String status, Long userId, Long beginTime, Long endTime);
}
