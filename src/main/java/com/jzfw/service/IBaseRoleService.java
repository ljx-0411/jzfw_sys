package com.jzfw.service;

import com.jzfw.bean.BaseRole;
import com.jzfw.bean.extend.BaseRoleExtend;
import com.jacky.base.utils.CustomerException;
import java.util.List;

public interface IBaseRoleService {
   void authorization(long roleId, List<Long> privilegeIds);

   List<BaseRole> findAll();

   List<BaseRoleExtend> cascadePrivilegeFindAll();

   void saveOrUpdate(BaseRole baseRole) throws CustomerException;

   void deleteById(long id) throws CustomerException;
}
