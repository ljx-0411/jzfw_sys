package com.jzfw.dao.extend;

import com.jzfw.bean.BaseLog;
import java.util.List;

public interface BaseLogExtendMapper {
   List<BaseLog> pageQuery(int page, int pageSize);

   long count();
}
