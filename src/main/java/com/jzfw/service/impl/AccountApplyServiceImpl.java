package com.jzfw.service.impl;

import com.jzfw.bean.AccountApply;
import com.jzfw.dao.AccountApplyMapper;
import com.jzfw.dao.extend.AccountApplyExtendMapper;
import com.jzfw.service.IAccountApplyService;
import com.jzfw.service.IAccountService;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountApplyServiceImpl implements IAccountApplyService {
   @Autowired
   private AccountApplyMapper accountApplyMapper;
   @Autowired
   private AccountApplyExtendMapper accountApplyExtendMapper;
   @Autowired
   private IAccountService accountService;

   public void revoke(long id) {
      AccountApply apply = this.accountApplyMapper.selectByPrimaryKey(id);
      if (apply.getStatus().equals("未审核")) {
         this.accountApplyMapper.deleteByPrimaryKey(id);
      } else {
         throw new CustomerException("实名认证申请状态不合法，不允许删除");
      }
   }

   public void submit(AccountApply accountApply) {
      accountApply.setApplyTime((new Date()).getTime());
      accountApply.setStatus("未审核");
      this.accountApplyMapper.insert(accountApply);
   }

   public PageVM<AccountApply> pageQuery(int page, int pageSize, String status, String applyType, Long userId, Long beginTime, Long endTime) {
      List<AccountApply> list = this.accountApplyExtendMapper.pageQuery(page, pageSize, status, applyType, userId, beginTime, endTime);
      long total = this.accountApplyExtendMapper.count(status, applyType, userId, beginTime, endTime);
      return new PageVM(page, pageSize, total, list);
   }

   @Transactional
   public void check(long id, String status, String reason) {
      AccountApply apply = this.accountApplyMapper.selectByPrimaryKey(id);
      apply.setStatus(status);
      apply.setReason(reason);
      this.accountApplyMapper.updateByPrimaryKey(apply);
      byte var7 = -1;
      switch(status.hashCode()) {
      case 1180397:
         if (status.equals("通过")) {
            var7 = 0;
         }
      default:
         switch(var7) {
         case 0:
            this.accountService.withdraw(apply.getUserId(), apply.getMoney());
         default:
         }
      }
   }
}
