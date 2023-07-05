package com.jzfw.dao.extend;

import com.jzfw.bean.extend.ProductExtend;
import java.util.List;

public interface ProductExtendMapper {
   List<ProductExtend> pageQuery(int page, int pageSize, String name, String status, Long productCategoryId);

   long count(String name, String status, Long productCategoryId);
}
