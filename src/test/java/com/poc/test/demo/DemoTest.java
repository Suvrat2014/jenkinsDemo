package com.poc.test.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.poc.crmbolt.HomeController;

public class DemoTest {
	
	public String test = "test";
	
	@Test
	public void test() {
		System.out.println("Jenkins Test");
	}
	
	@Test
	public void testcover() {
		HomeController homeController = new HomeController();
		assertEquals(test, homeController.testing(test));
	} 

}
