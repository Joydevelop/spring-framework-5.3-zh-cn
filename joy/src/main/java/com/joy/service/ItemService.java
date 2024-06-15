package com.joy.service;

import javax.annotation.PostConstruct;

/**
 * @author Joy
 */
public class ItemService {

	@PostConstruct
	public void test() {
		System.out.println("ItemService test");
	}
}
