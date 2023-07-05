package com.jzfw.dao.extend;

import com.jzfw.bean.Address;
import java.util.List;

public interface AddressExtendMapper {
   List<Address> pageQuery(int page, int pageSize, Long userId);

   long count(Long userId);
}
