package com.jzfw.service.impl;

import com.jzfw.service.AlipayService;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class AlipayServiceImpl implements AlipayService {
   public String create(String orderId, String returnUrl) {
      return null;
   }

   public void notify(HttpServletRequest request) {
   }

   public void refund(String orderId) {
   }
}
