package com.jzfw.service;

import javax.servlet.http.HttpServletRequest;

public interface AlipayService {
   String create(String orderId, String returnUrl);

   void notify(HttpServletRequest request);

   void refund(String orderId);
}
