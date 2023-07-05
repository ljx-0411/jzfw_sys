package com.jzfw.dao.extend;

import com.jzfw.bean.AccountSystem;
import java.util.List;

public interface AccountSystemExtendMapper {
   List<AccountSystem> pageQuery(int page, int pageSize, String status, String type, Long beginTime, Long endTime);

   long count(String status, String type, Long beginTime, Long endTime);
}
