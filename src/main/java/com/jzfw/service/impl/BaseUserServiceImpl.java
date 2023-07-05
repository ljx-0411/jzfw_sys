package com.jzfw.service.impl;

import com.jzfw.bean.BaseRole;
import com.jzfw.bean.BaseUser;
import com.jzfw.bean.BaseUserExample;
import com.jzfw.bean.BaseUserRole;
import com.jzfw.bean.BaseUserRoleExample;
import com.jzfw.bean.extend.BaseUserExtend;
import com.jzfw.dao.BaseRoleMapper;
import com.jzfw.dao.BaseUserMapper;
import com.jzfw.dao.BaseUserRoleMapper;
import com.jzfw.dao.extend.BaseUserExtendMapper;
import com.jzfw.service.IBaseUserService;
import com.jzfw.vm.UserVM;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BaseUserServiceImpl implements IBaseUserService {
   @Resource
   private BaseUserExtendMapper baseUserExtendMapper;
   @Resource
   private BaseUserMapper baseUserMapper;
   @Resource
   private BaseUserRoleMapper baseUserRoleMapper;
   @Resource
   private BaseRoleMapper baseRoleMapper;

   public PageVM<BaseUser> pageQuery(int page, int pageSize, String username, Long roleId, String status) {
      List<BaseUser> list = this.baseUserExtendMapper.query(page, pageSize, username, roleId, status);
      long total = this.baseUserExtendMapper.count(username, roleId, status);
      PageVM<BaseUser> pageVM = new PageVM(page, pageSize, total, list);
      return pageVM;
   }

   public BaseUser login(UserVM userVM) throws CustomerException {
      BaseUserExample example = new BaseUserExample();
      example.createCriteria().andUsernameEqualTo(userVM.getUsername());
      List<BaseUser> list = this.baseUserMapper.selectByExample(example);
      if (list.size() <= 0) {
         throw new CustomerException("该用户不存在");
      } else {
         BaseUser user = (BaseUser)list.get(0);
         if (!user.getPassword().equals(userVM.getPassword())) {
            throw new CustomerException("密码错误");
         } else {
            return user;
         }
      }
   }

   public BaseUserExtend findById(long id) {
      return this.baseUserExtendMapper.selectById(id);
   }

   public List<BaseUser> findAll() {
      return this.baseUserMapper.selectByExample(new BaseUserExample());
   }

   public List<BaseUserExtend> cascadeRoleFindAll() {
      return this.baseUserExtendMapper.selectAll();
   }

   private BaseUser findByTelephone(String telephone) {
      BaseUserExample example = new BaseUserExample();
      example.createCriteria().andTelephoneEqualTo(telephone);
      List<BaseUser> list = this.baseUserMapper.selectByExample(example);
      return list.size() > 0 ? (BaseUser)list.get(0) : null;
   }

   private BaseUser findByUsername(String username) {
      BaseUserExample example = new BaseUserExample();
      example.createCriteria().andUsernameEqualTo(username);
      List<BaseUser> list = this.baseUserMapper.selectByExample(example);
      return list.size() > 0 ? (BaseUser)list.get(0) : null;
   }

   public void saveOrUpdate(BaseUser baseUser) throws CustomerException {
      if (baseUser.getId() != null) {
         this.baseUserMapper.updateByPrimaryKey(baseUser);
      } else {
         if (baseUser.getTelephone() != null && this.findByTelephone(baseUser.getTelephone()) != null) {
            throw new CustomerException("手机号重复！");
         }

         if (baseUser.getUsername() != null && this.findByUsername(baseUser.getUsername()) != null) {
            throw new CustomerException("用户名重复！");
         }

         baseUser.setNation("汉");
         baseUser.setCertificationStatus("未认证");
         baseUser.setBalance(0.0D);
         baseUser.setUserFace("http://121.199.29.84:8888/group1/M00/00/12/rBD-SV-Td6-Aawn0AACq962TS9c719.jpg");
         baseUser.setRegisterTime((new Date()).getTime());
         baseUser.setStatus("正常");
         this.baseUserMapper.insert(baseUser);
      }

   }

   public void changeStatus(long id, String status) throws CustomerException {
      BaseUser user = this.findById(id);
      if (user == null) {
         throw new CustomerException("该用户不存在");
      } else {
         user.setStatus(status);
         this.baseUserMapper.updateByPrimaryKey(user);
      }
   }

   public void deleteById(long id) throws CustomerException {
      BaseUser user = this.findById(id);
      if (user == null) {
         throw new CustomerException("该用户不存在");
      } else {
         this.baseUserMapper.deleteByPrimaryKey(id);
      }
   }

   public void setRoles(long id, List<Long> roles) {
      BaseUserRoleExample example = new BaseUserRoleExample();
      example.createCriteria().andUserIdEqualTo(id);
      List<BaseUserRole> list = this.baseUserRoleMapper.selectByExample(example);
      List<Long> oldRoles = new ArrayList();
      Iterator iterator = list.iterator();

      while(iterator.hasNext()) {
         oldRoles.add(((BaseUserRole)iterator.next()).getRoleId());
      }

      Iterator var8 = roles.iterator();

      while(var8.hasNext()) {
         Long roleId = (Long)var8.next();
         if (!oldRoles.contains(roleId)) {
            BaseUserRole userRole = new BaseUserRole();
            userRole.setRoleId(roleId);
            userRole.setUserId(id);
            this.baseUserRoleMapper.insert(userRole);
         }
      }

      var8 = list.iterator();

      while(var8.hasNext()) {
         BaseUserRole userRole = (BaseUserRole)var8.next();
         if (!roles.contains(userRole.getRoleId())) {
            this.baseUserRoleMapper.deleteByPrimaryKey(userRole.getId());
         }
      }

   }

   public List<BaseUser> findByClazzId(long clazzId) {
      BaseUserExample example = new BaseUserExample();
      return this.baseUserMapper.selectByExample(example);
   }

   public void batchInsert(List<BaseUser> list) throws CustomerException {
      Iterator var2 = list.iterator();

      while(var2.hasNext()) {
         BaseUser u = (BaseUser)var2.next();
         this.saveOrUpdate(u);
         BaseUserRole ur = new BaseUserRole();
         ur.setUserId(u.getId());
         ur.setRoleId(6L);
         this.baseUserRoleMapper.insert(ur);
      }

   }

   public void addUserWidthRole(BaseUser user, long roleId) throws CustomerException {
      BaseRole role = this.baseRoleMapper.selectByPrimaryKey(roleId);
      if (role == null) {
         throw new CustomerException("角色不存在");
      } else {
         this.saveOrUpdate(user);
         BaseUserRole ur = new BaseUserRole();
         ur.setUserId(user.getId());
         ur.setRoleId(roleId);
         this.baseUserRoleMapper.insert(ur);
      }
   }

   public void alterUserface(Long id, String userface) throws CustomerException {
      BaseUser user = this.baseUserMapper.selectByPrimaryKey(id);
      if (user == null) {
         throw new CustomerException("用户信息不存在");
      } else {
         user.setUserFace(userface);
         this.baseUserMapper.updateByPrimaryKey(user);
      }
   }

   public void register(BaseUser u, long roleId) {
      this.saveOrUpdate(u);
      BaseUserRole ur = new BaseUserRole();
      ur.setUserId(u.getId());
      ur.setRoleId(roleId);
      this.baseUserRoleMapper.insert(ur);
   }
}
