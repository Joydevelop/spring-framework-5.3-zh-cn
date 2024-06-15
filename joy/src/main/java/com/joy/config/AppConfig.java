package com.joy.config;

import com.joy.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author Joy
 * FilterType分为：
 * 1. ANNOTATION：表示是否包含某个注解
 * 2. ASSIGNABLE_TYPE：表示是否是某个类
 * 3. ASPECTJ：表示否是符合某个Aspectj表达式
 * 4. REGEX：表示是否符合某个正则表达式
 * 5. CUSTOM：自定义
 */
@ComponentScan(value = "com.joy", includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = UserService.class)})
public class AppConfig {

}
