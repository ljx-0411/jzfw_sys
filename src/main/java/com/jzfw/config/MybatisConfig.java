package com.jzfw.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.jzfw.dao"})
public class MybatisConfig {
}
