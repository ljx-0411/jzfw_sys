package com.jzfw.service;

import com.jzfw.bean.BaseConfig;
import java.util.List;

public interface IBaseConfigService {
   void saveOrUpdate(BaseConfig baseConfig);

   void deleteById(long id);

   List<BaseConfig> findAll();

   BaseConfig findByKey(String name);
}
