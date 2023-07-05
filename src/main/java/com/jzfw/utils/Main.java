package com.jzfw.utils;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.factory.Factory.Payment;
import com.alipay.easysdk.kernel.Config;
import com.alipay.easysdk.kernel.util.ResponseChecker;
import com.alipay.easysdk.payment.facetoface.models.AlipayTradePrecreateResponse;

public class Main {
   public static void main(String[] args) throws Exception {
      Factory.setOptions(getOptions());

      try {
         AlipayTradePrecreateResponse response = Payment.FaceToFace().preCreate("Apple iPhone11 128G", "2234567890", "5799.00");
         if (ResponseChecker.success(response)) {
            System.out.println("调用成功");
         } else {
            System.err.println("调用失败，原因：" + response.msg + "，" + response.subMsg);
         }

      } catch (Exception var2) {
         System.err.println("调用遭遇异常，原因：" + var2.getMessage());
         throw new RuntimeException(var2.getMessage(), var2);
      }
   }

   private static Config getOptions() {
      Config config = new Config();
      config.protocol = "https";
      config.gatewayHost = "openapi.alipaydev.com";
      config.signType = "RSA2";
      config.appId = "2021000117652166";
      config.merchantPrivateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCG3NFyhefk/sHtxU+6jy9jkcQI/SkwNuYHkhZ69GqCd25K/ZHyorKnFylk6p3/1Y6nw5WyWBPHZSBlrmHymBqWYAAYDmvUI/K5u5sGk5FmPlInMpKXHPPGdZlpTdB7CP5Uun3x1Yll94jL509WXtABBjMrZmnlXD6JPU4nGn3J6q34PygYFNwVyy81pVq8e3IY7+OklxEoayyMYirtR5QTgDnCmFEP1tr54gaKMeAJm1MZE0b5ReC2QTYqlMX5tDGFIiDNLNysg5eZYIyKB0NRfEdFxH1hVN0FSa9qL2WgDyWX6agfjfO5+DRVxBr/FDV4tCRWI9ayo6qNSeeNPe9bAgMBAAECggEAKWvvRK6OMA5zP/VnbJSH6Jwfyub+3JkwA8lB8Ffb0uCd1piVWCHSn3GEvEM3bhmIrExtUQ6uXILZ9YEfAmTnXaJ0xO7A/bJg3d0aW2W9tdqUXwewcItq8Fy0VtyYmQGFJD73aey9O71QndgYzR1n47ikxMK66cBwULSsqWQAmKBxisSx0DaZBq+51c7lfbmJM4YvI2Y/N9H+IkmgYRjPJ8ekGdAnvDrjq6YQt4NXtcf4XLIxDOzWwDSfOCCnbx090Xf14QAllx4+s3p9CmIXX1qUT6+befmpVwivFsNscPnDSisgZuKXlNQryy09L6Ji87zx7oueyluBjsgHQHa+cQKBgQDX6R35YrhJ4NBWohlRiyhQZonrEH687wnY1wgIOKkcIYNa8pir+AKhxcHKLAz4LsJosE48zdt8ks28YyCsZZIAJnwUpSZelUtUHzG4g7DuFbSsyf8B6D8Zg5yXnXxilTlC0tUy3es9BFSt8zB1gK/e2jh4J9b0Ize8dnBh94Vu8wKBgQCf5z45D+IEibKJp5GJ+sosOgFQBROaT+Amsim1tA6Zg2HW/3V1Cil15k7a8NUcPRXBsMjVOSPCetTdUCkbjYl9Mqw2FoZthAyucFy7xfHJrG+jNGLxAUru+v4XlyZswwB2UxifTUXKULZNLNsKX8+H2UeSPiCPAOM2g7IBtLon+QKBgQCDwnVSTVZdb150n/OHeb6eYhTkaGqPbei6dW8nZTx+OE1q4QUeXPluM7qxX/SCODbXoE/+dznsacI3pt63ljxk7xdlmesyaTVRHsA+886zXHenwpVmWo63SUP0mlzf5GTPTM5ifl8iG1R52yDFdETfYJh5awaYci1/S2AFyQGa1QKBgEOrAkP3mrg85VcnmImBngj1SxTn8RG+d6cogkootnz0gnUPik9LS5xfKEOy4xyeJRTgkTzaf22PuYEmqR7F2McoqIQDKEQ0O4Gefz/fVqD33g583toKqAFWKi0lg9dG9m0cYTEY7E3ftiYWs2NChHqC0qzqqbCauYyaUrwyFQ1RAoGBAK47mHWJprL9FtFsC6VooGTDeWjt6h/ZPoreAgRMFPC1I5uwussc7JLQruMHx3izg5wt0ilDWvS0LJRHnsTygzavQTFFnt+Eiz/ACmDoaeksW6x9PAFxamCXVuRILTVisnP52aY6p6EzQIjVAtsOE4sEY1e4ED9tHgyFuGc2eexT";
      config.alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvcpW8SlAoks+sdUkSn03icT8A+a7SvHpaIvQha1sfJ7ZTZMZnxqgab6CiOw6AtoFWVnpLl6d5R7YaEUO2obuGQTfL5LAMtniEptgxw8SbLJ7rmzpsHjlExFGW2TmoXHWBfvR9wWWNw/QFOy9Us2Ov+noOmzoUFJS0rtGIhHqMaSHW9bzKu/7KmrH2md8V6rDvzizs1HMNXshY7teC/wtI3l1gkDNx7cN3SCbasSh3pHW2x3jw+qflTjn/oOWtLfxi0cCvhUzeXcojifiLMJa/6zGKMjITEVJAgWvARqheZsRiRh92lX8JVHHvzWZsLU2frw3uzIGc3g+KsndG0c/vwIDAQAB";
      return config;
   }
}
