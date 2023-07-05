package com.jzfw.config;

import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import com.jacky.base.utils.PermissionException;
import com.jacky.base.utils.UnAuthorizedException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {
   @ExceptionHandler({Exception.class})
   public <E> Message handler(Exception exception) {
      exception.printStackTrace();
      if (exception instanceof CustomerException) {
         if (exception instanceof PermissionException) {
            return MessageUtil.forbidden("权限不足");
         } else {
            return exception instanceof UnAuthorizedException ? MessageUtil.unAuthorized(exception.getMessage()) : MessageUtil.error(exception.getMessage());
         }
      } else {
         return exception instanceof DataIntegrityViolationException ? MessageUtil.error("该数据暂时不允许删除！请先删除与当前数据关联的其他数据") : MessageUtil.error("后台接口异常！");
      }
   }
}
