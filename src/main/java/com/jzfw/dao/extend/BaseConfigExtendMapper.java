package com.jzfw.dao.extend;

import com.jzfw.bean.BaseConfig;

public interface BaseConfigExtendMapper {
   BaseConfig findByKey(String name);
}
