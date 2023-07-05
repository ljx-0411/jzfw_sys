package com.jzfw.service.impl;

import com.jzfw.bean.Address;
import com.jzfw.dao.AddressMapper;
import com.jzfw.dao.extend.AddressExtendMapper;
import com.jzfw.service.IAddressService;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements IAddressService {
   @Autowired
   private AddressMapper addressMapper;
   @Autowired
   private AddressExtendMapper addressExtendMapper;

   public PageVM<Address> pageQuery(int page, int pageSize, Long userId) {
      List<Address> list = this.addressExtendMapper.pageQuery(page, pageSize, userId);
      long total = this.addressExtendMapper.count(userId);
      return new PageVM(page, pageSize, total, list);
   }

   public void saveOrUpdate(Address address) throws CustomerException {
      if (address.getId() != null) {
         this.addressMapper.updateByPrimaryKey(address);
      } else {
         if (address.getIsDefault() == null) {
            address.setIsDefault(0);
         }

         this.addressMapper.insert(address);
      }

   }

   public void deleteById(long id) throws CustomerException {
      Address address = this.addressMapper.selectByPrimaryKey(id);
      if (address == null) {
         throw new CustomerException("要删除的产品不存在");
      } else {
         this.addressMapper.deleteByPrimaryKey(id);
      }
   }
}
