package com.jzfw.dao.extend;

import com.jzfw.bean.BaseRole;
import com.jzfw.bean.extend.BaseRoleExtend;
import java.util.List;

public interface BaseRoleExtendMapper {
   List<BaseRole> selectByUserId(long id);

   List<BaseRoleExtend> selectAll();
}
