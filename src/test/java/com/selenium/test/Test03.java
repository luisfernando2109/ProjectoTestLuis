package com.selenium.test;

import org.testng.annotations.Test;

import com.selenium.config.BaseConfig;
import com.selenium.page.HomePage;

public class Test03 extends BaseConfig{

	@Test
	public void example03() {
		HomePage homepage = new HomePage(driver);
		homepage.searchProduct();
//		 create method new changed for git//
}
}
