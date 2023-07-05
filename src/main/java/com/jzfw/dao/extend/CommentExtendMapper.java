package com.jzfw.dao.extend;

import com.jzfw.bean.Comment;
import com.jzfw.bean.extend.CommentExtend;
import java.util.List;

public interface CommentExtendMapper {
   List<Comment> selectByArticleId(long article_id);

   List<CommentExtend> pageQuery(int page, int pageSize, String keywords);

   long count(String keywords);
}
