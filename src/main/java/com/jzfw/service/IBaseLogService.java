package com.jzfw.service;

import com.jzfw.bean.BaseLog;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;

public interface IBaseLogService {
   PageVM<BaseLog> pageQuery(int page, int pageSize);

   void save(BaseLog log) throws CustomerException;
}
