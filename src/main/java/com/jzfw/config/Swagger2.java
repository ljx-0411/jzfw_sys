package com.jzfw.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
   @Bean
   public Docket createRestApi() {
      return (new Docket(DocumentationType.SWAGGER_2)).apiInfo(this.apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.jzfw.controller")).paths(PathSelectors.any()).build().securitySchemes(Lists.newArrayList(new ApiKey[]{this.apiKey()}));
   }

   private ApiInfo apiInfo() {
      return (new ApiInfoBuilder()).title("家政服务小程序及预约系统接口文档").description("前端需求实现接口提供").termsOfServiceUrl("http://www.baidu.com").version("1.0").build();
   }

   private ApiKey apiKey() {
      return new ApiKey("Authorization", "Authorization", "header");
   }
}
