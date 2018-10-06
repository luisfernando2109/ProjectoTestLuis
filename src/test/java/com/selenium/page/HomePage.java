package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.config.BaseConfig;

public class HomePage extends BaseConfig {

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Create Element
	@FindBy(id = "searchBoxInput")
	private WebElement searchBoxInpt;
	
	//Create Element
    @FindBy(xpath = "(//div[@class = 'searchIcon_-xI-Ide9'])") 
    private WebElement searchBoxBtn;
	
	public PDPPage searchProduct() {
		searchBoxInpt.sendKeys("313923-9");
		searchBoxBtn.click();
		return new PDPPage(driver);
	}
}
