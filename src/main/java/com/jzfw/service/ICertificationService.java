package com.jzfw.service;

import com.jzfw.bean.CertificationApply;
import com.jacky.base.utils.PageVM;

public interface ICertificationService {
   void revoke(long id);

   void submit(CertificationApply certificationApply);

   PageVM<CertificationApply> pageQuery(int page, int pageSize, String status, Long userId, Long beginTime, Long endTime);

   void check(long id, String statusNopass, String reason);
}
