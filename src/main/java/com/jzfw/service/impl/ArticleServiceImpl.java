package com.jzfw.service.impl;

import com.jzfw.bean.Article;
import com.jzfw.bean.ArticleExample;
import com.jzfw.bean.extend.ArticleExtend;
import com.jzfw.dao.ArticleMapper;
import com.jzfw.dao.extend.ArticleExtendMapper;
import com.jzfw.service.IArticleService;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements IArticleService {
   @Resource
   private ArticleMapper articleMapper;
   @Resource
   private ArticleExtendMapper articleExtendMapper;

   public List<Article> findAll() {
      return this.articleMapper.selectByExample(new ArticleExample());
   }

   public List<ArticleExtend> cascadeFindAll() {
      return this.articleExtendMapper.selectAll();
   }

   public ArticleExtend readArticle(long id) {
      Article a = this.articleMapper.selectByPrimaryKey(id);
      if (a == null) {
         throw new CustomerException("资讯信息不存在");
      } else {
         if (a.getReadTimes() == null) {
            a.setReadTimes(1L);
         } else {
            a.setReadTimes(1L + a.getReadTimes());
         }

         this.articleMapper.updateByPrimaryKey(a);
         ArticleExtend article = this.articleExtendMapper.selectById(id);
         return article;
      }
   }

   public ArticleExtend findById(long id) {
      return this.articleExtendMapper.selectById(id);
   }

   public void saveOrUpdate(Article article) throws CustomerException {
      if (article.getId() != null) {
         Article dbArticle = this.articleMapper.selectByPrimaryKey(article.getId());
         if (dbArticle == null) {
            throw new CustomerException("要修改的数据不存在");
         }

         dbArticle.setTitle(article.getTitle());
         dbArticle.setContent(article.getContent());
         dbArticle.setCategoryId(article.getCategoryId());
         dbArticle.setPublishTime((new Date()).getTime());
         this.articleMapper.updateByPrimaryKey(dbArticle);
      } else {
         ArticleExample example = new ArticleExample();
         example.createCriteria().andTitleEqualTo(article.getTitle());
         List<Article> articles = this.articleMapper.selectByExample(example);
         if (articles.size() > 0) {
            throw new CustomerException("标题不能重复");
         }

         article.setPublishTime((new Date()).getTime());
         article.setStatus("未审核");
         article.setThumpUp(0L);
         article.setReadTimes(0L);
         this.articleMapper.insert(article);
      }

   }

   public PageVM<ArticleExtend> pageQuery(int page, int pageSize, String title, String status, Long authorId, Long categoryId) {
      List<ArticleExtend> list = this.articleExtendMapper.query(page, pageSize, title, status, authorId, categoryId);
      long total = this.articleExtendMapper.count(title, status, authorId, categoryId);
      return new PageVM(page, pageSize, total, list);
   }

   public void deleteById(long id) throws CustomerException {
      Article article = this.articleMapper.selectByPrimaryKey(id);
      if (article == null) {
         throw new CustomerException("要删除的数据不存在");
      } else {
         this.articleMapper.deleteByPrimaryKey(id);
      }
   }

   public PageVM<ArticleExtend> findAllRecommend(int page, int pageSize) {
      List<ArticleExtend> list = this.articleExtendMapper.findAllRecommend(page, pageSize);
      long total = this.articleExtendMapper.countRecommend();
      return new PageVM(page, pageSize, total, list);
   }

   public void changeStatus(long id, String status) throws CustomerException {
      ArticleExtend artile = this.findById(id);
      if (artile == null) {
         throw new CustomerException("该风采不存在");
      } else {
         artile.setStatus(status);
         this.articleMapper.updateByPrimaryKey(artile);
      }
   }

   public void thumbUp(@NotNull long id) {
      ArticleExtend article = this.findById(id);
      if (article == null) {
         throw new CustomerException("该资讯不存在");
      } else {
         article.setThumpUp(article.getThumpUp() + 1L);
         this.articleMapper.updateByPrimaryKey(article);
      }
   }
}
