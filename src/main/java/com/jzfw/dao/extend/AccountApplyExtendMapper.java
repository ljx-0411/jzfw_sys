package com.jzfw.dao.extend;

import com.jzfw.bean.AccountApply;
import com.jzfw.dao.AccountApplyMapper;

import java.util.List;

public interface AccountApplyExtendMapper {
   List<AccountApply> pageQuery(int page, int pageSize, String status, String applyType, Long userId, Long beginTime, Long endTime);

   long count(String status, String applyType, Long userId, Long beginTime, Long endTime);
}
