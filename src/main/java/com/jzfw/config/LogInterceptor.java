package com.jzfw.config;

import com.jzfw.bean.BaseLog;
import com.jzfw.bean.extend.BaseUserExtend;
import com.jzfw.service.IBaseLogService;
import com.jzfw.service.IBaseUserService;
import com.jacky.base.utils.JwtTokenUtil;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LogInterceptor extends HandlerInterceptorAdapter {
   @Autowired
   private IBaseUserService baseUserService;
   @Autowired
   private IBaseLogService logService;

   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      String token = request.getHeader("Authorization");
      if (token != null) {
         long id = Long.parseLong(JwtTokenUtil.getUserId(token, "MDk4ZjZiY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2I0ZjY="));
         BaseUserExtend user = this.baseUserService.findById(id);
         String uri = request.getRequestURI();
         String method = request.getMethod();
         if (!uri.contains("Query") && !uri.contains("find")) {
            String realname = user.getRealname();
            BaseLog log = new BaseLog();
            log.setRealname(realname);
            log.setMethod(method);
            log.setContent(uri);
            log.setLogTime((new Date()).getTime());
            this.logService.save(log);
         }
      }

      return super.preHandle(request, response, handler);
   }
}
