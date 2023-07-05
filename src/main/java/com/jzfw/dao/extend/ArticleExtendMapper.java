package com.jzfw.dao.extend;

import com.jzfw.bean.extend.ArticleExtend;

import java.util.List;

public interface ArticleExtendMapper {
   List<ArticleExtend> selectAll();

   ArticleExtend selectById(long id);

   List<ArticleExtend> query(int page, int pageSize, String title, String status, Long authorId, Long categoryId);

   long count(String title, String status, Long authorId, Long categoryId);

   List<ArticleExtend> findAllRecommend(int page, int pageSize);

   long countRecommend();
}
