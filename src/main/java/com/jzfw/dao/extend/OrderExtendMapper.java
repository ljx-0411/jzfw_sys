package com.jzfw.dao.extend;

import com.jzfw.bean.extend.OrderExtend;
import java.util.List;

public interface OrderExtendMapper {
   List<OrderExtend> pageQuery(int page, int pageSize, Long beginTime, Long endTime, String status, Long customerId, Long employeeId);

   long count(Long beginTime, Long endTime, String status, Long customerId, Long employeeId);

   OrderExtend selectById(long id);
}
