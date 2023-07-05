package com.jzfw.service.impl;

import com.jzfw.bean.BaseRole;
import com.jzfw.bean.BaseRoleExample;
import com.jzfw.bean.BaseRolePrivilege;
import com.jzfw.bean.BaseRolePrivilegeExample;
import com.jzfw.bean.extend.BaseRoleExtend;
import com.jzfw.dao.BaseRoleMapper;
import com.jzfw.dao.BaseRolePrivilegeMapper;
import com.jzfw.dao.extend.BaseRoleExtendMapper;
import com.jzfw.service.IBaseRoleService;
import com.jacky.base.utils.CustomerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BaseRoleServiceImpl implements IBaseRoleService {
   @Resource
   private BaseRoleMapper baseRoleMapper;
   @Resource
   private BaseRoleExtendMapper baseRoleExtendMapper;
   @Resource
   private BaseRolePrivilegeMapper baseRolePrivilegeMapper;

   public void authorization(long roleId, List<Long> privilegeIds) {
      BaseRolePrivilegeExample example = new BaseRolePrivilegeExample();
      example.createCriteria().andRoleIdEqualTo(roleId);
      List<BaseRolePrivilege> list = this.baseRolePrivilegeMapper.selectByExample(example);
      List<Long> old_privilegeIds = new ArrayList();
      Iterator var7 = list.iterator();

      while(var7.hasNext()) {
         BaseRolePrivilege rp = (BaseRolePrivilege)var7.next();
         old_privilegeIds.add(rp.getPrivilegeId());
      }

      var7 = privilegeIds.iterator();

      while(var7.hasNext()) {
         long privilegeId = (Long)var7.next();
         if (!old_privilegeIds.contains(privilegeId)) {
            BaseRolePrivilege rp = new BaseRolePrivilege();
            rp.setRoleId(roleId);
            rp.setPrivilegeId(privilegeId);
            this.baseRolePrivilegeMapper.insert(rp);
         }
      }

      if (old_privilegeIds != null) {
         var7 = old_privilegeIds.iterator();

         while(var7.hasNext()) {
            Long privilegeId = (Long)var7.next();
            if (privilegeId != null && !privilegeIds.contains(privilegeId)) {
               example.clear();
               example.createCriteria().andRoleIdEqualTo(roleId).andPrivilegeIdEqualTo(privilegeId);
               this.baseRolePrivilegeMapper.deleteByExample(example);
            }
         }
      }

   }

   public List<BaseRole> findAll() {
      return this.baseRoleMapper.selectByExample(new BaseRoleExample());
   }

   public List<BaseRoleExtend> cascadePrivilegeFindAll() {
      return this.baseRoleExtendMapper.selectAll();
   }

   public void saveOrUpdate(BaseRole baseRole) throws CustomerException {
      if (baseRole.getId() != null) {
         this.baseRoleMapper.updateByPrimaryKey(baseRole);
      } else {
         this.baseRoleMapper.insert(baseRole);
      }

   }

   public void deleteById(long id) throws CustomerException {
      BaseRole role = this.baseRoleMapper.selectByPrimaryKey(id);
      if (role == null) {
         throw new CustomerException("要删除的角色不存在");
      } else {
         this.baseRoleMapper.deleteByPrimaryKey(id);
      }
   }
}
