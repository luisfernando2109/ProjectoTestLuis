package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01 {
	@Test
	public void exampleTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../exampleSelenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.falabella.com/falabella-cl/");
		WebElement inicia = driver.findElement(By.xpath("(//*[@class ='fb-masthead-login__user-info__logged'])"));
		inicia.click();
		WebElement iniciasesion = driver.findElement(By.xpath("(//*[@class ='fb-btn fb-btn-primary'])"));
		iniciasesion.click();
		WebElement nameuser = driver.findElement(By.id("inputEmail"));
		nameuser.sendKeys("luis2109@cantv.net");
		WebElement password = driver.findElement(By.id("loginPassword"));
		password.sendKeys("luis15343026");
		WebElement ingresapass = driver.findElement(By.id("loginClick"));
		ingresapass.click();
		WebElement search = driver.findElement(By.id("searchQuestionSolr"));
		search.sendKeys("6624471");
		search.submit();
		WebElement addcart = driver.findElement(By.xpath("(//*[@class ='fb-btn fb-btn-primary fb-product-cta__controls--actions--choose full-width-btn'])"));
	    addcart.click();
	    Thread.sleep(5000);
	    WebElement seecart = driver.findElement(By.xpath("(//*[@class='fb-btn fb-btn-primary fb-added-to-basket__cta fb-added-to-basket__cta--basket'])[2]"));
	    seecart.click();
	    WebElement buybutton = driver.findElement(By.xpath("(//*[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase'])"));
	    buybutton.click();
	    
	 
	    
	    
		
		
		
		
		
		
		//WebElement bolsa = driver.findElement(By.xpath("(//*[@class='fb-masthead-basket__icon icon-bag-green'])"));
		//bolsa.click();
		
	}
}
