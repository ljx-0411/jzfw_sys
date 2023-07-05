package com.jzfw.service.impl;

import com.jzfw.bean.BaseConfig;
import com.jzfw.bean.BaseConfigExample;
import com.jzfw.dao.BaseConfigMapper;
import com.jzfw.service.IBaseConfigService;
import com.jacky.base.utils.CustomerException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseConfigServiceImpl implements IBaseConfigService {
   @Autowired
   private BaseConfigMapper baseConfigMapper;

   public void saveOrUpdate(BaseConfig config) {
      if (config.getId() == null) {
         BaseConfig db_config = this.findByKey(config.getName());
         if (db_config != null) {
            throw new CustomerException("key值重复");
         }

         this.baseConfigMapper.insert(config);
      } else {
         this.baseConfigMapper.updateByPrimaryKey(config);
      }

   }

   public void deleteById(long id) {
      this.baseConfigMapper.deleteByPrimaryKey(id);
   }

   public List<BaseConfig> findAll() {
      List<BaseConfig> list = this.baseConfigMapper.selectByExample(new BaseConfigExample());
      return list;
   }

   public BaseConfig findByKey(String name) {
      BaseConfigExample example = new BaseConfigExample();
      example.createCriteria().andNameEqualTo(name);
      List<BaseConfig> list = this.baseConfigMapper.selectByExample(example);
      return list.size() > 0 ? (BaseConfig)list.get(0) : null;
   }
}
