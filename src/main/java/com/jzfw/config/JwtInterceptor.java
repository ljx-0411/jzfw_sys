package com.jzfw.config;

import com.jzfw.bean.BasePrivilege;
import com.jzfw.service.IBasePrivilegeService;
import com.jacky.base.utils.JwtTokenUtil;
import com.jacky.base.utils.PermissionException;
import com.jacky.base.utils.UnAuthorizedException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class JwtInterceptor extends HandlerInterceptorAdapter {
   @Autowired
   private IBasePrivilegeService basePrivilegeService;

   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      if (request.getMethod().equals("OPTIONS")) {
         response.setStatus(200);
         return true;
      } else {
         String token = request.getHeader("Authorization");
         if (StringUtils.isEmpty(token)) {
            throw new UnAuthorizedException("用户还未登录");
         } else {
            JwtTokenUtil.parseJWT(token, "MDk4ZjZiY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2I0ZjY=");
            return true;
         }
      }
   }

   private boolean auth(long userId, String path) {
      List<BasePrivilege> privileges = this.basePrivilegeService.findByUserId(userId);
      Iterator var5 = privileges.iterator();

      BasePrivilege p;
      do {
         if (!var5.hasNext()) {
            throw new PermissionException("权限不足");
         }

         p = (BasePrivilege)var5.next();
      } while(!p.getRoute().matches(path));

      return true;
   }
}
