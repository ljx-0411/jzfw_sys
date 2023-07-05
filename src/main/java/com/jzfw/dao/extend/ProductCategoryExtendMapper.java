package com.jzfw.dao.extend;

import com.jzfw.bean.ProductCategory;
import java.util.List;

public interface ProductCategoryExtendMapper {
   List<ProductCategory> pageQuery(int page, int pageSize, String name);

   long count(String name);
}
