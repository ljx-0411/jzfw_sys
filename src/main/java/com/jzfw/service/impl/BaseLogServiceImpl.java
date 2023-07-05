package com.jzfw.service.impl;

import com.jzfw.bean.BaseLog;
import com.jzfw.dao.BaseLogMapper;
import com.jzfw.dao.extend.BaseLogExtendMapper;
import com.jzfw.service.IBaseLogService;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BaseLogServiceImpl implements IBaseLogService {
   @Resource
   private BaseLogMapper baseLogMapper;
   @Resource
   private BaseLogExtendMapper baseLogExtendMapper;

   public void save(BaseLog log) throws CustomerException {
      this.baseLogMapper.insert(log);
   }

   public PageVM<BaseLog> pageQuery(int page, int pageSize) {
      List<BaseLog> list = this.baseLogExtendMapper.pageQuery(page, pageSize);
      long total = this.baseLogExtendMapper.count();
      PageVM<BaseLog> pagevm = new PageVM(page, pageSize, total, list);
      return pagevm;
   }
}
