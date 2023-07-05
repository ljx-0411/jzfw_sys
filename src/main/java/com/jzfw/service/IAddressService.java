package com.jzfw.service;

import com.jzfw.bean.Address;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;

public interface IAddressService {
   PageVM<Address> pageQuery(int page, int pageSize, Long userId);

   void saveOrUpdate(Address address) throws CustomerException;

   void deleteById(long id) throws CustomerException;
}
