package com.jzfw.dao.extend;

import com.jzfw.bean.AccountEmployee;
import java.util.List;

public interface AccountEmployeeExtendMapper {
   List<AccountEmployee> pageQuery(int page, int pageSize, String status, String type, Long beginTime, Long endTime, Long userId);

   long count(String status, String type, Long beginTime, Long endTime, Long userId);
}
