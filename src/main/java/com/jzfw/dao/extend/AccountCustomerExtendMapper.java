package com.jzfw.dao.extend;

import com.jzfw.bean.AccountCustomer;
import java.util.List;

public interface AccountCustomerExtendMapper {
   List<AccountCustomer> pageQuery(int page, int pageSize, String status, String type, Long beginTime, Long endTime, Long userId);

   long count(String status, String type, Long beginTime, Long endTime, Long userId);
}
