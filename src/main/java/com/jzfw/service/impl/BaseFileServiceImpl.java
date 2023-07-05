package com.jzfw.service.impl;

import com.jzfw.bean.BaseFile;
import com.jzfw.bean.BaseFileExample;
import com.jzfw.dao.BaseFileMapper;
import com.jzfw.dao.extend.BaseFileExtendMapper;
import com.jzfw.service.IBaseFileService;
import com.jzfw.vm.Pair;
import com.jacky.base.utils.PageVM;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseFileServiceImpl implements IBaseFileService {
   @Autowired
   private BaseFileMapper baseFileMapper;
   @Autowired
   private BaseFileExtendMapper baseFileExtendMapper;

   public void save(BaseFile baseFile) throws Exception {
      this.baseFileMapper.insert(baseFile);
   }

   public void deleteById(String id) throws Exception {
      this.baseFileMapper.deleteByPrimaryKey(id);
   }

   public List<BaseFile> findAll() {
      return this.baseFileMapper.selectByExample(new BaseFileExample());
   }

   public PageVM<BaseFile> pageQuery(int page, int pageSize, String fileName, Long datasetId, String uploadDate) {
      List<BaseFile> list = this.baseFileExtendMapper.query(page, pageSize, fileName, datasetId, uploadDate);
      long total = this.baseFileExtendMapper.count(fileName, datasetId, uploadDate);
      PageVM<BaseFile> pageVM = new PageVM(page, pageSize, total, list);
      return pageVM;
   }

   public List<Pair> perMonthImport() {
      return this.baseFileExtendMapper.perMonthImport();
   }
}
