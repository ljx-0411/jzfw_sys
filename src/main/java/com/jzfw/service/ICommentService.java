package com.jzfw.service;

import com.jzfw.bean.Comment;
import com.jzfw.bean.extend.CommentExtend;
import com.jacky.base.utils.PageVM;

public interface ICommentService {
   void checkComment(long id, String status) throws Exception;

   PageVM<CommentExtend> pageQuery(int page, int pageSize, String keywords);

   void saveOrUpdate(Comment comment) throws Exception;

   void deleteById(long id) throws Exception;

   void batchDelete(long[] ids) throws Exception;
}
