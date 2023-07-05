package com.jzfw.service;

import com.jzfw.bean.OrderComment;
import com.jacky.base.utils.PageVM;

public interface IOrderCommentService {
   PageVM<OrderComment> pageQuery(int page, int pageSize, String content, String status, Long orderId);

   void submit(OrderComment comment);

   void deleteById(long id);

   void check(long id, String status);
}
