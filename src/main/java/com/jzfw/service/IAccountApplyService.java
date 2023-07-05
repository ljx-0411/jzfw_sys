package com.jzfw.service;

import com.jzfw.bean.AccountApply;
import com.jacky.base.utils.PageVM;

public interface IAccountApplyService {
   void revoke(long id);

   void submit(AccountApply accountApply);

   PageVM<AccountApply> pageQuery(int page, int pageSize, String status, String applyType, Long userId, Long beginTime, Long endTime);

   void check(long id, String statusNopass, String reason);
}
