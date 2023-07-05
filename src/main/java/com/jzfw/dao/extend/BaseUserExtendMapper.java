package com.jzfw.dao.extend;

import com.jzfw.bean.BaseUser;
import com.jzfw.bean.extend.BaseUserExtend;
import java.util.List;

public interface BaseUserExtendMapper {
   BaseUserExtend selectById(long id);

   List<BaseUserExtend> selectAll();

   List<BaseUser> query(int page, int pageSize, String username, Long roleId, String status);

   long count(String username, Long roleId, String status);

   BaseUser findIDCard(String idCard);

   void insertPeopeleAndStu(BaseUser baseUser);
}
