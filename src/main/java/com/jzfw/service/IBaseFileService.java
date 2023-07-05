package com.jzfw.service;

import com.jzfw.bean.BaseFile;
import com.jzfw.vm.Pair;
import com.jacky.base.utils.PageVM;
import java.util.List;

public interface IBaseFileService {
   List<Pair> perMonthImport();

   PageVM<BaseFile> pageQuery(int page, int pageSize, String fileName, Long datasetId, String uploadDate);

   List<BaseFile> findAll();

   void save(BaseFile baseFile) throws Exception;

   void deleteById(String id) throws Exception;
}
