package com.jzfw.service.impl;

import com.jzfw.bean.BaseUser;
import com.jzfw.bean.CertificationApply;
import com.jzfw.dao.BaseUserMapper;
import com.jzfw.dao.CertificationApplyMapper;
import com.jzfw.dao.extend.CertificationApplyExtendMapper;
import com.jzfw.service.ICertificationService;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CertificationServiceImpl implements ICertificationService {
   @Autowired
   private CertificationApplyMapper certificationApplyMapper;
   @Autowired
   private CertificationApplyExtendMapper certificationApplyExtendMapper;
   @Autowired
   private BaseUserMapper baseUserMapper;

   public void revoke(long id) {
      CertificationApply apply = this.certificationApplyMapper.selectByPrimaryKey(id);
      if (apply.getStatus().equals("未审核")) {
         this.certificationApplyMapper.deleteByPrimaryKey(id);
      } else {
         throw new CustomerException("实名认证申请状态不合法，不允许删除");
      }
   }

   public void submit(CertificationApply certificationApply) {
      certificationApply.setApplyTime((new Date()).getTime());
      certificationApply.setStatus("未审核");
      this.certificationApplyMapper.insert(certificationApply);
   }

   public PageVM<CertificationApply> pageQuery(int page, int pageSize, String status, Long userId, Long beginTime, Long endTime) {
      List<CertificationApply> list = this.certificationApplyExtendMapper.pageQuery(page, pageSize, status, userId, beginTime, endTime);
      long total = this.certificationApplyExtendMapper.count(status, userId, beginTime, endTime);
      return new PageVM(page, pageSize, total, list);
   }

   @Transactional
   public void check(long id, String status, String reason) {
      CertificationApply apply = this.certificationApplyMapper.selectByPrimaryKey(id);
      apply.setStatus(status);
      apply.setReason(reason);
      this.certificationApplyMapper.updateByPrimaryKey(apply);
      if (status.equals("通过")) {
         BaseUser user = this.baseUserMapper.selectByPrimaryKey(apply.getUserId());
         user.setBankCard(apply.getBankCard());
         user.setBankCardPhoto(apply.getBankCardPhoto());
         user.setIdCard(apply.getIdCard());
         user.setIdcardPhotoNegative(apply.getIdcardPhotoNegative());
         user.setIdcardPhotoPositive(apply.getIdcardPhotoPositive());
         user.setRealname(apply.getRealname());
         user.setCertificationStatus("已实名认证");
         user.setCertificationTime((new Date()).getTime());
         this.baseUserMapper.updateByPrimaryKey(user);
      }

   }
}
