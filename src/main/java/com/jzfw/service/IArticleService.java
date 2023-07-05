package com.jzfw.service;

import com.jzfw.bean.Article;
import com.jzfw.bean.extend.ArticleExtend;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.List;
import javax.validation.constraints.NotNull;

public interface IArticleService {
   List<Article> findAll();

   List<ArticleExtend> cascadeFindAll();

   ArticleExtend findById(long id);

   void saveOrUpdate(Article article) throws CustomerException;

   PageVM<ArticleExtend> pageQuery(int page, int pageSize, String title, String status, Long authorId, Long categoryId);

   void deleteById(long id) throws CustomerException;

   PageVM<ArticleExtend> findAllRecommend(int page, int pageSize);

   void changeStatus(long id, String status) throws CustomerException;

   ArticleExtend readArticle(long id) throws CustomerException;

   void thumbUp(@NotNull long id) throws CustomerException;
}
