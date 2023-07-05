package com.jzfw.service.impl;

import com.jzfw.bean.BasePrivilege;
import com.jzfw.bean.BasePrivilegeExample;
import com.jzfw.dao.BasePrivilegeMapper;
import com.jzfw.dao.extend.BasePrivilegeExtendMapper;
import com.jzfw.service.IBasePrivilegeService;
import com.jzfw.vm.PrivilegeTree;
import com.jacky.base.utils.CustomerException;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BasePrivilegeServiceImpl implements IBasePrivilegeService {
   @Resource
   private BasePrivilegeMapper basePrivilegeMapper;
   @Resource
   private BasePrivilegeExtendMapper basePrivilegeExtendMapper;

   public List<BasePrivilege> findByUserId(long id) {
      return this.basePrivilegeExtendMapper.selectByUserId(id);
   }

   public List<BasePrivilege> findAll() {
      return this.basePrivilegeMapper.selectByExample(new BasePrivilegeExample());
   }

   public void saveOrUpdate(BasePrivilege privilege) throws CustomerException {
      if (privilege.getId() != null) {
         this.basePrivilegeMapper.updateByPrimaryKey(privilege);
      } else {
         this.basePrivilegeMapper.insert(privilege);
      }

   }

   public List<BasePrivilege> findByParentId(Long parentId) {
      BasePrivilegeExample example = new BasePrivilegeExample();
      if (parentId == null) {
         example.createCriteria().andParentIdIsNull();
      } else {
         example.createCriteria().andParentIdEqualTo(parentId);
      }

      return this.basePrivilegeMapper.selectByExample(example);
   }

   public List<PrivilegeTree> findPrivilegeTree() {
      return this.basePrivilegeExtendMapper.selectAll();
   }

   public List<BasePrivilege> findMenuByUserId(long id) {
      return this.basePrivilegeExtendMapper.selectMenuByUserId(id);
   }

   public void deleteById(long id) throws CustomerException {
      BasePrivilege privilege = this.basePrivilegeMapper.selectByPrimaryKey(id);
      if (privilege == null) {
         throw new CustomerException("要删除的权限信息不存在");
      } else {
         this.basePrivilegeMapper.deleteByPrimaryKey(id);
      }
   }
}
