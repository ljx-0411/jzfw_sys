package com.jzfw.service.impl;

import com.jzfw.bean.OrderComment;
import com.jzfw.dao.OrderCommentMapper;
import com.jzfw.dao.extend.OrderCommentExtendMapper;
import com.jzfw.service.IOrderCommentService;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCommentServiceImpl implements IOrderCommentService {
   @Autowired
   private OrderCommentMapper orderCommentMapper;
   @Autowired
   private OrderCommentExtendMapper orderCommentExtendMapper;

   public PageVM<OrderComment> pageQuery(int page, int pageSize, String content, String status, Long orderId) {
      List<OrderComment> list = this.orderCommentExtendMapper.pageQuery(page, pageSize, content, status, orderId);
      long total = this.orderCommentExtendMapper.count(content, status, orderId);
      return new PageVM(page, pageSize, total, list);
   }

   public void submit(OrderComment comment) {
      comment.setCommentTime((new Date()).getTime());
      comment.setStatus("未审核");
      this.orderCommentMapper.insert(comment);
   }

   public void deleteById(long id) {
      this.orderCommentMapper.deleteByPrimaryKey(id);
   }

   public void check(long id, String status) {
      OrderComment comment = this.orderCommentMapper.selectByPrimaryKey(id);
      if (comment == null) {
         throw new CustomerException("评论信息不存在");
      } else {
         comment.setStatus(status);
         this.orderCommentMapper.updateByPrimaryKey(comment);
      }
   }
}
