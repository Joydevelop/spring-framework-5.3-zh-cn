package com.joy;

import com.joy.config.AppConfig;
import com.joy.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author Joy
 */
public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.test();
	}
}
