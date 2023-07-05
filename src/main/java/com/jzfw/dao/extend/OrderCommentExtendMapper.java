package com.jzfw.dao.extend;

import com.jzfw.bean.OrderComment;
import java.util.List;

public interface OrderCommentExtendMapper {
   List<OrderComment> pageQuery(int page, int pageSize, String content, String status, Long orderId);

   long count(String content, String status, Long orderId);

   List<OrderComment> selectByOrderId(long id);
}
