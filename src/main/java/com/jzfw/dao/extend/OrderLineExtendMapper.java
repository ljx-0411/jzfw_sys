package com.jzfw.dao.extend;

import com.jzfw.bean.OrderLine;
import java.util.List;

public interface OrderLineExtendMapper {
   List<OrderLine> selectByOrderId(Long orderId);
}
