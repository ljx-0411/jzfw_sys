package com.jzfw.service;

import com.jzfw.bean.BasePrivilege;
import com.jzfw.vm.PrivilegeTree;
import com.jacky.base.utils.CustomerException;
import java.util.List;

public interface IBasePrivilegeService {
   void deleteById(long id) throws CustomerException;

   List<BasePrivilege> findAll();

   List<BasePrivilege> findByParentId(Long parentId);

   void saveOrUpdate(BasePrivilege privilege) throws CustomerException;

   List<PrivilegeTree> findPrivilegeTree();

   List<BasePrivilege> findByUserId(long id);

   List<BasePrivilege> findMenuByUserId(long id);
}
