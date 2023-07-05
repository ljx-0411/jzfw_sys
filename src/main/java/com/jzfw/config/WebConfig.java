package com.jzfw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
/*   @Bean
   public JwtInterceptor jwtInterceptor() {
      return new JwtInterceptor();
   }*/

   @Bean
   public LogInterceptor logInterceptor() {
      return new LogInterceptor();
   }

   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(this.logInterceptor()).addPathPatterns(new String[]{"/**"}).excludePathPatterns(new String[]{"/swagger-resources/**", "/v2/**", "/swagger-ui.html", "/webjars/**"});
      //registry.addInterceptor(this.jwtInterceptor()).addPathPatterns(new String[]{"/**"}).excludePathPatterns(new String[]{"/file/**", "/user/register", "/index/**", "/swagger-resources/**", "/v2/**", "/swagger-ui.html", "/webjars/**", "/user/login", "/user/logout", "/article/download", "/privilege/findPrivilegeTree"});
   }

   public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**").allowedOriginPatterns(new String[]{"*"}).allowedMethods(new String[]{"GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"}).allowedHeaders(new String[]{"*"}).allowCredentials(true).maxAge(3600L);
   }
}
