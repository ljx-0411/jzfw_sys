package com.jzfw.service;

import com.jzfw.bean.BaseUser;
import com.jzfw.bean.extend.BaseUserExtend;
import com.jzfw.vm.UserVM;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.List;

public interface IBaseUserService {
   void addUserWidthRole(BaseUser user, long roleId) throws CustomerException;

   PageVM<BaseUser> pageQuery(int page, int pageSize, String username, Long roleId, String status);

   void batchInsert(List<BaseUser> list) throws CustomerException;

   List<BaseUser> findByClazzId(long clazzId);

   BaseUser login(UserVM userVM) throws CustomerException;

   BaseUserExtend findById(long id);

   List<BaseUser> findAll();

   List<BaseUserExtend> cascadeRoleFindAll();

   void saveOrUpdate(BaseUser baseUser) throws CustomerException;

   void changeStatus(long id, String status) throws CustomerException;

   void deleteById(long id) throws CustomerException;

   void setRoles(long id, List<Long> roles);

   void alterUserface(Long id, String userface) throws CustomerException;

   void register(BaseUser user, long roleId);
}
