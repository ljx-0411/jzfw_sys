package com.jzfw.dao.extend;

import com.jzfw.bean.BaseFile;
import com.jzfw.vm.Pair;
import java.util.List;

public interface BaseFileExtendMapper {
   List<BaseFile> query(int page, int pageSize, String fileName, Long datasetId, String uploadDate);

   long count(String fileName, Long datasetId, String uploadDate);

   List<Pair> perMonthImport();
}
