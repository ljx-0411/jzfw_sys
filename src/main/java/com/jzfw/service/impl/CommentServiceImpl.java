package com.jzfw.service.impl;

import com.jzfw.bean.Comment;
import com.jzfw.bean.extend.CommentExtend;
import com.jzfw.dao.CommentMapper;
import com.jzfw.service.ICommentService;
import com.jacky.base.utils.PageVM;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements ICommentService {
   @Autowired
   private CommentMapper commentMapper;
   @Autowired
   private com.jzfw.dao.extend.CommentExtendMapper CommentExtendMapper;

   public PageVM<CommentExtend> pageQuery(int page, int pageSize, String keywords) {
      if (keywords != null) {
         keywords = "%" + keywords + "%";
      }

      List<CommentExtend> list = this.CommentExtendMapper.pageQuery(page, pageSize, keywords);
      long total = this.CommentExtendMapper.count(keywords);
      PageVM<CommentExtend> pageVM = new PageVM(page, pageSize, total, list);
      return pageVM;
   }

   public void saveOrUpdate(Comment comment) throws Exception {
      if (comment.getId() != null) {
         this.commentMapper.updateByPrimaryKey(comment);
      } else {
         comment.setCommentTime((new Date()).getTime());
         comment.setStatus("未审核");
         this.commentMapper.insert(comment);
      }

   }

   public void deleteById(long id) throws Exception {
      this.commentMapper.deleteByPrimaryKey(id);
   }

   public void batchDelete(long[] ids) throws Exception {
      if (ids != null && ids.length > 0) {
         long[] var2 = ids;
         int var3 = ids.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            long id = var2[var4];
            this.commentMapper.deleteByPrimaryKey(id);
         }

      } else {
         throw new Exception("参数异常");
      }
   }

   public void checkComment(long id, String status) throws Exception {
      Comment comment = this.commentMapper.selectByPrimaryKey(id);
      if (comment != null) {
         if (comment.getStatus().equals("未审核")) {
            comment.setStatus(status);
            this.commentMapper.updateByPrimaryKey(comment);
         } else {
            throw new Exception("不能重复审核");
         }
      } else {
         throw new Exception("评论不存在");
      }
   }
}
